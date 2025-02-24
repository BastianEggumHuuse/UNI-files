import java.util.*;

public class Artsdatabanken {

    public static void main(String[] args) {
        HashSet<Dyr> dyr = new HashSet<>(); // set() i Python
        HashMap<String, HashSet<Dyr>> dyreriket = new HashMap<>(); // dict() i Python
        HashSet<String> kjennetegn = new HashSet<>();

        kjennetegn.add("Produserer ikke egen næring");
        kjennetegn.add("Kan bevege seg");
        kjennetegn.add("Kan sanse");
        kjennetegn.add("Kan kommunisere med andre organismer av samme art");

        HashSet<String> kjennetegn2 = new HashSet<>(kjennetegn1);

        HashSet<String> kjennetegn3 = new HashSet<>(kjennetegn1);

        Dyr g1 = new Granbarkbille(kjennetegn1); // Implisitt casting --> Kun Dyr sine felt og metoder tilgjengelige
        System.out.println("\nAntall individer av granbarkbillen: " + Granbarkbille.hentAntall()); // Bruker klassen Granbarkbille (stor forbokstav!) når vi kaller på statiske metoder, ikke referansen g1 – som peker på en bestemt instans (ett objekt)
        Insekt g2 = new Granbarkbille(kjennetegn1); // Implisitt casting --> Dyr og Insekt sine felt og metoder tilgjengelige
        System.out.println("\nAntall individer av granbarkbillen: " + Granbarkbille.hentAntall());
        Granbarkbille g3 = new Granbarkbille(kjennetegn1); // Alle felt og metoder til Dyr, Insekt og Granbarkbille tilgjengelige
        System.out.println("\nAntall individer av granbarkbillen: " + Granbarkbille.hentAntall());

        // Vi ser at antallet granbarkbiller øker for hver granbarkbille fordi feltet "antall" i Granbarkbille er statisk

        // Husk at casting ikke endrer objektet, men snarere bestemmer hvilke felt og metoder som er tilgjengelige for oss
        // Vi kan putte alle subklasser av Dyr inni en beholder med typen Dyr
        dyr.add(g1);
        dyr.add(g2);
        dyr.add(g3);

        Dyr n1 = new Nordflaggermus(kjennetegn2);
        Pattedyr n2 = new Nordflaggermus(kjennetegn2);
        Nordflaggermus n3 = new Nordflaggermus(kjennetegn2);
        Nordflaggermus n4 = new Nordflaggermus(kjennetegn2, "Nanna");

        // Nå vil metoden toString() automatisk kalles uten at vi trenger å skrive n3.toString() osv.
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n2); // Her vi også toString() kalles, selv om den er implementert i Nordflaggermus og n2 er en referanse til Pattedyr. I og med ar Pattedyr (og alle andre klasser) arver fra Object, vil ikke kompilatoren identifisere dette som en feil. Deretter sjekker JVM under kjøring typen til det faktiske objektet (som er Nordflaggermus), framfor typen til referansen n2 (som er Pattedyr), og kaller metoden toString() slik den er implementert i Nordflaggermus.

        dyr.add(n1);
        dyr.add(n2);
        dyr.add(n3);
        dyr.add(n4);

        String rop = n3.lagEkko();
        System.out.println(rop);
        System.out.println(n4.lagEkko());

        Nordflaggermus nordflaggermus = (Nordflaggermus) n1;
        System.out.println(nordflaggermus.lagEkko());

        KanFly k1 = new Kråke(kjennetegn3);
        KanFly k2 = new Kråke(kjennetegn3);

        //for å legge til k2

        Dyr k2 = (Dyr) k1;
        if (k2 instanceof Kråke) {
            System.out.println("Ja, objektet beholder sin type");
        }
        dyr.add(k2);

        dyr.add(k3);


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
            else if (d instanceof Pattedyr) {
                d.leggTilKjennetegn("Produserer melk til ungene");
                if (!dyreriket.keySet().contains(Pattedyr.KLASSE)) { // oppretter en ny nøkkel
                    HashSet<Dyr> pattedyr = new HashSet<>();
                    dyreriket.put(Pattedyr.KLASSE, pattedyr);
                }
                dyreriket.get(Pattedyr.KLASSE).add(d);
            }
            else if (d instanceof Fugl) {
                d.leggTilKjennetegn("Legger egg");
                if (!dyrriket.keySet().contains(Fugl.KLASSE)) {
                    HashSet<Dyr> fugler = new HashSet<>();
                    dyreriket.put(Pattedyr.KLASSE).add(d);
                }
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
