# - 02.16: Skatt i Ruritania

def skatt():
    inntekt = int(input(f"Tast inn din inntekt:\n> "))
    if inntekt <= 10000:
        skatt = inntekt*0.1
        print(f"Skatt: {skatt:.3f}")
    elif inntekt >= 10000:
        basis = 1000
        inntekt = inntekt-10000
        skatt = inntekt*0.3+basis
        print(f"Skatt: {skatt:.3f}")

        

skatt()


"""
 - Løsningsforslag:


inp = input("Tast inn din inntekt:\n> ")
inntekt = float(inp)

if inntekt < 10000 : 
    skatt = inntekt*0.1
else:
    skatt = 10000*0.1 + (inntekt - 10000)*0.3
print("Skatt:", skatt)


"""