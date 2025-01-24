from random import randint
from celle import Celle

class Rutenett:
    # Konstruktøren med attributter rader, kolonner og rutenett.
    def __init__(self, rader, kolonner):
        self._ant_rader = rader
        self._ant_kolonner = kolonner
        self._rutenett = []
        self._lag_tomt_rutenett()
        
    # Lager et tomt rutenett med gitt antall rader.
    def _lag_tomt_rutenett(self):
        for _ in range(self._ant_rader):
            tom_rad = self._lag_tom_rad()
            self._rutenett.append(tom_rad)

    # Lager en tom rad med None-verdier.
    def _lag_tom_rad(self):
        tom_rad = [None] * self._ant_kolonner
        return tom_rad

    # Fyller rutenettet med tilfeldige celler som enten kan være levende eller døde.
    def fyll_med_tilfeldige_celler(self):
        for rad in range(self._ant_rader):
            for kol in range(self._ant_kolonner):
                self.lag_celle(rad, kol)

    # Lager en celle på gitt rad og kolonne, setter tilfeldig status som levende.
    def lag_celle(self, rad, kol):
        celle = Celle()
        if randint(1,3) == 1:
            celle.sett_levende()
        self._rutenett[rad][kol] = celle

    # Returnerer cellen på gitt rad og kolonne, eller None hvis det er utenfor rutenettet.
    def hent_celle(self, rad, kol):
        if rad >= 0 and kol >= 0:
            if rad < self._ant_rader and kol < self._ant_kolonner:
                return self._rutenett[rad][kol]
            else:
                return None
        else:
            return None

    # Tegner rutenettet til terminalen.
    def tegn_rutenett(self):
        # Tøm terminalen med linjeskift
        for _ in range(3):
            print()
        # Gå gjennom hver rad og kolonne i rutenettet
        for rad in self._rutenett:
            for celle in rad:
                if celle._status == "doed":
                    tegn = "."
                elif celle._status == "levende":
                    tegn = "O"
                print(tegn, end="")
            print()  # Linjeskift etter hver rad

    # Setter naboer for en gitt celle på en gitt posisjon.
    def _sett_naboer(self, rad, kol):
        koordinater = [
            (rad-1, kol),
            (rad-1, kol-1), # venstre oppe
            (rad, kol-1),
            (rad+1, kol-1), #venstre nede
            (rad+1, kol),
            (rad+1, kol+1), #høyre nede
            (rad, kol+1),
            (rad-1, kol+1)  # høyre oppe
        ]
        
        celle = self.hent_celle(rad, kol)
        for k in koordinater:
            nyCelle = self.hent_celle(k[0], k[1])
            if nyCelle is not None:
                celle.legg_til_nabo(nyCelle)

    # Koble alle celler med sine naboer.
    def koble_celler(self):
        for i in range(len(self._rutenett)):
            for j in range(len(self._rutenett[i])):
                self._sett_naboer(i, j)

    # Hent alle celler i rutenettet som en liste.
    def hent_alle_celler(self):
        liste = []
        for r in self._rutenett:
            liste += r
        return liste

    # Tell antallet levende celler i rutenettet.
    def antall_levende(self):
        antall = 0
        for i in range(len(self._rutenett)):
            for j in range(len(self._rutenett[i])):
                celle = self.hent_celle(i, j)
                if celle.er_levende():
                    antall += 1
        return antall
