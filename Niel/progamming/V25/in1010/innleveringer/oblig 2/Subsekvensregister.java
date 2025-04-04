import java.util.*;
import java.io.File;

class Subsekvensregister {
    private static final int Subsekenslengde = 3;
    private ArrayList<Frekvenstabell> register = new ArrayList<Frekvenstabell>();
    public void settInn(Frekvenstabell f) {
        register.add(f);
    }

    public Frekvenstabell taUt() {

        //Jeg antar at det finnes ett eller flere elementer i listen.

        Frekvenstabell r = register.remove(register.size()-1);

        return(r);
    }

    public int antall() {
        return register.size();
    }

    public static Frekvenstabell les(String filnavn) {

        Frekvenstabell f = new Frekvenstabell();
        Scanner fil = null;

        try {
            fil = new Scanner(new File(filnavn));
        } catch (Exception e) {
            System.out.println("Kunne ikke lese fil.");
            System.exit(1);
        }


        while (fil.hasNextLine()) {
            String skibidi = fil.nextLine();
            char[] tegn = skibidi.toCharArray();

            for (int i = 0; i < tegn.length-2; i++) {

                char[] c1 = new char[3];
                c1[0] = tegn[i];
                c1[1] = tegn[i+1];
                c1[2] = tegn[i+2];

                String nyStreng = new String(c1);

                f.put(nyStreng,1);
            }
        }

        fil.close();
        return f;




    }





}