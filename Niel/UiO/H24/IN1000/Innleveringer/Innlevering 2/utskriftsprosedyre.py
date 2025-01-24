#lager først en prosedyre som heter utskift

def utskrift():
    #lager variabler med passene navn og spør etter input fra brukeren
    navn = input("Skriv inn navn: ")
    sted = input("Hvor kommer du fra? ")
    #Hilser brukeren i terminalen 
    print(f"Hei, {navn}! Du er fra {sted}.")

#kaller på prosedyren 3 ganger.
utskrift()
utskrift()
utskrift()

#Lurer på om det er feil å kalle dette for en funksjon?