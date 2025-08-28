def les_poeng(filnavn):
    poeng = {}

    with open(filnavn, "r") as f:
        for linje in f:
            linje = linje.strip()
            personer, point = linje.split(":")

            p = point.split(",")

            sum = 0

            for noe in p:
                tall = int(noe)
                sum += tall

            poeng[personer] = sum

    return poeng



print(les_poeng("poeng.txt"))