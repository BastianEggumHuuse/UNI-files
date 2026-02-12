# - Fredagsfordypning uke 4

# Oppgave 1: Hente inn alder, kjønn, sivilstatus og gjeld.
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
    
    #skriver ut infoen brukeren har skrevet inn.
    print(f"\nDu er en {sivilstatus} {kjonn} på {alder} år med {gjeld} kr i gjeld.\n") 

    if betale_gjeld == True:
        print("vil betale")
    else:
        print("vil ikke betale\n")
#kaller på prosedyren
enkel_prediksjon() 