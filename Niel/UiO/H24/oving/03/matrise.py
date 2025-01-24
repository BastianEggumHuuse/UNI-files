liste_noestet = [[1,2,3],[4,5,6],[7,8,9]]

print("")
print(liste_noestet[0][0])
print(liste_noestet[1][2])
print(liste_noestet[2][1])

sum = 0
sum2 = 0

sum += liste_noestet[0][0] + liste_noestet[0][1] + liste_noestet[0][2]
sum2 += liste_noestet[0][0] + liste_noestet[1][0] + liste_noestet[2][0]

print(f"\nSum av første kolonne: {sum}")
print(f"\nSum av første rad: {sum2}\n")