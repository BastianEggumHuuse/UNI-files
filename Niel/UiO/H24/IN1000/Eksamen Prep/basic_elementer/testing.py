def prosedyre(liste):
    
    bok = {}
    
    for x in liste:
        if x not in bok:
            bok[x] = 0
        bok[x] += 1
            
            
    for x in bok:
        print(f"Antall {x} : {bok[x]}")
        
        
setning = ["Flodhest", "er", "best", "ingen", "protest"]

ord = ["F", "E", "R", "S", "K", "E", "N", "B", "R", "U", "S"]

prosedyre(setning)
prosedyre(ord)