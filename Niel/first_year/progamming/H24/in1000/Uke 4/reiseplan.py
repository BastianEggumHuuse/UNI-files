



#Om du vil så kan du skrive inn de 15 variablene for listen om du vil.

"""
reisemaal = []
klesplagg = []
avreisedatoer = []

reiseplan = [reisemaal,klesplagg,avreisedatoer]

for e in range(5):
    maal = input("\nSkriv in reisemål:\n> ")
    reisemaal.append(maal)


for e in range(5):
    klaer = input("\nSkriv in klær:\n> ")
    klesplagg.append(klaer)


for e in range(5):
    datoer = input("\nSkriv in avreisedatoer:\n> ")
    avreisedatoer.append(datoer)


for e in range(len(reiseplan)):
    print(f"\nSkriver ut innholdet i liste nr.{e+1} i reiseplan: {reiseplan[e]}\n")

"""

#Her lagde jeg listene siden jeg orket ikke å skrive inn 15 ting bare for å teste coden.
#Du kan gjøre det om du vil. Har kommentert det ovenfor.

#Slett fra her til linje 43 om du vil skrive det inn selv.
reisemaal = ["bade","sykle","danse","trene","løpe"]
klesplagg = ["bokse","lue","sko","sokker","skjorte"]
avreisedatoer = ["1.09.24","9.09.24","12.09.24","15.09.24","16.09.24"]

#Legger til listene til reiseplan
reiseplan = [reisemaal,klesplagg,avreisedatoer]


#skriver ut hoved listene
print(f"\nHvilken av hoved listene vil du se på?\n\n1:Reisemål 2:Klesplagg 3:Avreisedatoer")
#Spør etter liste
liste_indeks1 = int(input("\nBruk nr. 1-3 : "))-1
#Sjekker om brukeren har skrevet inn en ugyldig input
if liste_indeks1 < 0 or liste_indeks1 > 2:
    print("Ugyldig input!")
else:  #Hvis ikke viser den alle variablene brukeren har lyst å se
    #lager skille linje bare fordi jeg syns det ser ryddigere ut
    print("--------------------------------")
    print(f"\n{reiseplan[liste_indeks1]}\n")
    #Spør om hva brukeren har lyst å se -1 bare for å få riktig index.(da slipper brukeren å tenke på -1 pga lister starter på index 0)
    liste_indeks2 = int(input("(Hvilken av disse vil du se?)\nBruk index 1-5: "))-1
    #Sjekker igjen om det er gyldig input.
    if liste_indeks2 < 0 or liste_indeks2 > 4:
        print("Ugyldig input!")
    else:
        print(f"\nDu valgte : {reiseplan[liste_indeks1][liste_indeks2]}\n")