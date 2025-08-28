import java.util.*;

public class Artsdatabanken {

    public static void main(String[] args) {
        HashSet<Dyr> dyr = new HashSet<>(); // set() i Python
        HashMap<String, HashSet<Dyr>> dyreriket = new HashMap<>(); // dict() i Python
        HashSet<String> kjennetegn = new HashSet<>();

        Dyr g1 = new Granbarkbille(kjennetegn); // Implisitt casting --> Kun Dyr sine felt og metoder tilgjengelige
        System.out.println("\nAntall individer av granbarkbillen: " + Granbarkbille.hentAntall()); // Bruker klassen Granbarkbille (stor forbokstav!) når vi kaller på statiske metoder, ikke referansen g1 – som peker på en bestemt instans (ett objekt)
        Insekt g2 = new Granbarkbille(kjennetegn); // Implisitt casting --> Dyr og Insekt sine felt og metoder tilgjengelige
        System.out.println("\nAntall individer av granbarkbillen: " + Granbarkbille.hentAntall());
        Granbarkbille g3 = new Granbarkbille(kjennetegn); // Alle felt og metoder til Dyr, Insekt og Granbarkbille tilgjengelige
        System.out.println("\nAntall individer av granbarkbillen: " + Granbarkbille.hentAntall());

        // Vi ser at antallet granbarkbiller øker for hver granbarkbille fordi feltet "antall" i Granbarkbille er statisk

        // Husk at casting ikke endrer objektet, men snarere bestemmer hvilke felt og metoder som er tilgjengelige for oss
        // Vi kan putte alle subklasser av Dyr inni en beholder med typen Dyr
        dyr.add(g1);
        dyr.add(g2);
        dyr.add(g3);

        // Itererer over mengden med dyr
        for (Dyr d : dyr) {
            if (d instanceof Insekt) {
                // keySet() returnerer mengden med nøkler i ordboka dyreriket
                if (!dyreriket.keySet().contains(Insekt.KLASSE)) { // Hvis nøkkelen ikke er lagt inn, må vi først legge den inn før vi går videre
                    HashSet<Dyr> insekter = new HashSet<>();
                    dyreriket.put(Insekt.KLASSE, insekter); // putter en nøkkel "Insecta" og en tilhørende tom mengde i ordboka
                }
                dyreriket.get(Insekt.KLASSE).add(d); // legger til dyret, som er et insekt i mengden som hører til nøkkelen "Insecta"
            }
        }

        // Itererer over mengden av dyr som hører til nøkkelen "Insecta"
        for (Dyr insekt : dyreriket.get(Insekt.KLASSE)) {
            if (insekt instanceof Granbarkbille) { // gir true hvis insektet er en granbarkbille
                Granbarkbille granbarkbille = (Granbarkbille) insekt; // Eksplisitt casting, må skrive at insektet faktisk er en granbarkbille
                String morgang = granbarkbille.gnagMorgang(); // Lagrer strengen som gnagMorgang() oppretter og returnerer
                System.out.println(morgang);
            }
        }





    }

}
