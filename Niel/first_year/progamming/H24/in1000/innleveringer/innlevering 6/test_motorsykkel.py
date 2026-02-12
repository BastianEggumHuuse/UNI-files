from motorsykkel import Motorsykkel
#importerer først og da lager hoved prosedyre
def hovedprogram():
    #oppretter de 3 objektene
    sykkel = Motorsykkel("Cyberpunk","1881")
    #sjekker med assert
    assert sykkel.hent_kilometerstand() == 0
    sykkel.skriv_ut()

    sykkel1 = Motorsykkel("Cyberpunk","1881")
    assert sykkel1.hent_kilometerstand() == 0
    sykkel1.skriv_ut()

    sykkel2 = Motorsykkel("Cyberpunk","1881")
    #kalle på kjor metoden
    sykkel2.kjor(10)
    assert sykkel2.hent_kilometerstand() == 10
    sykkel2.skriv_ut()

hovedprogram()


