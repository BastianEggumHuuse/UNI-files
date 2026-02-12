# - 02.08: Kroppstemperatur

person = float(input("Hva er Kroppstemperatur? "))


if person < 36.5:
    print("du er kald.")
elif person > 37.5:
    print("hot")
else:
    print("du er mid")