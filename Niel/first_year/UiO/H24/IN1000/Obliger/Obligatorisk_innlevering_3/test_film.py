from film import Film


from film import Film

def test_film():

    # __init__
    # Opprett to film-objekter med tittel og produksjonsår du velger selv
    print("\nOppretter to filmer")
    film_1 = Film("Joker",2019)
    film_2 = Film("King Kong",2005)

    # hent_tittel
    # Skriv ut tittel på de to filmene
    print("\n# Skriver ut titler på to filmer:")
    
    print(film_1.hent_tittel())
    print(film_2.hent_tittel())

    # ny_skuespiller
    # Legg til to skuespillere og deres roller for en av filmene, skriv ut alt om filmen
    print("\n# Legger til to skuespillere:")

    film_1.ny_skuespiller("Niel","Spiderman")
    film_1.ny_skuespiller("Marius","The Green Goblin")
    film_2.ny_skuespiller("Albert","Spooderman")


    # Prøv å legge inn en av skuespillerne igjen, med en ny rolle, og sjekk at rollen ikke blir endret
    print("\n# Tester ulovlig innlegging av skuespiller")
    
    film_1.ny_skuespiller("Niel","Pederpan")
    print(film_1)
    

    # skriv_ut_film
    # Skriv ut all informasjon om begge filmer du har lagt inn
    print("\n# Skriver ut all info om to filmer:")
    
    film_1.skriv_ut_film()
    film_2.skriv_ut_film()

    # hent_alle_skuespiller_navn
    # Skriv ut skuespillernes navn for den filmen som har to
    print("\n# Henter og skriver ut alle skuespillernavn for en film:")
    print(film_1.hent_skuespiller_navn())

    
    # sjekk_periode
    # Sjekk om en film du har lagt inn er i en periode du velger
    print("\n# Sjekker at en film er i oppgitt periode")
    print(film_1.sjekk_periode(2000,2077))
    

    # Sjekk om en film er i en periode som skal gi False
    print ("\n# Sjekker at en film ikke kan være produsert før og etter samme år")
    print(film_2.sjekk_periode(2005,2005))

    # sjekk_tittel
    # Sjekk om en film har en tittel som starter på en streng som du selv velger
    print ("\n# Sjekker om starten på en films tittel kjennes igjen")
    print(film_1.sjekk_tittel("Jo"))
    
    
    # __str__
    # Skriv ut film-objekt med print
    print("\n# Skriver ut en film med print (test av __str__)")
    print(film_1)
    print()



test_film()