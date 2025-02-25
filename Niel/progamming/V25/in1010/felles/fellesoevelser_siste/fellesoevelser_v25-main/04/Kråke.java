import java.util.*;

public class Kråke extends Fugl implements KanFly {

    public final static String ART = "Corvus cornix";
    private static int antall = 0;
    private final int INDIVIDNUMMER;
    private String posisjon = "et ukjent sted";

    public Kråke(HashSet<String> kjennetegn) {
        super(kjennetegn);

        INDIVIDNUMMER = ++antall;
    }

    // Vi vil ikke at antallet skal kunne bli negativt
    public static void oppdaterAntall(int differanse) {
        if (antall + differanse >= 0) {
            antall += differanse;
        }
    }

    public static int hentAntall() {
        return Granbarkbille.antall; // Bruker klassen, framfor "this" fordi "antall" er statisk
        // kan også si "return antall;"
    }

    //@Override
    public void leggTilKjennetegn(String k) { // Her må vi implementere denne, fordi vi arver den fra Dyr via Insekt
        kjennetegn.add(k);
    }

    public HashSet<String> hentKjennetegn() {
	return kjennetegn;
    }

// kan bruke @Override
    public String toString() {
        return "Kråke #" + INDIVIDNUMMER;
    }

    //@Override

    public void fly(String p) {
        System.out.println(this + "fløy fra " + posisjon + " til "+ p);
        posisjon = p;
    }

}