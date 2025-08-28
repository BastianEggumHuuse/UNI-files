import java.util.*;

public class Antrekk {
    private ArrayList<String> anledninger;
    private ArrayList<Plagg> plagg;

    public Antrekk (ArrayList<Plagg> plagg, String anledning) {
        this.plagg = plagg;
        anledninger = new Arraylist<>();
        anledninger.add(anledning);

        for (Plagg p : this.plagg) {
            p.oppdaterAntallAntrekk(1);
        }
    }

    public ArrayList<Plagg> hentPlaggene() {
        return plagg;
    }

    public void leggTilAnledning(String anledning) {
        anledninger.add(anledning);
    }


}