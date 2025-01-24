#lager klasse Hund
class Hund:
    #lager konstruktør med instansvariablene
    def __init__(self,alder,vekt):
        self._alder = alder
        self._vekt = vekt
        self._metthet = 10
    #lager metoder og retunerer som oppgaven spør for
    def hent_alder(self):
        return f"Alder: {self._alder}"

    def hent_vekt(self):
        return f"Vekt: {self._vekt}"
    
    #flere metoder
    def spring(self):
        self._metthet -= 1

        if self._metthet < 5:
            self._vekt -= 1
    
    def spis(self,mat):
        self._metthet += mat

        if self._metthet > 7:
            self._vekt += 1