from rutenett import Rutenett

class Verden:
    # Konstruktør som initialiserer verden med gitt antall rader og kolonner, og starter generasjon nummeret på 0.
    def __init__(self, rader, kolonner):
        self._rader = rader
        self._kolonner = kolonner
        self._rutenett = Rutenett(rader, kolonner)
        self._generasjonsnummer = 0

        # Fyller rutenettet med tilfeldige celler og kobler cellene til deres naboer.
        self._rutenett.fyll_med_tilfeldige_celler()
        self._rutenett.koble_celler()

    # Tegner verden ved å tegne rutenettet.
    def tegn(self):
        self._rutenett.tegn_rutenett()

    # Oppdaterer til neste generasjon ved å telle levende naboer og oppdatere cellenes status.
    def oppdatering(self):
        # Tell levende naboer for hver celle.
        for i in range(len(self._rutenett._rutenett)):
            for j in range(len(self._rutenett._rutenett[i])):
                celle = self._rutenett.hent_celle(i, j)
                celle.tell_levende_naboer()
        
        # Oppdater cellenes status basert på antall levende naboer.
        for i in range(len(self._rutenett._rutenett)):
            for j in range(len(self._rutenett._rutenett[i])):
                celle = self._rutenett.hent_celle(i, j)
                celle.oppdater_status()

        # Øk generasjonsnummeret med 1.
        self._generasjonsnummer += 1
