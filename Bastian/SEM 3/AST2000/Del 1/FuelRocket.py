# IKKE BRUKT KODEMAL!!!!!!

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

class FuelRocket:

    def __init__(self,FuelMass,RocketMass,SpeedBoost,NumMotors,NumParticles = 10**5,dt = 10**(-12)):

        # Parameters
        self.FuelMass = FuelMass
        self.RocketMass = RocketMass
        self.TotalMass = FuelMass + RocketMass
        self.SpeedBoost = SpeedBoost
        self.NumMotors = NumMotors
        self.dt = dt

        # We only care about velocity
        self.Velocity = 0

        #Motor Parameters
        self.MotorLength = 10**(-6)
        self.NozzleLength = self.MotorLength * 0.25
        self.Temp = 3000
        self.NumParticles = NumParticles

        # Creating our motors
        self.Motors = []
        for i in range(self.NumMotors):
            self.Motors.append(NozzleChamber(self.MotorLength,self.Temp,self.NumParticles,self.dt,self.NozzleLength))
            print(f"Finished initializing motor n{i}")
        self.Motors = np.array(self.Motors)

        NewThrust,NewParticles = self.Motors.TimeStep()

    def TimeStep(self):

        # Collecting Thrust gained and Fuel Consumed this time step
        TotalThrust = 0
        TotalFuelConsumed = 0

        # Running all motors
        for m in self.Motors:
            NewThrust,NewParticles = m.TimeStep()
            TotalThrust += NewThrust # Thrust from current motor
            TotalFuelConsumed += NewParticles*m.ParticleMass # Fuel Consumed by current motor

        NewThrust,NewParticles = self.Motors.TimeStep()

        # Reducing the mass of the rocket
        self.FuelMass -= TotalFuelConsumed
        self.TotalMass = self.RocketMass + self.FuelMass

        # Updating the rocket's velocity
        Acceleration = TotalThrust/self.TotalMass
        self.Velocity += Acceleration * self.dt # Euler!!!!!!

        print(Acceleration,self.Velocity,self.FuelMass,TotalFuelConsumed)

    def TimeLoop(self):

        while(self.Velocity < self.SpeedBoost):
            self.TimeStep()

        
if __name__ == "__main__":

    seed = utils.get_seed('bastaeh')
    system = SolarSystem(seed)

    Escape_Velocity = ((2 *(system.masses[0]*const.m_sun)*const.G) / (system.radii[0] * 1000))**(1/2)

    TestRocket = FuelRocket(FuelMass=1000,RocketMass=100,SpeedBoost=10,NumMotors=1,NumParticles=10**6,dt=10**(-12))

    TestRocket.TimeLoop()
    print(TestRocket.FuelMass)


        

