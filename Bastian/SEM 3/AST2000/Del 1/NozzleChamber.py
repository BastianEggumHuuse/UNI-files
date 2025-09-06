# BRUKER IKKE KODEMAL!!!!
# Skrevet av Bendik Thune, med små justeringer fra Bastian Eggum Huuse

# Imports
import  numpy        as     np
import  scipy.stats  as     st
import  math         as     mt
import  matplotlib.pyplot as plt
import matplotlib.animation as animation

# AST imports
import ast2000tools.constants as const

# Importing the FuelChamber class
from FuelChamber import FuelChamber

class NozzleChamber(FuelChamber):
    def __init__(self,Length,Temp,NumParticles, length_nozzle): #Nozzle is square with sides equal to length
        super().__init__(Length,Temp,NumParticles,10**(-12))  #Using Class from fuelChamber
        
        # Noting when the "SelectPositions" Leave through the nozzle.
        self.EscapingPositions = np.zeros((1000,500,3))
        self.EscapingPositions[self.EscapingPositions == 0] = None

        self.length_nozzle = length_nozzle 
        self.Force = []
    
    def NozzleStep(self): #Finding particles that leave the nozzle
        
        Nozzle_length = self.length_nozzle/2 
        
        #Making new arrays with each dim
        x_cords = abs(self.Positions[:,0])
        y_cords = abs(self.Positions[:,1])
        z_cords = (self.Positions[:,2])    

        #Finding indexes where each dimention fills their conditions
        x_indexes = np.where(x_cords < Nozzle_length)
        y_indexes = np.where(y_cords < Nozzle_length)
        z_indexes = np.where(z_cords < -self.Length/2)

        all_indexes = np.intersect1d(np.intersect1d(x_indexes,y_indexes),z_indexes) #finds the common indexes
        Leaving_part_vel = self.Velocities[all_indexes] #saves their velocities for later use

        # Tracking which of the "SelectPositions" leave through the nozzle, so we can plot them later
        SelectIndexes = np.intersect1d(all_indexes,np.arange(0,self.NumParticles-1,int(self.NumParticles/self.NumPoints)))
        EscapeIndexes = np.rint(SelectIndexes/self.NumPoints)
        if(self.i < 1000):
            self.EscapingPositions[self.i] = self.EscapingPositions[self.i-1]
            if(len(EscapeIndexes) != 0):
                self.EscapingPositions[self.i][EscapeIndexes.astype(int)] = self.Positions[SelectIndexes]

        #Make new particles that enter from the top of the gas tank
        self.Velocities[all_indexes] = np.random.normal(loc = 0, scale = self.sigma,size = (len(all_indexes),3)) 
        self.Positions[all_indexes] = (0,0, self.Length/2 *0.95)

        # Calculating and returning leaving momentum (Derived from velocity in negative z direction) and n leaving particles
        Momentum = sum(abs(Leaving_part_vel[:,2] * self.ParticleMass))
        LeavingParticles = len(Leaving_part_vel[:,2])
        return (Momentum,LeavingParticles)

    def TimeStep(self):

        self.EulerStep()
        Momentum,LeavingParticles = self.NozzleStep()
        self.CollisionStep()

        return (Momentum,LeavingParticles)

    def TimeLoop(self):

        while self.t < self.t_max:

            self.SelectPositions[self.i] = self.Positions[0:self.NumParticles-1:int(self.NumParticles/self.NumPoints)]
            self.i += 1

            self.EulerStep()
            self.NozzleStep()
            self.CollisionStep()

            self.t += self.dt

if __name__ == "__main__":

    N = 10**5

    TestChamber = NozzleChamber(Length = 10**(-6),Temp = 3*10**3, NumParticles = N, length_nozzle = 10**(-6)*0.25)
    TestChamber.TimeLoop()

    # Plotting the movement of the particles
    relation = np.array([23,12.5]) / 4
    fig, ax = plt.subplots(subplot_kw={"projection": "3d"},figsize=(10,6))


    EscapingPoints = list(zip(*TestChamber.EscapingPositions))
    Particles = ax.plot(TestChamber.SelectPositions[0][:,0],TestChamber.SelectPositions[0][:,1],TestChamber.SelectPositions[0][:,2],".",zorder=2)[0]
    ParticlesX = ax.plot(TestChamber.EscapingPositions[0][:,0],TestChamber.EscapingPositions[0][:,1],TestChamber.EscapingPositions[0][:,2],".",color = "firebrick",zorder=1)[0]
    #ParticlesX = ax.plot(a[:,0],a[:,1],a[:,2],"x",color = "red")[0]

    Nozzle = ax.plot(
        [-TestChamber.length_nozzle/2,-TestChamber.length_nozzle/2,TestChamber.length_nozzle/2,TestChamber.length_nozzle/2,-TestChamber.length_nozzle/2],
        [-TestChamber.length_nozzle/2,TestChamber.length_nozzle/2,TestChamber.length_nozzle/2,-TestChamber.length_nozzle/2,-TestChamber.length_nozzle/2],
        [-TestChamber.Length/2,-TestChamber.Length/2,-TestChamber.Length/2,-TestChamber.Length/2,-TestChamber.Length/2],
        color = "green",
        zorder=0
    )

    def animate(i):
        Particles.set_data_3d(TestChamber.SelectPositions[i][:,0],TestChamber.SelectPositions[i][:,1],TestChamber.SelectPositions[i][:,2])
        ParticlesX.set_data_3d(TestChamber.EscapingPositions[i][:,0],TestChamber.EscapingPositions[i][:,1],TestChamber.EscapingPositions[i][:,2])

    ani = animation.FuncAnimation(
        fig, animate, 300, interval=100)

    plt.show()

    # Video saving stuff
    Writer = animation.writers['ffmpeg']
    writer = Writer(fps=15, metadata=dict(artist='Bastian Eggum Huuse'), bitrate=1800)
    ani.save('Particles.mp4', writer=writer)