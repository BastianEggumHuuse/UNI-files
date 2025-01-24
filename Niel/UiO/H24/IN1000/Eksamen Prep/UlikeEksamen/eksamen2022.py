"""
# 1a = 3

# 1b = 15 


x=5
y=1
while x >= y:
    x = x-y
    y = y*2

print(y-x)

første

4
2

2
4

= 2

# 1d = 15 !!! riktig: 10

a = 0
total = 0
while a<4:
    a += 3
    print(f"a = {a}")
for b in range(a-1): #in range(tall) når det står 5 starter det 0,1,2,3,4 fra med 0 til 5 
    total += b
    print(f"b = {b}") 
    print (f"total: {total}")

print(total)

# 1e = 6

# 1f = 3

# 1g 

Første verdi av tall: 3
Andre verdi: 6
Tredje verdi: 12
Fjerde verdi: 11



# 2a) 
 = 4

 
# 2b)
= 4

# 2c)
= 6


# 2d)
= 6


# 2e)

= 3

"""

# 3a)

"""
def badmington(per_vil, palle_vil, espen_vil):
    
    antall = 0

    if per_vil == True:
        antall += 1
    if palle_vil == True:
        antall += 1
    if espen_vil == True:
        antall += 1

    if antall == 2:
        return True
    else:
        return False


print(badmington(True, True, False))
"""


# 3b)

def heie(tabellplass_ordbok):

    if tabellplass_ordbok["Brann"] <= 3:
        return "Brann"
    else:
        for forsteplagg in tabellplass_ordbok:
            if tabellplass_ordbok[forsteplagg] == 1:
                return forsteplagg




print(heie({"Rosenborg":4, "Odd":1, "Molde":3, "Brann":2}))
print(heie({"Rosenborg":2, "Odd":1, "Molde":3, "Brann":4}))
