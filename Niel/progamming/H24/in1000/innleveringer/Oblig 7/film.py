class Film:
    def __init__(self,tittel,aar):
        self._tittel = str(tittel)
        self._aar = int(aar)
        self._skuespillere = {}

    # Returnerer tittelen på filmen.
    def hent_tittel(self):
        return self._tittel

    # Legger til en ny skuespiller og deres rolle hvis skuespilleren ikke allerede er lagt til.
    def ny_skuespiller(self,navn,rolle):
        if navn in self._skuespillere:
            print("Ikke lov.")
        else:
            self._skuespillere[str(navn)] = str(rolle)

    # Returnerer en liste med navnene på alle skuespillere i filmen.
    def hent_skuespiller_navn(self):
        return list(self._skuespillere.keys())

    # Skriver ut filmens tittel, år, og medvirkende skuespillere og deres roller.
    def skriv_ut_film(self):

        print(f"\n{self._tittel} ({self._aar}). Medvirkende:\n")

        if len(self._skuespillere) == 0:
            print("Ingen medvirkende.")
        else:
            for skuespiller, rolle in self._skuespillere.items():
                print(f"{skuespiller} som {rolle}\n")

    # Sjekker om filmen kom ut mellom to gitte år.
    def sjekk_periode(self,aar_1,aar_2):
        if self._aar > aar_1 and self._aar < aar_2:
            return True
        else:
            return False

    # Sjekker om filmens tittel starter med en gitt streng.
    def sjekk_tittel(self,tittel_start):
        if len(self._tittel) < len(tittel_start):
            return False

        if tittel_start == "":
            return True

        if tittel_start == self._tittel[0:len(tittel_start)]:
            return True
        else:
            return False

    # Returnerer en tekstrepresentasjon av filmen med tittel, år, og medvirkende skuespillere og deres roller.
    def __str__(self):
        streng = (f"\n{self._tittel} ({self._aar}). Medvirkende:\n")

        if len(self._skuespillere) == 0:
            streng += ("Ingen medvirkende.")
        else:
            for skuespiller, rolle in self._skuespillere.items():
                streng += (f"{skuespiller} som {rolle}\n")

        return streng
