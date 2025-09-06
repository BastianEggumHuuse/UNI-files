# BRUKER IKKE KODEMAL!!!!
# Skrevet av Bastian Eggum Huuse og Bendik Thune

# Imports
import  numpy        as     np
import  scipy.stats  as     st
import  math         as     mt
# AST imports
import ast2000tools.constants as const
import ast2000tools.utils as utils
# From imports
from NozzleChamber import NozzleChamber
from ast2000tools.solar_system import SolarSystem
from ast2000tools.space_mission import SpaceMission

# Ast init
seed = utils.get_seed('bmthune')
system = SolarSystem(seed)
mission = SpaceMission(seed)

class FuelRocket:

    def __init__(self,FuelMass,SpeedBoost,NumMotors,NumParticles = 10**5,dt = 10**(-3)):

        # Parameters
        self.FuelMass = FuelMass
        self.RocketMass = mission.spacecraft_mass
        self.TotalMass = FuelMass + self.RocketMass
        self.SpeedBoost = SpeedBoost
        self.NumMotors = NumMotors
        self.dt = dt
        self.t = 0

        # We only care about velocity
        self.Velocity = 0

        #Motor Parameters
        self.MotorLength = 10**(-6)
        self.NozzleLength = self.MotorLength * 0.25
        self.Temp = 3000
        self.NumParticles = NumParticles

        self.Thrust, self.FuelConsumption = self.SimulateEngine()

    def SimulateEngine(self):

        # Initializing motor
        print("Initializing motor...")
        self.Motor = NozzleChamber(self.MotorLength,self.Temp,self.NumParticles,self.NozzleLength)
        
        # looping through the motor for a small period of time to calculate
        # Fuel consumption and the force of the motor.
        t = 0
        MomentumSum = 0
        ParticleSum = 0
        while t < self.Motor.t_max:

            Momentum,LeavingParticles = self.Motor.TimeStep()
            MomentumSum += Momentum
            ParticleSum += LeavingParticles

            t += self.Motor.dt
            if(int((t/self.Motor.t_max)* 1000) % 100 == 0):
                print(f"Simulating motor: {int((t/self.Motor.t_max)*100):4}%")

        # We have N motors, so to simulate this, we multiply by NumMotors
        # We assume that all the motors operate correctly
        Force = (MomentumSum/self.Motor.t_max) * self.NumMotors
        FuelConsumption = ((ParticleSum/self.Motor.t_max) * self.Motor.ParticleMass) * self.NumMotors

        print(f"Finished Simulating {self.NumMotors} motors.")
        print(f"Calculated Force : {Force:.5e}, Calculated Fuel Consumption : {FuelConsumption:.5e}")
        return(Force,FuelConsumption)

    def TimeStep(self):

        g = -9.81

        self.Velocity += ((self.Thrust/self.TotalMass) + g) * self.dt
        self.FuelMass -= self.FuelConsumption * self.dt
        self.TotalMass = self.FuelMass + self.RocketMass
        self.t += self.dt

    def TimeLoop(self):

        while(self.Velocity < self.SpeedBoost):
            self.TimeStep()
            #break

            if(self.FuelMass <= 0):
                print("HOUSTON WE HAVE A PROBLEM.... \nBAAANG")
                break
        
if __name__ == "__main__":
    

    # Creating rocket instance
    NumMotors = (1000000**3) # 1 qube meter grid :)
    Fuel = 400000
    EscapeVelocity = ((2 *(system.masses[0]*const.m_sun)*const.G) / (system.radii[0] * 1000))**(1/2)
    Particles = 10**5

    TestRocket = FuelRocket(FuelMass=Fuel,SpeedBoost=EscapeVelocity,NumMotors=NumMotors,NumParticles=Particles)
    print("Mass",mission.system.masses[0]* const.m_sun,"Radius",mission.system.radii[0] * 1000)
    TestRocket.TimeLoop()

    print("\nThe rocket has reached escape velocity!!! (or crashed)")
    print(f"Total fuel consumed = {(Fuel - TestRocket.FuelMass):.2f} kg")