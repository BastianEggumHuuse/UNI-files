# - 01.18 Største verdi (vanskelig oppgave!)


#lagde selv (enkel)


teller = 0

tall_1 = int(input("Første tall: "))
tall_2 = int(input("Andre tall: "))
tall_3 = int(input("Tredje tall: "))


if tall_1 >= tall_2 and tall_1 >= tall_3:
    print(f"Det største tallet er {tall_1}.")
    teller += 1
if tall_2 >= tall_1 and tall_2 >= tall_3:
    print(f"Det største tallet er {tall_2}.")
    teller += 1
if tall_3 >= tall_1 and tall_3 >= tall_2:
    print(f"Det største tallet er {tall_3}.")
    teller += 1




if teller == 1:
    print("1 verdi er lik den største verdi.")
else:
    print(teller, "verdier er lik den største verdi.")




