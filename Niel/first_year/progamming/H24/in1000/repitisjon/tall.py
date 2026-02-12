import random as rd

def gjettespill():
    tall = rd.randint(1,100)
    antall_f = 0
    bruker = int(input("Gjett tallet (mellom 0-100): "))

    while tall != bruker:
            
            
            if bruker > tall:
                 antall_f += 1
                 print("for høyt")
            elif bruker < tall:
                 antall_f += 1
                 print("for lavt")

            bruker = int(input("Gjett tallet (mellom 0-100): "))
                 
    print(f"Du vant! Du brukte {antall_f} antall forsøk.")
gjettespill()