import java.util.*;

public class Antrekk {
    private ArrayList<String> anledninger;
    private ArrayList<Plagg> plagg;

    public Antrekk(ArrayList<Plagg> plagg, String anledning) {
        this.plagg = plagg;
        anledninger = new ArrayList<>();
        anledninger.add(anledning);

        for (Plagg p : plagg) { // kalles en for-each-løkke, brukes når vi vil ha elementet, framfor indeksen
            p.oppdaterAntallAntrekk(1);
        }
    }

    public ArrayList<Plagg> hentPlaggene() {
        return plagg;
    }

    public void leggTilAnledning(String anledning) {
        anledninger.add(anledning);
    }

    public boolean passerTil(String anledning) {
        return anledninger.contains(anledning);
    }

    public boolean harFarge(String farge) {	
        for (Plagg p : plagg) {
            if (p.harFarge(farge)) { // her er det Plagg-instansen (p) sin metode harFarge() som kalles, fordi det er objektet vi bruker til å kalle på metoden som bestemmer det. Dette er altså ikke en rekursiv metode (mer om rekursjon senere)
                return true; // her går vi ut av hele metoden
            }
        }
        return false; // da fant vi ingen
    }
}
