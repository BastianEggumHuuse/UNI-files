def forkort(lagliste):
    return list(set(lagliste))

def forkort_lagliste(lagliste):
    ny_lagliste = []
    for lag in lagliste:
        if lag not in ny_lagliste:
            ny_lagliste.append(lag)
    return ny_lagliste


liste = ["niel","bastian","niel"]

print(forkort(liste))

print(forkort_lagliste(liste))