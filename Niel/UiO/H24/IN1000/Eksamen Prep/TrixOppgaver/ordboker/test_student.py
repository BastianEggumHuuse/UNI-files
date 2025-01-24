from student import Student

min_studentordliste = {
    "Knutlei" : Student("Knutleik", "41189390", "kleik"),
    "Kvalbein" : Student("Kvalbein", "97993678", "kbein"),
    "Kurt" : Student("Kurt", "51550095", "krt"),
}


for studenter in min_studentordliste:
    print(min_studentordliste[studenter])



def finnesStudenten(bruker,ordliste):
    for student in ordliste:
        if bruker == student:
            return True
    return False


def soke_etter_studenter(min_studentordliste):
    bruker = input("Hvilken student vil du soke etter? Eller trykk enter for å avslutte ")

    while bruker != "":
        if(finnesStudenten(bruker, min_studentordliste)):
            print(bruker + " er registrert")
            print(min_studentordliste[bruker])
        else:
            print(bruker + " er ikke registrert")

        bruker = input("Hvilken student vil du soke etter? Eller trykk enter for å avslutte ")



soke_etter_studenter(min_studentordliste)


