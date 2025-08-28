# - Oppgave 2: Å telle bokstaver og ord

#Oppgave 1

#Funksjon som teller antall bokstaver
def antall_bokstaver(ord):
    teller = 0
    for e in ord:
        teller += 1
    return teller
#Oppgave 2
#Funksjon som teller antall ord i setningen
def antall_ord(setning):
    #lager en ordbok
    ordbok = {}
    #gjør som at alle bokstavene små og spleiser dem til egene ord
    ord_liste = setning.lower().split()
    #kjører gjennom setningen som er sett på som en liste
    for ord in ord_liste:
        #ser om ordet er i ordboken
        if ord in ordbok:
            #legger til verdien til antall
            ordbok[ord]["antall"] += 1
        else:
            ordbok[ord] = {
                #om ordet ikke er i ordboken blir antall = 1
                #verdien "antall_bokstaver" blir da satt til verdien antall_bokstaver() retunerer
                #kaller på funksjonen og setter in ordene vi kjører gjennom
                "antall": 1,  
                "antall_bokstaver": antall_bokstaver(ord) 
            }

    return ordbok

#Spør etter input
bruker_setning = input("Skriv en setning:\n> ")
#lager variabel ordbok med funksjonen jeg har laget
ordbok = antall_ord(bruker_setning)
#teller bare hvor lang listen er
antall_ord_i_setning = len(bruker_setning.split())
#printer hvordan oppgaven vil ha det
print(f"\nDet er {antall_ord_i_setning} ord i setningen din.")

#vi har nå ordbok i en ordbok og har to nøkler for forskjellige verdier (antall,antall_bokstaver)
for ord, info in ordbok.items():
    #dette er antall ord forekommer
    antall_forekomst = info["antall"]
    #dette er antall bokstaver (jeg vet at det ikke er lurt å lage en variabel navn som er lik funksjons navn)
    antall_bokstaver = info["antall_bokstaver"]
    #ser om det er flere forekomster av et ord eller ikke endrer utskrifen bare.
    if antall_forekomst == 1:
        forekomst_tekst = "gang"
    else:
        forekomst_tekst = "ganger"
    #printer...
    print(f"Ordet '{ord}' forekommer {antall_forekomst} {forekomst_tekst}, og har {antall_bokstaver} bokstaver")
#for å ha det ryddig i terminalen
print("")
