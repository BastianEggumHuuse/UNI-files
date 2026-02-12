# - 02.03 Input og datatyper
print("")

streng = str(input("Skriv noe in: "))

heltall = int(input("Skriv et heltall: "))

flyttall = float(input("Skriv et flyttall: "))



def skriv_ut():
    print(f"Det første du skrev inn var: {streng} og typen til den var: ", type(streng))
    print(f"Det andre du skrev inn var: {heltall} og typen til den var: ", type(heltall))
    print(f"Det tredje du skrev inn var: {flyttall} og typen til den var: ", type(flyttall))
    print(f"Vi ganger heltallet med strengen: {heltall*streng}")
    print(f"Vi ganger heltallet med flyttallet: {heltall*flyttall}")
    #print(f"Vi ganger streng med flyttallet: {streng*flyttall}")
    



def flyt():
    print(f"Prøver å få flyt om til hel: {int(flyttall)}")



#skriv_ut()
flyt()

print("")