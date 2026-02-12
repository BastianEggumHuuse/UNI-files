#lager klasse
class Motorsykkel:
    #lager konstruktør med instansvariablene
    def __init__(self,merke,regnr):
        self._merke = merke
        self._regnr = regnr
        self._km = 0
    #her er metodene:
    def kjor(self,km):
        #legger til km til objektet
        self._km += km

    def hent_kilometerstand(self):
        #retunerer km
        return self._km
    
    def skriv_ut(self):
        #skriver ut
        print(f"Merke: {self._merke}\nRegistreringsnummer: {self._regnr}\nKilometerstand: {self._km}")



