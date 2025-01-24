from verden import Verden

# Spør brukeren om antall rader og kolonner
rader = int(input("\nHvor mange rader vil du ha?: "))
kolonner = int(input("Hvor mange kolonner vil du ha?: "))

# skaper verdenen med variabler som antall rader og kolonner.
verden = Verden(rader, kolonner)

# Bruker tegn metoden av klassen Verden.
verden.tegn()

# Funksjon som gir muligheten til å enten fortsette til neste generasjon eller avslutte med "q".
def fortsette():
    while True:
        user = input(f'Trykk "q" for å avslutte og enter for å fortsette til neste generasjon? ')
        if user == "":
            verden.oppdatering()
            verden.tegn()
        elif user == "q":
            return

# Kall funksjonen for å starte løkken.
fortsette()