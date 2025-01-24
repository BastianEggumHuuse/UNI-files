# - 02.17 Kalkulator

def kalkulator():
    n1 = float(input("Første tall:"))
    op = input("Operasjon: ")
    n2 = float(input("Andre tall: "))
    

    if op == "+":
        svar = n1+n2
    elif op == "-":
        svar = n1-n2
    elif op == "*":
        svar = n1*n2
    elif op == "/":
        svar = n1/n2
    

    print(n1,op,n2,"=",svar)

    

kalkulator()