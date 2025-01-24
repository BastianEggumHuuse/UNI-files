

svar0 = int(input("Hva er 1 + 1? :"))
svar1 = int(input("Hva er 5 + 2? :"))
svar2 = int(input("Hva er 5 + 5? :"))

poengsum = 0

if svar0 == 2:
    poengsum += 1
if svar1 == 7:
    poengsum += 1
if svar2 == 10:
    poengsum += 1

print(f"Poengsum = {poengsum}")