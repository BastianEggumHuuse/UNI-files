import random as rd
#importerer random
class Ulv:  # Definerer klassen Ulv
    def __init__(self, navn, posisjon): 
        # Setter navnet, posisjonen og startvekten
        self._navn = navn  
        self._posisjon = posisjon  
        self._vekt = 20  

    def spis_sau(self, sau):  # Definerer metoden for å spise sau
        sau.blir_spist()  # Kaller metoden blir_spist() på sau
        self._vekt += 5  # Øker vekten med 5

    def hent_vekt(self):  # Definerer metoden for å hente vekt
        return self._vekt  # Returnerer vekten
    
    def hent_navn(self):  # Definerer metoden for å hente navn
        return self._navn  # Returnerer navnet
    
    def hent_posisjon(self):  # Definerer metoden for å hente posisjon
        return self._posisjon  # Returnerer posisjonen
    
    def beveg_hoyre(self):  # Definerer metoden for å bevege seg til høyre
        self._posisjon += 1  # Øker posisjonen med 1
        if self._posisjon > 10:  # Hvis posisjonen er over 10
            self._posisjon = 1  # Sett posisjonen til 1

    def beveg_venstre(self):  # Definerer metoden for å bevege seg til venstre
        self._posisjon -= 1  # Reduser posisjonen med 1
        if self._posisjon < 1:  # Hvis posisjonen er under 1
            self._posisjon = 10  # Sett posisjonen til 10
            
    def beveg(self):  # Definerer metoden for tilfeldig bevegelse
        random = rd.randint(0, 1)  # Generer et tilfeldig tall, 0 eller 1
        if random == 1:  # Hvis tallet er 1
            self._posisjon += 1  # Øker posisjonen med 1
        else:  # Hvis tallet er 0
            self._posisjon -= 1  # Reduser posisjonen med 1
            