# - Oppgave 3: Prediksjon basert på tidligere betalingshistorikk

betale_gjeld = ""

def enkel_prediksjon():
    kjonn = (input("\nHvilket kjønn?\n> "))
    alder = int(input("Hvilket alder?\n> "))
    sivilstatus = input("Gift eller singel?\n> ")
    gjeld = int(input("Hvor mye gjeld har du?\n> "))

# Oppgave 2: Enkel prediksjon basert på alder, kjønn sivilstatus og gjeld
    betale_gjeld = False
    

    if kjonn == "mann" and alder < 25 and gjeld > 200000:
        betale_gjeld = False
    elif kjonn == "mann" and alder < 30 and sivilstatus == "singel" and gjeld > 100000:
        betale_gjeld = False       
    elif kjonn == "kvinne" and alder < 28 and sivilstatus == "singel" and gjeld > 300000:
        betale_gjeld = False
    else: 
        betale_gjeld = True
    

    print(f"\nDu er en {sivilstatus} {kjonn} på {alder} år med {gjeld} kr i gjeld.\n") 

    if betale_gjeld:
        print("vil betale")
        return "vil betale"
    else:
        print("vil ikke betale\n")
        return "vil ikke betale"


def prediksjon_med_betalingshistorikk(betale_gjeld):
    betalingshistorikk = []
    betalingshistorikk.append(betale_gjeld)
    # Henter inn betalingshistorikken for de forrige måneder
    for måned in ["forrige måned", "måneden før", "2 måneder siden"]:
        innbetaling = input(f"Betalingsstatus for {måned} (betalt/ikke betalt):\n> ")
        betalingshistorikk.append(innbetaling)
        
    predikt = 0
    for e in betalingshistorikk:
        if e == "vil betale":
            predikt += 1    
    if predikt < 1:
        print("\nForventer at personen betaler.\n")
    else:
        print("\nForventer at personen ikke betaler.\n")        


# Kjør enkel prediksjon og oppdater betalingshistorikken
betale_gjeld_resultat = enkel_prediksjon()

prediksjon_med_betalingshistorikk(betale_gjeld_resultat)


# Hent inn betalingshistorikken for de forrige måned ved hjelp av input (én input for hver mnd, start med forrige mnd, deretter måneden før, til slutt 2 mnd siden)
# Forventet input hver gang er enten tekststrengen betalt eller ikke_betalt
# For hver gang du leser inn betalingshistorikken for en gitt måned legger du denne i listen
# Print til slutt innholdet i listen slik at du kan se at den har blitt fyllt opp som forventet.