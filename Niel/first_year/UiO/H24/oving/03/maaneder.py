# - maaneder.py - 03.03: String-liste med måneder

liste = ["januar", "februar", "mars", "april", "mai", "juni", "juli", "august", "september", "oktober", "november", "desember"]

bruker = int(input("\nHvilket måned vil du se:\n> "))

if bruker > 12 or bruker < 0:
    print("\n ikke gyldig valg")
else:
    print(f"Du valgte måneden: {liste[bruker-1]}.\n")