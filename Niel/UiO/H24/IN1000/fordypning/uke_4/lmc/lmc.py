    # Oppgave 1
def lag_instruksjon(instruksjon, opperasjonskoder):
    """
    Oppretter en instruksjon. Instruksjoner kan ha formene
    <oppkode> <merke>
    <oppkode> minneadresse
    <oppkode>
    Kun IO og HLT kan være tomme. Alle andre trenger en minneadresse.
    """
    # din kode her:
    raise NotImplementedError
    return instruksjonsverdi

    # Oppgave 3
def lag_merke(merke, linjenummer):
        # din kode her:
    raise NotImplementedError
    return minne

def les_program(programfil):
    """
    Leser programmet fra en fil. En linje i programmet kan ha følgende former:
    <merke> <instruksjon> <minneadresse>
            <instruksjon> <minneadresse>
            <instruksjon> <merke>
    <merke> <instruksjon> <merke>
            <instruksjon>
    <merke> DAT <data>
    <merke> DAT
    
    Merkene viser hvor minneregisteret skal peke.
    """
    # Dette er alle implementerte oppereasjoner Alle opperasjoner består av et heltall [0-9], og en minneadresse [0-99]
    # De fleste her er altså bare opperasjonskoden bortesett fra inp, out, otc og dat som er spesielle opperasjoner
    opperasjonskoder = {
        "inp" : 901, # Input fra bruker, kan bare tolke heltall mellom -999 og 999
        "out" :	902, # output fra programmet, printer tallverdien i akkumulatorregisteret
        "otc" : 922, # samme som output, men tolket som et ascii-tegn
        "lda" : 500, # last inn data fra minnet på adressen xx, hvor xx er de to siffrene etter 4.
        "sta" :	300, # lagre akkumulatorverdien til minneadresse xx
        "add" : 100, # legg sammen akkumulatoren med det som er lagret på xx
        "sub" : 200, # Trekk det som er på minneadresse xx fra akkumulatoren
        "nop" : 400, # Gjør ingen ting (no op)
        "brp" : 800, # Hopp til xx dersom akkumulatoren er positiv. Et hopp vil si å sette programtelleren til denne verdien
        "brz" : 700, # Hopp til xx dersom akkumulatoren er 0
        "bra" : 600, # Hopp til xx
        "hlt" : 0,   # Avslutt
        "dat" : 0,   # Plasser noe i minnet
    }

    # Oppretter minnet.
    minne = [0] * 100
    #oppgave 3
    merker = ...

    with open("add.txt") as fil:
        pass

les_program("add.txt")