hovedstadene = {
    "Norge" : "Oslo",
    "Nederland" : "Amsterdam",
    "Spania" : "Madrid"
}

sprak = {
    "Norge" : "norsk",
    "Nederland" : "nederlandsk",
    "Spania" : "spansk"
}

innbyggere = {
    "Norge" : "5391369",
    "Nederland" : "17282163",
    "Spania" : "46733038"
}



def maskin():

    bruker = str(input("Hvilket land vil du se fakta om?"))

    while bruker not in hovedstadene:
        print("Landet finnes ikke")
        bruker = str(input("Hvilket land vil du se fakta om?"))
    
    print(f"Hovedstad: {hovedstadene[bruker]}")
    print(f"Språk: {sprak[bruker]}")
    print(f"Innbyggere: {innbyggere[bruker]}")
            
         



maskin()