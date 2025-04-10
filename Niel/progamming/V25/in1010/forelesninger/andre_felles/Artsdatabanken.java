public class Artsdatabanken {
    public static void main(String[] args) {
        HashSet<Dyr> dyr = new HashSet<>();
        HashMap<String, HashSet<Dyr>> dyreriket = new HashMap<>();
        HashSet<String> kjennetegn = new HashSet<>();

        Dyr g1 = new Bille(kjennetegn);
        System.out.println("Antall individer av Bille: "+ Bille.hentAntall());
        
        Insekt g2 = new Bille(kjennetegn);
        System.out.println("Antall individer av Bille: "+ Bille.hentAntall());
        
        Bille g3 = new Bille();
        dyr.add(g1);
        dyr.add(g2);
        dyr.add(g3);

        for (Dyr d : dyr) {
            if (d instanceof Insekt) {
                if (!dyreriket.keySet().contains(Insekt.KLASSE)){
                    HashSet<Dyr> insekter = new Hashset<>();
                    dyreriket.put(Insekt.KLASSEm insekter);
                }
                dyreriket.get(Insekt.KLASSE).add(d);
            }
        }
    }
    for (Dyr insekt : dyreriket.get(Insekt.KLASSE)) {
        if (insekt instanceof Bille) {
            Bille bille = (Bille) insekt;
            String morgang = Bille.gangMorgang();
            System.out.println(morgang);
        }
    }
}