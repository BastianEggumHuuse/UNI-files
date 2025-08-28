from dato import Dato
#impoterer
def hovedprogram():
    Dawg = Dato(31,1,2077)
    #lager objekt
    lagret_dato = str(Dawg)
    #kaller metoder
    Dawg.hent_aar()
    Dawg.rar_oppgave()
    #printer
    print("Dato:", lagret_dato)
    Dawg.ny_dag()
    print(f"Neste dag: {print(Dawg)}")
    #lager en input
    bruker_dato = input("Skriv inn en ny dato (dd.mm.åååå): ")
    #Bruker kommer_foer metoden for å retunere True eller false
    if Dawg.kommer_foer(bruker_dato):
        #om det er true så skriver ut dette:
        print(f"{bruker_dato} kommer før {lagret_dato}")
    else:
        #hvis ikke:
        print(f"{bruker_dato} kommer ikke før {lagret_dato}")
#kaller på hovedprogram
hovedprogram()