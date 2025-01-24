def lag_instruksjon(instruksjon, linjenummer, opperasjonskoder, merker):
    """
    Oppretter en instruksjon. Instruksjoner kan ha formene
    \<oppkode\> \<merke\>
    \<oppkode\> minneadresse
    \<oppkode\>
    Kun IO og HLT kan være tomme. Alle andre trenger en minneadresse.
    """
    opperasjon= instruksjon[0]
    assert opperasjon in opperasjonskoder, \
            f"Ugyldig opperasjon på linje {linjenummer+1}"
    
    instruksjonsverdi = opperasjonskoder[opperasjon]
    # Finner ut hvilken form instruksjonen har, og oppretter instruksjon etter det.
    if len(instruksjon) == 1:
        return instruksjonsverdi
    
    elif instruksjon[1] in merker:
        # Vi fant instruksjonen blant merkene, så vi kan hente linjenummeret ut av ordboken
        instruksjonsverdi += merker[instruksjon[1]]
    else:
        # Sjekker at instruksjonsverdien er gyldig
        min_minneverdi = 0
        maks_minneverdi = 99
        if instruksjon[0] == "dat":
            min_minneverdi = -999
            maks_minneverdi = 999
        # Henter verdien ut fra instruksjonen
        verdi = int(instruksjon[1])
        
        # Sjekker at instruksjonsverdien er gyldig 
        assert min_minneverdi <= verdi <= maks_minneverdi, \
            f"Ugyldig instruksjonsverdi {verdi} på linje {linjenummer + 1}. {min_minneverdi = } {maks_minneverdi = }"
        instruksjonsverdi += verdi 
    return instruksjonsverdi

def lag_merker(programfil, opperasjonskoder):
    merker = {}
    with open(programfil) as program:
        linjeteller = 0
        for linje in program:
            linje = linje.split()
            # Sjekker at ikke linja er tom
            if linje == []:
                linjeteller += 1
                continue
            # Sjekker om det første ordet ikke er en opperasjonskode
            merke = linje[0].lower()
            if merke not in opperasjonskoder:
                assert merke not in merker, \
                    f"Gjennbrukt merke på linje {linjeteller}, merket '{merke}' er brukt på linje {merker[merke]}"
                # Oppretter merket
                merker[merke] = linjeteller
            linjeteller += 1
    return merker

## Alt dette som leser inn programmet kan være en egen fil?
def les_program(programfil):
    """
    Leser programmet fra en fil. En linje i programmet kan ha følgende former:
    \<merke\> \<instruksjon\> \<minneadresse\>
              \<instruksjon\> \<minneadresse\>
              \<instruksjon\> \<merke\>
              \<instruksjon\>
    \<merke\> \<instruksjon\> \<merke\>
    \<merke\> DAT \<data\>
    \<merke\> DAT
    
    Merkene viser hvor minneregisteret skal peke.
    """
    opperasjonskoder = {
        "inp" : 901, 
        "out" :	902,
        "otc" : 922,
        "lda" : 500,
        "sta" :	300,
        "add" : 100,
        "sub" : 200,
        "brp" : 800, 
        "brz" : 700,
        "bra" : 600,
        "hlt" : 0,
        "dat" : 0,
    }

    # Setter opp merkene vi trenger i programmet. 
    merker = {}
    merker = lag_merker(programfil, opperasjonskoder)
    
    
    
    # Nå kan vi lese inn instruksjonene uten problemer med merkene. 
    minne = [0] * 100
    with open(programfil) as program:
        linjeteller = 0
        for linje in program:
            linje = linje.lower().split()
            
            # Sjekker at ikke linja er tom.
            if linje == []:
                linjeteller += 1
                continue
            
            if linje[0] in merker:
                linje = linje[1:]
                # Hvis linja nå er tom betyr det at instruksjonen på denne linja var ugyldig.
                assert linje, f'Ugyldig instruksjon på linje {linjeteller+1}'
            # Oppretter instruksjonen
            minne[linjeteller] = lag_instruksjon(linje, linjeteller, opperasjonskoder, merker)
            
            linjeteller += 1
    return minne