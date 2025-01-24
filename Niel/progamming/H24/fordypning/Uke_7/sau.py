class Sau:  # Definerer klassen Sau
    def __init__(self, navn, posisjon):  
        self._navn = navn  # Setter navnet
        self._posisjon = posisjon  # Setter posisjonen
        self._lever = True  # Setter startstatus til å være i live

    def blir_spist(self):  # Definerer metoden for å bli spist
        self._lever = False  # Setter status til ikke i live

    def lever(self):  # Definerer metoden for å sjekke om sauen lever
        if self._lever == True:  # Hvis sauen lever
            return True  # Returnerer True
        else:  # Hvis sauen ikke lever
            return False  # Returnerer False
        
    def hent_navn(self):  # Definerer metoden for å hente navn
        return self._navn  # Returnerer navnet
    
    def hent_posisjon(self):  # Definerer metoden for å hente posisjon
        return self._posisjon  # Returnerer posisjonen
