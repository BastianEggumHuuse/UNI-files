#busstur.py - 02.20: Busstur




def buss():

    passasjerer = 0
    s1 = int(input("\nStasjon 1! Hvor mange venter på bussen?\n> "))

    if passasjerer+s1 >= 30:
        print(f"Bussen er full. {passasjerer+s1-30} må gå til fots.")
        passasjerer = 30
    else:
        passasjerer += s1
        print(f"{s1} personer går ombord i bussen.")

    s2 = int(input("\nStasjon 2! Hvor mange venter på bussen?\n> "))

    if passasjerer+s2 >= 30:
        print(f"Bussen er full. {passasjerer+s2-30} må gå til fots.")
        passasjerer = 30
    else:
        passasjerer += s2
        print(f"{s2} personer går ombord i bussen.")

    s3 = int(input("\nStasjon 3! Hvor mange venter på bussen?\n> "))

    if passasjerer+s3 >= 30:
        print(f"Bussen er full. {passasjerer+s3-30} må gå til fots.")
        passasjerer = 30
    else:
        passasjerer += s3
        print(f"{s3} personer går ombord i bussen.")
    

    print("\nBussen er fremme med", passasjerer, "personer ombord!")

buss()