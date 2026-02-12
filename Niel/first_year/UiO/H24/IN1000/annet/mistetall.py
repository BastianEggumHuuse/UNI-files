def minst(a,b,c):
    liste = [a,b,c]
    return min(liste)

liste = [3,1.3,2.6]
v = minst(*liste)

print(f"listen: {liste}")

print(f"minst verdi: {v}")