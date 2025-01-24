# - Oppgave 1: Utskrift og innlesing med variabler


#bruker print for å skrive ut hei student (bruker \n for ny linje og syns personlig det ser mer oversiktelig ut i terminalen)
print("\nHei Student\n")

#ber for brukerens navn
navn = input("Hva er navnet ditt? \n> ")
#skriver ut hei, og brukerens navn
print("Hei",navn,"\n")


#definerer begge heltalls variablene og printer det ut
x = 5
y = 10

print(x)
print(y)

dif = abs(x-y)

#finner ut differansen og bruker abs for absolutt verdi
print(f"\nDifferansen: {dif}\n")

#ber for andre navnet
navn2 = input("Gi meg et nytt navn:\n> ")

#legger dem sammen
sammen = navn + navn2
#skriver det ut i terminalen
print(sammen)
#endrer på variablen
sammen = navn + " og " + navn2
#skriver ut igjen
print(sammen)