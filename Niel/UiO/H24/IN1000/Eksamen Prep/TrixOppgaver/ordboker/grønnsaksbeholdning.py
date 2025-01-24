beholdning = {

}


def kjoppe():

    fortsette = True

    while fortsette:
        bruker = input("Hvilken grønnsak vil du legge til? (enter for å avslutte) ")

        if bruker == "":
            print("\nAvsluttet")
            fortsette = False
        else:
            peng = int(input("Hvor mye skal varen koste?"))
            
            beholdning[bruker] = peng

    for v,p in beholdning.items():
        print(f"Grønnsak: {v}, Pris: {p}")
              
    
    
            
            
            

    



kjoppe()
