# - Oppgave 1: Parametere og returverdier

#Oppgave 1

#lager funksjonen 
def adder(tall1,tall2):
    sum = tall1 + tall2
    return sum #retunerer svaret

#lager 2 variabler og kaller på funksjonen to ganger.
svar1 = adder(5,5)
svar2 = adder(10,10)

#skriver ut begge variablene
print(f"Svar 1: {svar1}\nSvar 2: {svar2}\n")


# Oppgave 2/3
#lager to inputs fra brukeren
bruker = input("Skriv inn en settning eller noe:\n> ")
bokstav = input("Skriv inn en bokstav:\n> ")
#lager funksjonen med to parametre
def tell_forekomst(min_tekst,min_bokstav):
    #teller for å telle antall ganger bokstaven kommer i teksten
    teller = 0
    #løper gjennom teksten
    for e in min_tekst:
        #sjekker om bokstaven er i den
        if min_bokstav == e:
            teller += 1 #om bokstaven er i den så plusser vi 1 på telleren
    #printer ut passende svar
    print(f"Bokstaven kommer opp {teller} mange ganger.\n")
#kaller på funksjonen og setter inn variablene som argumenter.
tell_forekomst(bruker,bokstav) 