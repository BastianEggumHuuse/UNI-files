from film import Film
class Filmklubb:
    def __init__(self):
        self._filmer = []

    def les_filmer_fra_fil(self, filnavn): 
        with open(filnavn, 'r') as f:
            for line in f:
                line = line.strip()  
                tittel, aar = line.split(";") 
                film = Film(tittel, int(aar)) 
                self._filmer.append(film)
            return self._filmer

    def skriv_ut_alle_filmer(self):
        for film in self._filmer:
            print(film)
            print()

    def registrer_film(self):
        tittel = input("Skriv inn tittelen på filmen: ")
        aar = int(input("Skriv inn produksjonsåret (4-sifret): "))

        film = Film(tittel, aar)
        self._filmer.append(film)
        print(f"Filmen '{tittel}' fra {aar} er nå registrert.\n")

    def finn_film_tittel(self, tittel):
        for film in self._filmer:
            #Når du sjekker om en betingelse er sann, trenger du ikke å skrive == True fordi betingelsen i seg selv allerede utgjør en sannhetsjekk
            if film.sjekk_tittel(tittel):
                return film
        return None

    def legg_til_skuespillere(self, film):
        while True:
            navn = input("Skriv inn navnet på skuespilleren: ")
            if navn == "":
                break

            rolle = input(f"Skriv inn rollen til {navn}: ")
            film.ny_skuespiller(navn, rolle)