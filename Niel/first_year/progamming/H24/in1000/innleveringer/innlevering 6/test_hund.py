from hund import Hund
#importerer klasser fra filen
def hovedprogram():
    #lager objekte Dug 
    Dug = Hund(2, 5)
    #lager metoder og følger oppgaver
    Dug.spring()
    Dug.spis(5)
    print(Dug.hent_vekt())
    Dug.spring()
    Dug.spis(5)
    print(Dug.hent_vekt())

hovedprogram()