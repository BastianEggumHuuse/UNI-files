import java.util.*;

public class Plagg {
    // "felt" kan brukes som fellesbetegnelse på instans- og klassevariabler
    private ArrayList<String> farger; // her deklarerer vi feltene
    private int antallAntrekk; // private gjør feltet synlig KUN innenfor denne klassen

    public Plagg(ArrayList<String> farger) { // konstruktøren er en metode som returnerer en instans av klassen
        this.farger = farger; // her initialiserer vi feltene
        antallAntrekk = 0;
    }

    public boolean harFarge(String farge) {
        return farger.contains(farge); // lurt å slå opp i dokumentasjonen til ArrayList
    }

    public int hentAntallAntrekk() {
        return antallAntrekk;
    }

    public void oppdaterAntallAntrekk(int differanse) {	
        if (antallAntrekk + differanse >= 0) { // jeg vil ikke at antallet skal bli negativt
            antallAntrekk += differanse; // tilsvarer antallAntrekk = antallAntrekk + differanse
        }
    }
}
