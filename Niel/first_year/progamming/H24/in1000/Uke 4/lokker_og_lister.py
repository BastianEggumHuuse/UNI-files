# - Oppgave 3: Løkker og lister

liste0 = []
i = 0
while i < 10:
    liste0.append(i)
    i += 1
print(liste0)

liste1 = []

for e in range(10):
    # a/b) her legger jeg e til listen min og bruker e (tall) som legges til listen. For løkken trenger noe iterere seg gjennom noe (som er da 0 til 9. range(10))
    liste1.append(e)
print(liste1)

# 5/7/8)
mine_tall = []
tall = 0

while tall < 20:
    mine_tall.append(tall)
    tall += 3
print(mine_tall)

for e in range(len(mine_tall)):
    mine_tall[e] = mine_tall[e]*10
print(mine_tall)


for e in range(len(mine_tall)):
    print(f"Gydlige index: {e}")



# 6/9)
for e in mine_tall:
    print(e,"\n")


#a. Hvorfor fungerer det bare på én av måtene? - Siden noen ganger vil du bare ha lengden på listen og det vil si indexen
#b. Hva ser man i oppgave 3.8 dersom man i oppgave 3.7 valgte feil strategi
#   for hva for-løkken gikk gjennom (itererte over)? - Skjønner ikke helt spørsmålene men tror at hoved saken er at man endrer på indexene enn å bare bruke lengden på lista for å finne index..
                                                   # - Er usikker.
                                                   
