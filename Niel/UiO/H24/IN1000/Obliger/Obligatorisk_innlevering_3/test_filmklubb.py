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
    #club.registrer_film()

    # Skriv ut all info om alle filmer og sjekk at ny film ble registrert
    print("# Sjekker om den nye filmen ble registrert")
    club.skriv_ut_alle_filmer()
    
        


    # finn_film_tittel
    print("# Leter etter film med (start på) usannsynlig tittel")
    # Kall på metoden med et argument som ingen titler starter med
    # Bruk print eller assert for å sjekke at resultatet er som forventet
    print(club.finn_film_tittel("Spooderman"))
    

    print("# Leter etter film med (start på) tittel 'Hidden '")
    # Kall på metoden med argument "Hidden "
    # Bruk print eller assert for å sjekke at resultatet er som forventet
    print(club.finn_film_tittel("Hidden"))
    

    # legg_til_skuespillere
    print("# Legg til skuespillere for en film" )
    # kall metoden på film-objektet du fikk returnert fra finn_film_tittel
    # (navn og rolle for to skuespillere du velger selv leses fra terminal)
    club.legg_til_skuespillere(club.finn_film_tittel("Hidden"))
    club.legg_til_skuespillere(club.finn_film_tittel("Hidden"))
    
    
    
    print("# Skriv ut all info om alle filmer og sjekk at resultatet er som forventet")
    club.skriv_ut_alle_filmer()
    

    # finn_film_periode
    # Kall på metoden med argumentene etter=2000 og før=2024
    # print("Leter ett filmer produsert etter 2000 og før 2024:")
    # Skriv ut titlene på filmer som returneres (bruk hent_tittel).
    # Kontroller at resultatene er som forventet
    
    

    # Kall på finn_film_periode med argumentene etter=2020 og før=2020
    # print("Leter etter filmer produsert etter 2020 og før 2020:")
    # Kontroller at resultatet er som forventet (tom liste) med assert (evt skriv ut)
    


    # SKriv ut all info om alle filmer og sjekk at resultatet er som forventet
    # <fyll ut>

testprogram()