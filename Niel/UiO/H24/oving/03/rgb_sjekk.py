
# - 03.14 RGB-sjekker


def rgb():
    bruker = input("Gi meg en gyldig RGB-farge\n> ")
    bruker = bruker.split(" ")

    for e in bruker:
        e = int(e)
        if e < 0 or e > 255:
            print(f"{e} er ikke gyldig.")
        else:
            print("Det gikk fint.")

rgb()