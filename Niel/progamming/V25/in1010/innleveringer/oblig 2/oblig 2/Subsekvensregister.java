import java.util.*;
import java.io.File;

class Subsekvensregister {
    private static final int Subsekenslengde = 3; // Fast lengde på subsekvenser
    private ArrayList<Frekvenstabell> register = new ArrayList<Frekvenstabell>();

    // Legger til en frekvenstabell i registeret
    public void settInn(Frekvenstabell f) {
        register.add(f);
    }
    // Henter og fjerner siste frekvenstabell
    public Frekvenstabell taUt() {

        //Jeg antar at det finnes ett eller flere elementer i listen.

        Frekvenstabell r = register.remove(register.size()-1);

        return(r);
    }
    // Returnerer antall frekvenstabeller i registeret
    public int antall() {
        return register.size();
    }
    // Leser fil og lager frekvenstabell av subsekvenser
    public static Frekvenstabell les(String filnavn) {

        Frekvenstabell f = new Frekvenstabell();
        Scanner fil = null;

        try {
            fil = new Scanner(new File(filnavn));
        } catch (Exception e) {
            System.out.println("Kunne ikke lese fil.");
            System.exit(1);
        }

        // Leser alle 3-tegns subsekvenser

        while (fil.hasNextLine()) {
            String linje = fil.nextLine();
            char[] tegn = linje.toCharArray();

            for (int i = 0; i < tegn.length-2; i++) {

                char[] c1 = new char[3];
                c1[0] = tegn[i];
                c1[1] = tegn[i+1];
                c1[2] = tegn[i+2];

                String nyStreng = new String(c1);
                
                // Legger til eller oppdaterer teller
                f.put(nyStreng,1); 
            }
        }

        fil.close();
        return f;




    }





}