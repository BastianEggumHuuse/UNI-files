

def les_bil(filnavn):
    bok = {}

    with open(filnavn, 'r') as f:
        for linje in f:
            linje = linje.strip()
            key,value = linje.split(":")
            
            bok[key] = value

    return bok
    



les_bil("bil.txt")