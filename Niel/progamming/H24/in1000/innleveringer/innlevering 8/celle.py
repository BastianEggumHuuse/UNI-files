
class Celle:
    # Konstruktøren med attributter for status, naboer og antall levende naboer.
    def __init__(self):
        self._status = "doed"
        self._naboer = []
        self._ant_levende_naboer = 0

    # setter statusen til cellen til "doed".
    def sett_doed(self):
        self._status = "doed"

    # setter statusen til cellen til "levende".
    def sett_levende(self):
        self._status = "levende"

    # returnerer True hvis cellens status er "levende", ellers False.
    def er_levende(self):
        if self._status == "levende":
            return True
        else:
            return False

    # returnerer "O" hvis cellen er "levende", ellers returnerer ".".
    def hent_status_tegn(self):
        if self._status == "levende":
            return "O"
        else:
            return "."

    # legger til en nabo til cellens nabo-liste.
    def legg_til_nabo(self, nabo):
        self._naboer.append(nabo)

    # teller og oppdaterer antallet levende naboer rundt cellen.
    def tell_levende_naboer(self):
        self._ant_levende_naboer = 0
        for _ in self._naboer:
            if _._status == "levende":
                self._ant_levende_naboer += 1

    # oppdaterer cellens status basert oppgaveteksten
    def oppdater_status(self):
        if self.er_levende():
            if self._ant_levende_naboer < 2 or self._ant_levende_naboer > 3:
                self.sett_doed()
        else:
            if self._ant_levende_naboer == 3:
                self.sett_levende()
