ordliste = ["I", "dag", "er", "jeg", "så", "lykkelig", "så", "lykkelig", "så", "lykkelig", "det", "hele", "endte", "dejligt", "jeg", "synger", "og", "er", "glad", "Ja", "alting", "endte", "lykkeligt", "så", "lykkeligt", "så", "lykkeligt", "i", "dag", "er", "jeg", "så", "lykkelig", "som", "dagen", "den", "er", "lang"]

def telle(liste):
    antall = 0
    bok = {}
    
    for ord in liste:
        antall += 1
        if ord not in bok:
            bok[ord] = 0
        bok[ord] += 1

  

    print(f"Antall ord:{antall}")
    print(f"Antall unike ord:{bok.keys()}")
    print(f"Antall lykkelig:{bok["lykkelig"]}")
    print(f"Antall så:{bok["så"]}")
    print(f"Antall dag:{bok["dag"]}")

telle(ordliste)