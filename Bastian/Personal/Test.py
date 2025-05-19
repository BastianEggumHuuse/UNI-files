
print(6**5)

Cases = []

Dice = [1,1,1,1,1,1]

c = True
while c:

    # Checking if finished
    c = False
    for i in range(len(Dice)):
        if Dice[i] != 6:
            c = True

    # Adding to total
    Cases.append(sum(Dice))

    # Incrementing Dice
    if c:
        for i in range(len(Dice)):

            if(Dice[i] > 6):
                Dice[i+1] += 1
                Dice[i] = 1

        Dice[0] += 1

total = len(Cases)
significant = 0
for case in Cases:

    if (case > 20):
        significant += 1

print(f"S : {significant}, Total : {total}")
print(f"Ration : {significant/total}")