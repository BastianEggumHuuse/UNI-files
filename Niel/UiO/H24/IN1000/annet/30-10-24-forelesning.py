class Sykdom:
    def __init__(self,navn):
        self._navn = navn
        self._posisjoner = []

    def legg_til_posisjoner(self,posisjon):
        self._posisjoner.append(posisjon)

    def er_assosiert(self,posisjon):
        return posisjon in self._posisjoner

    def hent_navn(self):
        return self._navn
    









# --- skal importere til annet test fil men jeg orker ikke. ---


s = Sykdom("Diabetes")
s.legg_til_posisjon(20)
s.legg_til_posisjon(10)
