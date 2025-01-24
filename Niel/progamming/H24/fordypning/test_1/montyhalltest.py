import random



print(" _________   _________    _________")
print("|         | |         |  |         |")
print("|         | |         |  |         |")
print("|__       | |__       |  |__       |")
print("|         | |         |  |         |")
print("|         | |         |  |         |")
print("|_________| |_________|  |_________|")

def spill():

    l = [0,1,2]

    bil = l[random.randint(0, 2)] # Tilfeldig heltall fra og med 0 til og med 2
    l.remove(bil)
    
    geit0 = l[random.randint(0, 1)]
    l.remove(geit0)
    geit1 = l[0]

    l = [0,1,2]

    bruker = random.randint(0,2)
    
   
    if bruker == geit0:
        l.remove(geit1)
    else:
        l.remove(geit0)

    bruker_2 = bruker

    if bruker == bil:     
        print(f"Du valgte dør nr.{bruker+1}. Vi har åpnet dør nr.{geit0+1}.")

        bruker = l[random.randint(0, 1)]
        if bruker == bil:
            print("Du vant bil.\n")
            return True, (bruker_2 == bruker)
        else:
            print("Du gjettet geit.\n")
            return False, (bruker_2 == bruker)

    elif bruker == geit0:
        print(f"Du valgte dør nr.{bruker+1}. Vi har åpnet dør nr.{geit1+1}.")

        bruker = l[random.randint(0, 1)]
        if bruker == bil:
            print("Du vant bil.\n")
            return True, (bruker_2 == bruker)
        else:
            print("Du gjettet geit.\n")
            return False, (bruker_2 == bruker)

    else:
        print(f"Du valgte dør nr.{bruker+1}. Vi har åpnet dør nr.{geit0+1}.")
        
        bruker = l[random.randint(0, 1)]
        if bruker == bil:
            print("Du vant bil.\n")
            return True, (bruker_2 == bruker)
        else:
            print("Du gjettet geit.\n")
            return False, (bruker_2 == bruker)

winsbytte = 0

winshard = 0

for e in range(0,100):
    b = spill()

    if b[0]:
        if b[1]:
            winshard += 1
        else:
            winsbytte += 1
        
print(f"Winsbytte: {winsbytte}\nWinshard: {winshard}\nTotal:{winshard+winsbytte}\n")