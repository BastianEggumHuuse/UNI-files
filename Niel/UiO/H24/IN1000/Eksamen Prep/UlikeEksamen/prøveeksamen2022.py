"""
# 1a
= 3

# 1b
= 6

1d
= AL

1f
= abcd

1g
= ba

2a
= 2

2g
= riktig :) ggwp

2h
for i in range(4):
    print()

Ikke gyldig utrykk^


"""


#3a)
"""
def karantene(vaksinert,farge):
    antall_dager = 0
    if vaksinert == True:
        return antall_dager
    else:
        if farge == "groenn":
            antall_dager = 3
            return antall_dager
        elif farge == "oransje" or farge == "roed":
            antall_dager = 10
            return antall_dager

print(karantene(True,"groenn"))
"""
#3b
"""
def tell_grader(fag,bsc,msc):
    if fag == bsc and fag == msc:
        return 2
    if fag == bsc or fag == msc:
        return 1
    if fag != bsc and fag != msc:
        return 0

print(tell_grader("informatikk", "informatikk", "informatikk") )
print(tell_grader("historie", "informatikk", "informatikk"))
"""

#3c
"""
def fjern_vokaler(setning,vokal_liste):

    resultat = ""
    
    for tegn in setning:
        if tegn not in vokal_liste:
            resultat += tegn
   
    return resultat

print(fjern_vokaler("ha det fint", ["a", "e", "i", "o", "u"]))
"""


#3d
"""
bokfor = {"laptop":5000, "ryggsekk":900}
boketter = {"laptop":4000, "ryggsekk":600}
vareliste = ["laptop", "ryggsekk"]


def summer_rabatt(vareliste,forpris,nypris):
    sum = 0

    for vare in vareliste:
        rabatt = forpris[vare] - nypris[vare]
        sum += rabatt

    return sum

print(summer_rabatt(["laptop", "ryggsekk"], {"laptop":5000, "ryggsekk":900},
{"laptop":4000, "ryggsekk":600}))

"""

#5
"""
liste = [[["Spania", "Frankrike"], ["Frankrike", "Norge"]]]


def sjekk_reise(reise):
    for i in range(len(reise)-1):
        if reise[i][1] != reise[i+1][0]:
            return False
    return True


# Eksempler på bruk
print(sjekk_reise([["Spania", "Frankrike"], ["Frankrike", "Norge"]]))  # Returnerer True
print(sjekk_reise([["Russland", "Tyskland"], ["Tyskland", "Sverige"], ["Norge", "Belgia"]]))  # Returnerer False
print(sjekk_reise([["Russland", "Tyskland"], ["Norge", "Tyskland"]]))  # Returnerer False
"""



#oppgave 4


#4a
class Onske:

    def __init__(self, beskrivelse, antall, minimumspris):
        self._beskrivelse = beskrivelse
        self._antall = antall
        self._minimumspris = minimumspris

    def passer(self,maksimumspris):
        if maksimumspris < self._minimumspris:
            return False        
        if self._antall == 0:
            return False
            
        return True
    

    def valgt(self):
        self._antall -= 1
        return self._beskrivelse
    

    def __str__(self):
        return f"Beskrivelse: {self._beskrivelse} Minimumspris: {self._minimumspris}"
#4b    
class Onskeliste:

    def __init__(self):
        self._onskeliste = []

    def nytt_onske(self,beskrivelse, antall, minimumspris):
        onske = Onske(beskrivelse, antall, minimumspris)
        self._onskeliste.append(onske)

    def hent_onsker(self,maksimumspris):
        liste = []
        for onsker in self._onskeliste:
            if onsker.passer(maksimumspris):
                liste.append(str(onsker))

        if len(liste) == 0:
            return "Ikke valgbart onske"  
              
        return liste
    
    def onske_oppfylles(self,index):
        onske = self._onskeliste[index]
        onske.valgt()
        return str(onske)

#4c

class Gave:

    def __init__(self,beskrivelse,giver):
        self._beskrivelse = beskrivelse
        self._giver = giver

    def beskrivelse_med_giver(self):
        return f"{self._beskrivelse} av {self._giver}"

class Juleferiekalender:

    def __init__(self,antall_dager):
        self._antall_dager = antall_dager
        self._gaver = {}

        for i in list(range(25,32)):
            self._gaver[i] = None

        for i in (range(1,24)):
            self._gaver[i] = None

    def ny_gave(self,gaven, giver,dag):
        gave = Gave(gaven,giver)
        self._gaver[dag] = gave


    def hent_dagens_gave(self,dagnummer):

        if dagnummer < 25:
            if self._gaver[dagnummer] == None:
                return f"{dagnummer}.desember inneholder ingen gaver."
            else:
                return f"{dagnummer}.desember inneholder: {self._gaver[dagnummer].beskrivelse_med_giver()}."
        else:
            if self._gaver[dagnummer] == None:
                return f"{dagnummer}.januar inneholder ingen gaver."
            else:
                return f"{dagnummer}.januar inneholder: {self._gaver[dagnummer].beskrivelse_med_giver()}."
            

        

    def hent_ant_dager(self):
        for antall in self._gaver:
            antall += 1
        return antall
    

class Julegavefikser:

    def __init__(self,antall_dager):

        self._kalender = Juleferiekalender(antall_dager)
        self._onskeliste = Onskeliste()
        self._neste_dag = 26


    def les_onsker_fra_fil(self,filnavn):

        with open(filnavn, 'r') as f:
            for linje in f:
                linje = linje.strip()
                beskrivelse,antall,minimumspris = linje.split(";")

                self._onskeliste.nytt_onske(beskrivelse,antall,int(minimumspris))

                 

    def velg_gave(self,maksimumspris):

        liste = self._onskeliste.hent_onsker(maksimumspris)
        print("hvilken ønske vil du oppfylle?")
        for i in range(len(liste)):
            print(i,liste[i])
        bruker = int(input(">"))





bruker = Julegavefikser(10)

bruker.les_onsker_fra_fil("onsketekst.txt")

bruker.velg_gave(500000)