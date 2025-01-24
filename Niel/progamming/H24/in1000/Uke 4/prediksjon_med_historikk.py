# - Oppgave 3: Prediksjon basert på tidligere betalingshistorikk



betale_gjeld = ""

# Oppgave 1: Hente inn alder, kjønn, sivilstatus og gjeld.
def enkel_prediksjon():
    kjonn = input("\nHvilket kjønn?\n> ").lower()
    alder = int(input("Hvilken alder?\n> "))
    sivilstatus = input("Gift eller singel?\n> ").lower()
    gjeld = int(input("Hvor mye gjeld har du?\n> "))

    betale_gjeld = False

# Oppgave 2: Enkel prediksjon basert på alder, kjønn sivilstatus og gjeld
    if kjonn == "mann" and alder < 25 and gjeld > 200000:
        betale_gjeld = False
    elif kjonn == "mann" and alder < 30 and sivilstatus == "singel" and gjeld > 100000:
        betale_gjeld = False       
    elif kjonn == "kvinne" and alder < 28 and sivilstatus == "singel" and gjeld > 300000:
        betale_gjeld = False
    else: 
        betale_gjeld = True

    #skriver ut infoen brukeren har skrevet inn.
    print(f"\nDu er en {sivilstatus} {kjonn} på {alder} år med {gjeld} kr i gjeld.\n") 

    #hvis if setningen over gir ut betale_gjeld = True starter if'en her
    if betale_gjeld:
        print("vil betale")
    else:
        print("vil ikke betale\n")
    #Får prosedyren til å retunere både kjønnet og gjeden
    return kjonn,gjeld

def prediksjon_med_betalingshistorikk(kjonn,gjeld):
    # Oppgave 4: Prediksjon basert på utdanningsnivå
    #lager ordbok med utdanningsnivåene som nøkler
    bok = {
        "ukjent":300000,
        "grunnskole":260000,
        "høyskole":500000,
        "universitet":700000
    }
    #input for å lese inn utdanningsnivået 
    utdanningsnivaa = input("\nUtdanningssnivå:\n> ").lower()
    
    #Skriver ut hva forventet inntekt er i boka
    print(f"\nForventet inntekt: {bok[utdanningsnivaa]}\n")

    #Lager en tom liste for å fylle med betalingshistorikken
    betalingshistorikk = []

    #Henter inn betalingshistorikken for de forrige måneder
    for måned in ["forrige måned", "måneden før", "2 måneder siden"]:
        #Spør etter betalingshistorikken ettter betalt eller ikke betalt
        innbetaling = input(f"Betalingsstatus for {måned} (betalt/ikke betalt):\n> ").lower()
        #Legger til lista
        betalingshistorikk.append(innbetaling)
    #printer lista for å se at den har blitt fyllt opp som forventet.
    print(f"\nBetaltingshistorikk:{betalingshistorikk}")

    #gjør som at sjekk existerer
    sjekk = False

    #spår “vil betale” hvis personen er mann og har forventet inntekt som er høyere enn 3 ganger gjelden.
    if kjonn == "mann" and bok[utdanningsnivaa] >= gjeld * 3:
        print("\nForventer at personen vil betale.\n")
    else:
        sjekk = True

    #lager en teller som heter predict
    predict = 0

    #Starter sjekk om betingelsen på slutt av oppgave 4 ikke er sann.
    if sjekk:
        #Løper gjennom lista for å se hvor mange "vil betale" som er inni lista.
        for e in betalingshistorikk:
            #Teller hver gang vi finner "vil betale"
            if e == "betalt":
                predict += 1    
        if predict >= 2:  # om 2/3 av betalingshistorikken som "betalt"
            print("\nForventer at personen vil betale.\n")
        else:
            print("\nForventer at personen ikke vil betale.\n")

# Kjør enkel prediksjon og oppdater betalingshistorikken
#kaller på prosedyren
kjonn, gjeld = enkel_prediksjon()
#bruker kjønn og gjeld fra enkel_prediksjon() i funksjonen under.
prediksjon_med_betalingshistorikk(kjonn, gjeld)




