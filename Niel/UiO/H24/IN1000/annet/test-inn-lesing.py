min_fil = open("test.txt")

maks_alder = 0
eldste_navn = ""

for linjer in min_fil:
    biter = linjer.split(":")
    navn = biter[0]
    alder = int(biter[1])

    if alder > maks_alder:
        maks_alder = alder
        eldste_navn = navn


print(eldste_navn)