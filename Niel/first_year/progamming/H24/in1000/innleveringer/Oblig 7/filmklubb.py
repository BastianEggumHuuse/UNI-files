from film import Film

class Filmklubb:
    def __init__(self):
        self._filmer = []

    # Leser filmer fra en fil og legger dem til i listen over filmer.
    def les_filmer_fra_fil(self, filnavn): 
        with open(filnavn, 'r') as f:
            for line in f:
                line = line.strip()  
                tittel, aar = line.split(";") 
                film = Film(tittel, int(aar)) 
                self._filmer.append(film)
            return self._filmer

    # Skriver ut informasjonen om alle filmer i klubben.
    def skriv_ut_alle_filmer(self):
        for film in self._filmer:
            print(film)
    
    # Registrerer en ny film ved å få tittel og år fra brukeren og legger filmen til i listen over filmer.
    def registrer_film(self):
        tittel = input("Skriv inn tittelen på filmen: ")
        aar = int(input("Skriv inn produksjonsåret (4-sifret): "))

        film = Film(tittel, aar)
        self._filmer.append(film)
        print(f"Filmen '{tittel}' fra {aar} er nå registrert.\n")

    # Finner og returnerer en film basert på om tittelen starter med en gitt streng.
    def finn_film_tittel(self, tittel):
        for film in self._filmer:
            if film.sjekk_tittel(tittel):
                return film
        return None

    # Legger til skuespillere og deres roller i en eksisterende film.
    def legg_til_skuespillere(self, film):
        while True:
            navn = input("Skriv inn navnet på skuespilleren (trykk enter for å avslutte): ")
            if navn == "":
                break
            rolle = input(f"Skriv inn rollen til {navn}: ")
            film.ny_skuespiller(navn, rolle)

    # Finner og returnerer titlene på filmer som ble laget mellom to gitte år (ikke inkludert).
    def finn_film_periode(self, etter, før):
        filmer_i_periode = []
        for film in self._filmer:
            if etter < film._aar < før:
                filmer_i_periode.append(film._tittel)
        return filmer_i_periode
