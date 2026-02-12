from lag import Lag
import random
class Kamp:

    def __init__(self, hjemmelag: Lag, bortelag: Lag):
        self._hjemmelag = hjemmelag
        self._bortelag = bortelag
        self._mål_hjemme = None
        self._mål_borte = None

    def hjemmelag(self):
        return self._hjemmelag
    
    def bortelag(self):
        return self._bortelag
    
    def spill(self):
        self._mål_hjemme = random.random(0,10)
        self._mål_borte = random.random(0,10)
        
        if self._mål_hjemme > self._mål_borte:
            pass
    
    def mål_hjemme(self):
        return self._mål_hjemme

    def mål_borte(self):
        return self._mål_borte