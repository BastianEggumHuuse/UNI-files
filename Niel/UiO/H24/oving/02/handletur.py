# - 02.18: Handletur

melk = 15
broed = 20
ost = 40
yoghurt = 12

sum = 0

print("\nHei! Velkommen til IFI-butikken.\n")
abroed = int(input("Hvor mange brød vil du ha? \n> "))
amelk = int(input("Hvor mange melk vil du ha? \n> "))
aost = int(input("Hvor mange ost vil du ha?\n >"))
ayog = int(input("Hvor mange yoghurt vil du ha?\n >"))

 
sum = melk*amelk + ost*aost + yoghurt*ayog + broed*abroed

print(f"Du skal betale: {sum} kr.\n")