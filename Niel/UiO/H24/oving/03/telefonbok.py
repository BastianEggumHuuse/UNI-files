# - telefonbok.py - 03.07: Enkel telefonbok


telefonbok = {
    "Arne":{"telefonnummer": 223_34_455},
    "Lisa":{"telefonnummer": 959_59_595},
    "Jonas":{"telefonnummer": 979_59_795},
    "Peder":{"telefonnummer": 123_45_678}
}

bruker = input("\nHvem sitt telefonnummer hvil du ha?\n> Arne\n> Lisa\n> Jonas\n> Peder\n\n> ")

print(f"{bruker} sitt telefonnummer er: {telefonbok[bruker]["telefonnummer"]}.")