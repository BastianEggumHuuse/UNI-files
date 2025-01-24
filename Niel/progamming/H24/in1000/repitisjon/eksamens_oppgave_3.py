ordbok = {
    "Rosenborg" : 4,
    "Odd" : 1,
    "Modle" : 3,
    "Brann" : 4
}

def heie(tabellplass_ordbok):
    if tabellplass_ordbok["Brann"] <= 3:
        return "Brann"
    
    for nøkkel in tabellplass_ordbok.keys():
        if tabellplass_ordbok[nøkkel] == 1:
            return nøkkel