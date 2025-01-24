reisemaal = ["bade","sykle","danse","trene","løpe"]
klesplagg = ["bokse","lue","sko","sokker","skjorte"]
avreisedatoer = ["1.09.24","9.09.24","12.09.24","15.09.24","16.09.24"]

reiseplan = [reisemaal,klesplagg,avreisedatoer]



print(f"\nHvilken av hoved listene vil du se på?\nReisemål Klesplagg Avreisedatoer")

liste_indeks1 = int(input("\nBruk nr. 1-3 :"))-1
print(f"\n{reiseplan[liste_indeks1]}\n")
liste_indeks2 = int(input("(Hvilken av disse vil du se?\nBruk index 1-5: "))-1
print(f"\n{reiseplan[liste_indeks1][liste_indeks2]}\n")