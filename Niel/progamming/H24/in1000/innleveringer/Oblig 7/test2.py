from film import Film
from filmklubb import Filmklubb

def testprogram():
    # __init__
    # Opprett Filmklubb-objekt
    print("\n# Oppretter Filmklubb-objekt\n")
    club = Filmklubb()

    # les_filmer_fra_fil
    # Les inn filmer fra filen filmer.txt
    print("# Leser filmer fra fil")
    club.les_filmer_fra_fil("filmer.txt")

    # skriv_ut_alle_filmer
    # Skriv ut all info om alle filmer, sjekk at alt er lest fra fil
    club.skriv_ut_alle_filmer()

    # registrer_film
    print("# Registrerer ny film\n")
    # Legg inn en ny film med tittel og produksjonsår som leses fra terminal
    club.registrer_film()

    # Skriv ut all info om alle filmer og sjekk at ny film ble registrert
    print("# Sjekker om den nye filmen ble registrert")
    club.skriv_ut_alle_filmer()

    # finn_film_tittel
    print("# Leter etter film med (start på) usannsynlig tittel")
    # Kall på metoden med et argument som ingen titler starter med
    print(club.finn_film_tittel("Joker"))

    print("Leter etter film med (start på) tittel 'Hidden '")
    # Kall på metoden med argument "Hidden "
    print(club.finn_film_tittel("Hidden"))

    # legg_til_skuespillere
    print("Legg til skuespillere for en film")
    film = club.finn_film_tittel("Hidden")
    if film:
        club.legg_til_skuespillere(film)

    # Skriv ut all info om alle filmer og sjekk at resultatet er som forventet
    club.skriv_ut_alle_filmer()

    # finn_film_periode
    print("Leter etter filmer produsert etter 2000 og før 2024:")
    filmer_i_periode = club.finn_film_periode(2000, 2024)
    for film in filmer_i_periode:
        print(film.hent_tittel())

    print("Leter etter filmer produsert etter 2020 og før 2020:")
    filmer_i_periode = club.finn_film_periode(2020, 2020)
    # Kontroller at resultatet er som forventet (tom liste) med assert
    assert len(filmer_i_periode) == 0

    # Skriv ut all info om alle filmer og sjekk at resultatet er som forventet
    club.skriv_ut_alle_filmer()

testprogram()
