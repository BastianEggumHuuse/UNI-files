import random

def spill():


    bil = random.randint(0, 2) # Tilfeldig heltall fra og med 0 til og med 2

    geit0 = 0
    geit1 = 0

    if bil == 0:
        geit0 == 1
        geit1 == 2
    elif bil == 1:
        geit0 == 0
        geit1 == 2
    else:
        geit0 == 0
        geit1 == 1

    print(" _________   _________    _________")
    print("|         | |         |  |         |")
    print("|         | |         |  |         |")
    print("|__       | |__       |  |__       |")
    print("|         | |         |  |         |")
    print("|         | |         |  |         |")
    print("|_________| |_________|  |_________|")


    tries = 2
    play = True


    while tries == 0:
        play = False
        print("Du tapte")

    while tries != 0:

        bruker = int(input("\n Velg et tall fra en til tre:\n> ")) -1
        if bruker == bil:
            tries = 0
            print("Du gjettet bil\n")


        elif bruker == geit0:
            print("Du gjettet geit\n")
            tries -= 1
            
        else:
            print("Du gjettet geit\n")
            tries -= 1
    print("Du tapte")

# Åpne døra som har en geit.                 
spill()