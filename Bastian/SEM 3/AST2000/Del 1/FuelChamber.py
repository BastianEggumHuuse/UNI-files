# BRUKER IKKE KODEMAL!!!!

# Imports
import  numpy        as     np
import  scipy.stats  as     st
import  math         as     mt
# AST imports
import ast2000tools.constants as const

class FuelChamber:

    def __init__(self,Length,Temp,NumParticles):

        # Time parameters
        self.t     = 0
        self.dt    = 10**(-12)
        self.t_max = 10**(-9)

        # Chamber Parameters
        self.Length       = Length
        self.Temp         = Temp
        self.NumParticles = NumParticles
        self.ParticleMass = const.m_H2

        # Maxwell-boltzmann deviation, used for generating the particle velocities later
        self.sigma = ((self.Temp*const.k_B)/self.ParticleMass)**(1/2)
        # Method for generating a random velocity, according to the 
        self.MaxwellBoltzmann = lambda : np.random.normal(loc = 0, scale = self.sigma) 

        # Arrays we will store positions and velocities in later
        self.Positions = np.zeros((self.NumParticles,3))
        self.Velocities = np.zeros((self.NumParticles,3))

        self.SetPositionsAndVelocities()

    def SetPositionsAndVelocities(self):

        # We essentially want to tile a 3D grid (a box)
        # We tile within a slightly smaller box than the actual chamber, so no particles begin within the walls
        SmallerHalf = (self.Length * 0.95) / 2
        NumParticlesPerLine = mt.ceil((self.NumParticles)**(1/3)) # Since we want all the particles to fit within a cube, we find one side length of said cube
        SpacedPoints = np.linspace(-SmallerHalf,SmallerHalf,NumParticlesPerLine) # Linearly spacing points along previously mentioned side length

        # In the case where the total number of particles isn't a cube number, we assume that it is the closest cube number (rounded up)
        # We then fill the cube up until we have generated all positions, meaning that the cube goes partially unfinished.

        # Looping through the spaced points, nested twice, to create our cube of particles
        # This is not particularily fast, but we only need to do this once, so it's ok :)
        n = 0 # Iterator
        for i in SpacedPoints:
            for j in SpacedPoints:
                for k in SpacedPoints:
                    self.Positions[n] = np.array([i,j,k]) # Setting the position of the current particle
                    # In the flowchart, velocities and positions were generated in different loops, but its more efficient to put them both in the same loop :)
                    self.Velocities[n] = np.array([self.MaxwellBoltzmann(),self.MaxwellBoltzmann(),self.MaxwellBoltzmann()])
                    
                    n += 1
                    if(n == self.NumParticles):
                        break

                else: # This is an incredibly strange way of breaking nested loops that i found on stackoverflow
                    continue
                break # Breaking out of the second loop
            else: # It seems that python reads the for-loop as an if statement? The else only kicks in if the loop is broken, not if it just ends. Pretty cool :)
                continue
            break # Breaking out of the first loop

    def EulerStep(self,dt):
        
        # We integrate to the next timestep using the Euler method
        # Numpy lets us do this with the entire array at once!!
        self.Positions += (self.Velocities * dt)

    def CollisionStep(self):

        # Checking the collision of the entire array at once:

        CheckArray = abs(self.Positions.copy()) # Creating a purely positive clone of the positional array

        # Here we use some cool numpy tech! We go through all the elements in the array, and then through all three dimentions.
        # Then, all elements that are outside the chamber (has a position with a value higher than the chambers length halved), are set to -1
        CheckArray[CheckArray > self.Length/2] = -1 
        CheckArray[CheckArray != -1] = 1 # All other elements are set to 1

        # We then multiply the velocity array with the checkarray, which now has 1 in most places, but -1 in all positions where the particles are inside the walls
        # This means that the velocities at those positions are reversed, which is what we want to do.
        self.Velocities = self.Velocities * CheckArray

    def TimeLoop(self):

        while self.t < self.t_max:

            self.EulerStep(self.dt)
            self.CollisionStep()

            self.t += self.dt

# Runtime code
if __name__ == "__main__":
    
    N = 10*5

    TestChamber = FuelChamber(Length = 10**(-6),Temp = 3*10**3, NumParticles = N)
    TestChamber.TimeLoop()

    TotalE = 0
    for v in TestChamber.Velocities:
        V = (v[0]**2 + v[1]**2 + v[2]**2)**(1/2) # Getting the magnitude of the velocity
        TotalE += (1/2)*TestChamber.ParticleMass*V**2

    MeanE = TotalE/N
    print(f"Mean derived from simulation {MeanE:.5e}")
    print(f"Mean derived analyticialy {(3/2)*const.k_B*TestChamber.Temp:.5e}")
