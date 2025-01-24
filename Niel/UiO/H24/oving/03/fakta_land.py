# - 03.04 Fakta om land


#hovedstad = {"Norge": "Oslo","Nederland":"Amsterdam","Spania":"Madrid"}
#spraak = {"Norge": "norsk","Nederland":"nederlandsk","Spania":"spansk"}
#innbyggere = {"Norge":5391369,"Nederland":17282163,"Spania":46733038}

ordbok = {
    "Norge": {
        "hovedstad": "Oslo",
        "spaak": "norsk",
        "innbyggere": 5391369},
    "Nederland": {
        "hovedstad": "Amsterdam",
        "spraak": "Nederlandsk",
        "innbyggere": 17282163},
    "Spania": {
            "hovedstad": "Madrid",
            "spraak": "Spansk",
            "innbyggere": 46733038},
}


bruker = input("Velg et land:\n> ")

if bruker in ordbok:
    print(f"\nHovedstaden: {ordbok[bruker]["hovedstad"]}\nSpråket: {ordbok[bruker]["spaak"]}\nAntall innbyggere: {ordbok[bruker]["innbyggere"]}\n")
else:
    print("Kjenner ikke til dette landet.")



"""
fakta = {"Norge": {
            "hovedstad": "Oslo",
            "spraak": "Norsk",
            "innbyggere": 5391369},
        "Nederland": {
            "hovedstad": "Amsterdam",
            "spraak": "Nederlandsk",
            "innbyggere": 17282163},
        "Spania": {
            "hovedstad": "Madrid",
            "spraak": "Spansk",
            "innbyggere": 46733038},
        }

land = input("Gi navnet på et land: ")

if land in fakta:
    print("Hovedstaden til", land, "er", fakta[land]["hovedstad"])
    print("I", land, "snakker folk", fakta[land]["spraak"])
    print(land, "har", fakta[land]["innbyggere"],  "innbyggere")
else:
    print("Jeg kjenner ikke dette landet!")

"""