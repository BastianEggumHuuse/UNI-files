#Metodene må alltid ha self som parameter
class Lyspære:
    def __init__(self): #Konstruktør 
        self._på = False

    def er_på(self): #Funksjons-etode
        return self._på #Returnerer False
    
    def tenne(self):
        self._på = True #Metode

    def slukke(self):
        self._på = False #Metode

#Opprette en ny klasse 
utelys = Lyspære()
status = utelys.er_på() #Er tom fordi den har ikke noe annet enn self
utelys.tenne()
assert utelys.er_på()

print(status)