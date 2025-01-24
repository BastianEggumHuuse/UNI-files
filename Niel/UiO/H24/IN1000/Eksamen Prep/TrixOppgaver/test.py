liste = ["en","pluss","to","pluss","tre","er","seks"]

def prosedyre(liste):
    ny_liste = []
    for i in range(len(liste),0,-1):
        ny_liste.append(liste[i-1])

    print(ny_liste)


prosedyre(liste)
