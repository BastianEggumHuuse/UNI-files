class Bil:
    def __init__(self,eier):
        self._eier = eier

    def skriv_eier(self):
        print(self._eier)

niel = Bil("niel")

niel.skriv_eier()