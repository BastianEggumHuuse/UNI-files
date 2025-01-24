# - Oppgave 2: Beslutninger

# Spør brukerer om de har lyst på brus
bruker = input("Har du lyst på brus?:\n> ")

# etter brukerens besluttning skrives forskjellige ting ut
if bruker == "ja":
    print("Her har du en brus!")
elif bruker == "nei":
    print("Den er grei.")
else:
    print("Det forsto jeg ikke helt.")