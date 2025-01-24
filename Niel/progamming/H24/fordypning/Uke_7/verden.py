from sau import Sau  # Importerer Sau-klassen fra sau-modulen
from ulv import Ulv  # Importerer Ulv-klassen fra ulv-modulen

class Verden:  # Definerer klassen Verden
    def __init__(self):  # Konstruktør
        self._sauer = []  # Oppretter en liste for sauer
        self._ulver = []  # Oppretter en liste for ulver

    def opprett_dyr(self, type, navn, posisjon):  # Metode for å opprette dyr
        if type == "sau":  # Hvis type er sau
            ny_sau = Sau(navn, posisjon)  # Oppretter en ny Sau
            self._sauer.append(ny_sau)  # Legger sauen til listen
        elif type == "ulv":  # Hvis type er ulv
            ny_ulv = Ulv(navn, posisjon)  # Oppretter en ny Ulv
            self._ulver.append(ny_ulv)  # Legger ulven til listen

    def beskriv(self):  # Metode for å beskrive dyr i verden
        print("\nSauer:")  # Skriver ut informasjon om sauer
        for sau in self._sauer:  # Går gjennom listen av sauer
            if sau.lever():  # Sjekker om sauen lever
                print(f"Navn: {sau._navn}, Posisjon: {sau._posisjon}")  # Skriver ut navn og posisjon på sauen
        print("\nUlver:")  # Skriver ut informasjon om ulver
        for ulv in self._ulver:  # Går gjennom listen av ulver
            print(f"Navn: {ulv._navn}, Posisjon: {ulv._posisjon}")  # Skriver ut navn og posisjon på ulven

    def antall_sauer(self):  # Metode for å telle levende sauer
        levende_sauer = []  # Oppretter en liste for levende sauer
        for sau in self._sauer:  # Går gjennom listen av sauer
            if sau.lever():  # Sjekker om sauen lever
                levende_sauer.append(sau)  # Legger levende sauer til listen
        return len(levende_sauer)  # Returnerer antallet av levende sauer

    def antall_ulver(self):  # Metode for å telle ulver
        return len(self._ulver)  # Returnerer antallet av ulver

    def oppdater(self):  # Metode for å oppdatere tilstanden i verden
        for ulv in self._ulver:  # Går gjennom listen av ulver
            ulv.beveg()  # Beveger ulven
            for sau in self._sauer:  # Går gjennom listen av sauer
                if sau.lever() and ulv.hent_posisjon() == sau.hent_posisjon():  # Sjekker om noen ulver er på samme posisjon som levende sauer
                    sau.blir_spist()  # Satt sauens tilstand til "spist"
                    ulv.spis_sau(sau)  # Ulven spiser sauen, og dens vekt øker
                    print(f"\nUlven {ulv.hent_navn()} spiser sauen {sau.hent_navn()} på posisjon {ulv.hent_posisjon()}")  # Skriver ut hvem som spiser hvem

    def finn_feiteste_ulv(self):  # Metode for å finne den feiteste ulven
        bok = {}  # Oppretter en ordbok for navn og vekt
        for ulv in self._ulver:  # Går gjennom listen av ulver
            bok[ulv.hent_navn()] = ulv.hent_vekt()  # Legger til ulvens navn og vekt i ordboken

        feiteste_vekt = max(bok.values())  # Finner den maksimale vekten
        liste = []  # Oppretter en liste for de feiteste ulvene

        for ulv, vekt in bok.items():  # Går gjennom ordboken
            if vekt == feiteste_vekt:  # Sjekker hvilken/hvilke ulver har den feiteste vekten
                liste.append((ulv, vekt))  # Legger dem til listen

        if len(liste) == 1:  # Hvis det er kun en feit ulv
            print(f"\nDen feiteste Ulven: {liste[0][0]}\nMed vekten: {liste[0][1]}.\n")  # Skriver ut navnet og vekten
            return  # Returnerer
        print("\nDe feiteste Ulvene er:\n")  # Hvis det er flere ulver med samme vekt
        for x in liste:  # Går gjennom listen av feiteste ulver
            print(f"{x[0]} med vekt: {x[1]}")  # Skriver ut navn og vekt på hver av dem
        print("") # Bare får å få ekstra rom etter listen 
