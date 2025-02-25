import java.util.*;

public class Nordflaggermus extends Pattedyr {
    public final static String ART = "Eptesicus nilssonii";
    private static int antall = 0;
    public final int INDIVIDNUMMER;
    public String navn = null;

    public Nordflaggermus(HashSet<String> kjennetegn) {
        super(kjennetegn);
        antall++;
        INDIVIDNUMMER antall;
    }

    public Nordflaggermus(HashSet<String> kjennetegn, String navn) {
        super(kjennetegn);
        antall++;
        INDIVIDNUMMER = antall;
        this.navn = navn;
    }

    public static void oppdaterAntall(int differanse) {
        if (antall + differanse >= 0) {
            antall += differanse;
        }
    }

    public static int hentAntall() {
        return antall;
    }

    public void leggTilKjennetegn(String k) {
        kjennetegn.add(k);
    }

    public HashSet<String> hentKjennetegn() {
        return kjennetegn;
    }

    @Override
    public String toString() {
        if (navn != null) {
            return "Nordflaggermus " + navn + ", Individnummer " + INDIVIDNUMMER;
        }
        return "Individnummer " + INDIVIDNUMMER;
    }

    public String lagEkko(){
        int lengde = random.nextInt(5,15); //fra 5 til uten 15
        String rop = "\n";

        for (int i = lengde; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                rop += " ( ";
            }
            if (i == lengde) {
                rop += ">(*)<";
            }
            rop += "\n";
        }

        return rop;
    }











}