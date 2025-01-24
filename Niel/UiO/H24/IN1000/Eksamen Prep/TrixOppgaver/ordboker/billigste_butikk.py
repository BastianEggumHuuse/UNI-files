
handleliste = ["salat","melk"]

prisListe = [
    {"salat" : 12, "fisk" : 99, "melk" : 12, "brod" :12},
    {"salat" : 22, "fisk" : 60, "melk" : 18, "brod" :21},
    {"salat" : 8, "fisk" : 120, "melk" : 10, "brod" :19},
    {"salat" : 18, "fisk" : 40, "melk" : 30, "brod" :59},
    {"salat" : 15, "fisk" : 200, "melk" : 40, "brod" :9},
    ]

butikker = ["Rema1000", "Meny", "Kiwi","Spar", "Joker"]


def finnButikk(handleliste,butikker,prisListe):
    mistePris = 1000000
    butikkIndex = 0
    butikkteller = 0    

    for butikk in prisListe:
        pris = 0

        for vare in butikk:
            if vare in handleliste:
                pris += butikk[vare]

        if pris < mistePris:
            mistePris = pris
            butikkIndex = butikkteller

        butikkteller += 1

    return butikker[butikkIndex]


print(finnButikk(handleliste,butikker,prisListe))

             