barn = {"Halfdan":"Harald", "Christian":"Hans", "Harald":"Eirik"}



def arverekke(forfader, etterkommer, forstefodte):
    liste = []

    liste.append(forfader)
    neste = forstefodte[forfader]

    while neste != None:
        liste.append(neste)

        if neste == etterkommer:
            return liste
        if neste in forstefodte.keys():
            neste = forstefodte[neste]
        else:
            return liste
        
    return liste






personer = arverekke("Halfdan", "Eirik", barn)

print(personer)