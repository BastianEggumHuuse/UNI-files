import java.util.*;

public class Granbarkbille extends Insekt { // Arver alt fra Insekt, og dermed også fra Dyr

    public final static String ART = "Ips Typographus";
    // private variabler er kun tilgjengelige hos Granbarkbille
    private static int antall = 0; // Vi vil holde rede på antall av denne arten
    private int antallEgg;
    private String kjoenn;
    

    public Granbarkbille(HashSet<String> kjennetegn) {
        super(kjennetegn);

        antallEgg = 0;

        // 50 % sjanse for hvert kjønn
        if (random.nextDouble() > 0.5) {
            kjoenn = "hunn";
        } else {
            kjoenn = "hann";
        }
        antall++; // øker antall for hver instans av Granbarkbille
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

    public void leggTilKjennetegn(String k) { // Her må vi implementere denne, fordi vi arver den fra Dyr via Insekt
        kjennetegn.add(k);
    }
    
    public Hash<Set> hentKjennetegn(){
        return kjennetegn;
    }
    private void leggEgg() { // privat metode som kun kan brukes innad i Granbarkbille
        antallEgg += random.nextInt(40, 81); // genererer et noe variabelt antall egg
    }

    // Granbarkbillen gnager pene tunneller under barken til grantrær, og legger egg der
    public String gnagMorgang() {
        String morgang = "\n"; // linjeskift

        if (kjoenn.equals("hunn")) { // det er bare hunnene som gjør dette
            int lengde = random.nextInt(15) + 10;

            for (int i = 0; i < lengde; i++) {
                morgang += "~"; // representerer morgangen

                if (random.nextDouble() < 0.3) {
                    this.leggEgg(); // her kan vi bruke "this" fordi metoden ikke er statisk, eller bare skrive leggEgg()
                    morgang += "O";
                }
            }
        } else {
            morgang += "Jeg er en hann :((";
        }

        morgang += "\n";

        return morgang;
    }



}
