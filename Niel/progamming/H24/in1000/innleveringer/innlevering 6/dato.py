#lager klasse
class Dato:
    #lager konstruktør med instansvariablene
    def __init__(self,ny_dag,ny_maaned,nytt_aar):
        self._ny_dag = ny_dag
        self._ny_maaned = ny_maaned
        self._nytt_aar = nytt_aar

    #metoder
    def hent_aar(self):
        print(f"År: {self._nytt_aar}")
    #dette gjør at jeg kan bare printe objektet
    def __str__(self):
        return f"{self._ny_dag}.{self._ny_maaned}.{self._nytt_aar}"
    
    def sjekke_dag(self,dag_nr):
        if dag_nr == self._ny_dag:
            return True
        else:
            return False
    
    def ny_dag(self):
        #Februar og skuddår: Metoden undersøker ikke skuddår eller spesialtilfellet med februar som har enten 28 eller 29 dager. Dette vil føre til feil når datoen er i februar.
        maaneder_med_30_dager = [4, 6, 9, 11]
        self._ny_dag += 1
        for e in maaneder_med_30_dager:
            if self._ny_maaned == e:
                if self._ny_dag > 30:
                    self._ny_dag = 1
                    self._ny_maaned +=1
            else:
                if self._ny_dag > 31:
                    self._ny_dag = 1
                    self._ny_maaned +=1

    def kommer_foer(self, annen_dato):
        # Splitter datoen som mottas i dag, måned, år
        annen_dag, annen_maaned, annet_aar = map(int, annen_dato.split("."))

        # Sammenligner først år
        if annet_aar < self._nytt_aar:
            return True
        elif annet_aar > self._nytt_aar:
            return False

        # Hvis årene er like, sammenligner vi måneder
        if annen_maaned < self._ny_maaned:
            return True
        elif annen_maaned > self._ny_maaned:
            return False

        # Hvis månedene også er like, sammenligner vi dager
        if annen_dag < self._ny_dag:
            return True
        else:
            return False
        
    def rar_oppgave(self):
        if self._ny_dag == 15:
            print("Loenningsdag!")
        if self._ny_dag == 1:
            print("Ny måned, nye muligheter")