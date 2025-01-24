# - Oppgave 1: Regning med løkker
liste = []

skrive = True

while skrive:

    bruker = int(input(f"Skriv in tall:\n> "))
    if bruker != 0:
        liste.append(bruker)
    else:
        skrive = False

min_sum = 0
stor_sum = 0

for e in liste:
    min_sum += e
print(f"\nTotal summen er: {min_sum}")


for e in liste:
    if e > stor_sum:
        stor_sum = e
print(f"Den største summen: {stor_sum}")


for e in liste:
    if e < min_sum:
        min_sum = e
print(f"Den minste summen: {min_sum}\n")

