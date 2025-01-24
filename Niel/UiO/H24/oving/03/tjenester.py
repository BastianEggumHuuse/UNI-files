# - tjenester.py - 03.05: Objekter tilbyr tjenester

# a)
ord1 = input("\ngi meg et ord: \n> ")

ord = ord1.lower()

# b)
print(f"\nBIG: {ord.upper()}")

# c)
print(f"Lengden: {len(ord)}")

# d)
foerste = ord[0]
print(f"Første index på ordet: {foerste}")

# e)
teller = 0
for bokstav in ord:
    if foerste == bokstav:
        teller += 1

print(f"Antall bokstaver av det første indexet på ordet: {teller}\n")
