#lager funksjonene

def addisjon(x,y):
    return x+y
def subtraksjon(x,y):
    return x-y
def divisjon(x,y):
    return x/y

#bruker assert for å sjekke
assert(addisjon(5,5) == 10)
assert(addisjon(-5,-5) == -10)
assert(addisjon(5,-5) == 0)

assert(subtraksjon(5,5) == 0)
assert(subtraksjon(-5,-5) == 0)
assert(subtraksjon(5,-5) == 10)

assert(divisjon(5,5) == 1)
assert(divisjon(-5,-5) == 1)
assert(divisjon(5,-5) == -1)

#lager tommer funksjonen
def tommer_til_cm(antall_tommer):
    assert(antall_tommer > 0)
    return antall_tommer * 2.54


#prosedyren som printer alt sammen og henter in 2 inputs fra brukeren
def skriv_beregninger():
    print("Utregninger:")
    tall_1 = float(input("Skriv inn tall 1: "))
    tall_2 = float(input("Skriv inn tall 2: "))
    #kaller på funksjonene vi trenger
    print(f"Resultat av summering: {addisjon(tall_1,tall_2)}")
    print(f"Resultat av subtraksjon: {subtraksjon(tall_1,tall_2)}")
    print(f"Resultat av divisjon: {divisjon(tall_1,tall_2)}")
    print("Konvertering fra tommer til cm: ")
    tommer = float(input("Skriv inn et tall: "))
    print(f"Resultat: {tommer_til_cm(tommer)}")

#kaller på skriv_beregninger() som starter alt.
skriv_beregninger()