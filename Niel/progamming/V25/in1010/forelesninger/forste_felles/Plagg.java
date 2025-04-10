import java.util.ArrayList; 


public class Plagg {
    private ArrayListe<String> farger;
    private int antallAntrekk;

    public Plagg(ArrayListe<String> farger){
        this.farger = farger;
        antallAntrekk = 0;
    }

    public boolean harFarge(String farge){
        return farger.contains(farge);
    }

    public int hentAntallAntrekk() {
        return antallAntrekk;
    }

    public void oppdaterAntallAntrekk(int Differanse) {
        if (antallAntrekk + Differanse >= 0)
            antallAntrekk += antAntrekk;
        } else {

        }

}