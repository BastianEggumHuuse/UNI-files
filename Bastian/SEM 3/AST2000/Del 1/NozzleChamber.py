# BRUKER IKKE KODEMAL!!!!

# Imports
import  numpy        as     np
import  scipy.stats  as     st
import  math         as     mt
# AST imports
import ast2000tools.constants as const

from FuelChamber import FuelChamber

class NozzleChamber(FuelChamber):
    def __init__(self,Length,Temp,NumParticles, length_nozzle): #Nozzle is square with sides equal to length
        super.__init__(self,Length,Temp,NumParticles)  #Using Class from fuelChamber
        self.length_nozzle = length_nozzle 
    
    def Nozzle(self): #Finding particles that leave the nozzle
        
        Nozzle_length = self.length_nozzle/2 
        
        #Making new arrays with each dim
        x_cords = abs(self.Positions[:,0])
        y_cords = abs(self.Positions[:,1])
        z_cords = (self.Positions[:,2])    

        #Finding indexes where each dimmensjon fills their conditions
        x_indexes = np.where(x_cords < Nozzle_length)
        y_indexes = np.where(y_cords < Nozzle_length)
        z_indexes = np.where(z_cords < -self.Length/2)

        
        all_indexes = np.intersect1d(np.intersect1d(x_indexes,y_indexes),z_indexes) #finds the common indexes
        Leaving_part_vel = self.Velocities[all_indexes] #saves their velocities for later use

        #Make new particles thaat enter from the topp of the gass tank
        self.Velocities[all_indexes] = np.random.normal(loc = 0, scale = self.sigma,size = (len(all_indexes),3)) 
        self.Positions[all_indexes] = (0,0, self.Length/2 *0.95)

        return(Leaving_part_vel) 

        



