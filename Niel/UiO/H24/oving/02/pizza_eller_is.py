# - 02.23 Is eller pizza

def spoer_is():
    kule = 30
    bruker = int(input("\nHvor mange kuler vil du ha?\n> "))
    pris = kule*bruker
    print(f"Totalprisen: {pris}")

def spoer_pizza():
    ost = 80
    bruker = input("\nHva slags pizza vil du ha?\n> ")
    if bruker == "ost":
        pris = 100
    else:
        pris = ost

    print(f"Du bestillte {bruker}'e pizza og totalprisen er: {pris}")


def spoer_spise():
    bruker = input("\nHva vil du spise?\n> ")
    if bruker == "is":
        spoer_is()
    elif bruker == "pizza":
        spoer_pizza()
    else:
        print("Vi selge ikke dette.")


spoer_spise()
