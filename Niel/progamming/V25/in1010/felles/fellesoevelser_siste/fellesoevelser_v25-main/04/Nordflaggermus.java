import java.util.*;

public class Nordflaggermus extends Pattedyr implements KanFly {

    public final static String ART = "Eptesicus nilssonii";
    private static int antall = 0;
    public final int INDIVIDNUMMER;
    public String navn = null;
    private String posisjon = "et ukjent sted";

    public Nordflaggermus(HashSet<String> kjennetegn) {
        super(kjennetegn);
        antall++;
        INDIVIDNUMMER = antall; // Holder rede på individnummeret til en gitt instans ved å bruke antall, som er en teller som er felles for hele klassen (fordi feltet er statisk)
    }

    // Eksempel på overloading --> Vi definerer to metoder med samme navn innenfor samme klasse, her er det konstruktøren, men det kunne vært hvilken som helst annen metode
    public Nordflaggermus(HashSet<String> kjennetegn, String navn) {
        this(kjennetegn); // Kaller på konstruktøren over for å slippe å gjenta kode --> Takk til Sebastian for forslaget!
        this.navn = navn; // lagrer navnet, her er "this" nødvendig fordi "navn" inni dette skopet referer til to ulike ting
    }

    public static void oppdaterAntall(int differanse) {
        if (antall + differanse >= 0) {
            antall += differanse;
        }
    }

    public static int hentAntall() {
        return antall;
        // kan også si Nordflaggermus.antall, men det er overflødig
    }

    // Eksempel på overskriving, også kalt subtypepolymorfi
    public void leggTilKjennetegn(String k) {
        kjennetegn.add(k);
    }

    // Eksempel på overskriving, også kalt subtypepolymorfi
    public HashSet<String> hentKjennetegn() {
        return kjennetegn;
    }

    @Override
    public String toString() {
        if (navn != null) {
            return "Nordflaggermus " + navn;
        }
        return "Nordflaggermus #" + INDIVIDNUMMER;
    }

    // metode som lager en gøy streng som representerer lyden som flaggermusa lager i forbindelse med ekkolokalisering
    public String lagEkko() {
        int lengde = random.nextInt(5, 15);
        String rop = "\n";

        for (int i = lengde; i > 0; i--) {
            for (int j = 0; j < i; j++) { // Det samme som å si i Python noe som rop += " ( " * i, men Java tillater ikke å multiplisere et tall med en streng
                rop += " ( ";
            }
            if (i == lengde) {
                rop += ">(*)";
            }
            rop += "\n";
        }

        public void fly(String p) {
        System.out.println(this + "fløy fra " + posisjon + " til "+ p);
        posisjon = p;
    }

        return rop;
    }













}
