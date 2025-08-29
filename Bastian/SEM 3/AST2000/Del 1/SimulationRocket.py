# IKKE BRUKT KODEMAL!!!!!!

# Imports
import  numpy        as     np
import  scipy.stats  as     st
import  math         as     mt
import  matplotlib.pyplot as plt
# AST imports
import ast2000tools.constants as const
import ast2000tools.utils as utils
# From imports
from FuelRocket import FuelRocket
from ast2000tools.solar_system import SolarSystem
from ast2000tools.space_mission import SpaceMission

# Ast init
seed = utils.get_seed('bmthune')
system = SolarSystem(seed)
mission = SpaceMission(seed)

class SimulationRocket(FuelRocket):

    def __init__(self,FuelMass,SpeedBoost,NumMotors,NumParticles = 10**5,dt = 10**(-3),Graph = False):
        super().__init__(FuelMass,SpeedBoost,NumMotors,NumParticles,dt)

        self.PlanetMass = system.masses[0] * const.m_sun
        self.PlanetRadius = system.radii[0] * 1000
        self.GravityConstant = const.G

        r_y = self.PlanetRadius
        v_x = ((2*np.pi)/(system.rotational_periods[0] * 86400)) * r_y
        # rotational_periods[0] is given in 24 hours, so we have to turn it into seconds.
        # 86400 is the amount of seconds in 24 hours

        # Position and Velocity are now vectors!!
        self.Position = np.array([0,r_y])
        self.Velocity = np.array([v_x,0])

        # Graphing lists
        self.Graph = Graph
        self.Positions = []
        self.Velocities = []

    def TimeStep(self):

        # Calculating the total acceleration of the vessel without direction
        GravityAcceleration = -self.GravityConstant*(self.PlanetMass/(np.linalg.norm(self.Position)**2))
        ThrustAcceleration = self.Thrust/self.TotalMass
        TotalAcceleration = ThrustAcceleration + GravityAcceleration

        # Adding a direction to the acceleration
        AccelerationDirection = self.Position/np.linalg.norm(self.Position)
        AccelerationVector = TotalAcceleration * AccelerationDirection

        # Tracking stats
        if self.Graph:
            self.Positions.append(self.Position)
            self.Velocities.append(self.Velocity)

        # Eulering Velocity, Position, Fuel, and Time
        self.Velocity += AccelerationVector * self.dt
        self.Position += self.Velocity * self.dt
        self.FuelMass -= self.FuelConsumption * self.dt
        self.TotalMass = self.FuelMass + self.RocketMass
        self.t += self.dt

        # Note! Technically this rocket can exist INSIDE the planet, particularily at the beginning of the simulation
        # At the beginning the mass is (for some parameters) to high for the thrust to overtake the gravitational force,
        # causing the rocket to accelerate into the planet. This changes very little of the rest of the simulation
        # and also it's lowkey kinda funny, so we have decided not to write code to change this. 

        # Calculating new Escape velocity
        self.SpeedBoost = ((2 *(self.PlanetMass)*self.GravityConstant) / (np.linalg.norm(self.Position)))**(1/2)

        # Keeping track of how many times this method has been called
        self.counter += 1
        # Printing after an amount of loops
        if self.counter % 100000000 == 0:
            #print(f"Current Direction Vector : [x : {AccelerationDirection[0]}, y : {AccelerationDirection[1]}]")
            print(f"Current Velocity : [x : {self.Velocity[0]:.3f}, y : {self.Velocity[1]:.3f}], Current Fuel Mass : {self.FuelMass:.3f},Current time in seconds : {self.t:.1f}, Current time in minutes : {self.t/60:.1f}")

    def TimeLoop(self):


        while(np.linalg.norm(self.Velocity) < self.SpeedBoost):
            
            self.TimeStep()

            if(self.FuelMass <= 0):
                print("HOUSTON WE HAVE A PROBLEM.... \nBAAANG")
                break

if __name__ == "__main__":
    

    # Creating rocket instance
    NumMotors = (1000000**3)/30 # 1/10 qube meter grid :)
    Fuel = 400000
    Particles = 10**5
    EscapeVelocity = ((2 *(system.masses[0]*const.m_sun)*const.G) / (system.radii[0] * 1000))**(1/2)
    TrackValues = True

    TestRocket = SimulationRocket(FuelMass=Fuel,SpeedBoost=EscapeVelocity,NumMotors=NumMotors,NumParticles=Particles,Graph = TrackValues)
    TestRocket.TimeLoop()

    print(f"\nThe rocket has reached the escape velocity of {TestRocket.SpeedBoost:.2f} m/s!!! (or crashed)\n")
    
    print(f"Info time :)")
    print(f"Position post launch : {f"[x : {TestRocket.Position[0]:.2f} m, y : {TestRocket.Position[1]:.2f} m]":>40}")
    print(f"Velocity post launch : {f"[x : {TestRocket.Velocity[0]:.2f} m/s, y : {TestRocket.Velocity[1]:.2f} m/s]":>40}")
    print(f"Total time of launch : {f"[Seconds : {TestRocket.t:.1f} s, Minutes : {TestRocket.t/60:.1f} min]":>40}")
    print(f"Total Fuel Consumed  : {f"{Fuel - TestRocket.FuelMass:.2f} kg":>40}")
    print(f"Total Fuel Remaining : {f"{TestRocket.FuelMass:.2f} kg":>40}")
    print(f"Total Rocket Mass    : {f"{TestRocket.TotalMass:.2f} kg":>40}\n")

    # Plotting
    print(TestRocket.Positions)

    plt.show()
    