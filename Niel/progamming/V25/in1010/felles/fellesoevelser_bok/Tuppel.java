public class Tuppel implements Comparable<Tuppel> { // comparable er et grensesnitt

    // store bokstaver fordi final
    public final String FORFATTER;
    public final int UTGIVELSESÅR;

    public Tuppel(String forfatter, int utgivelsesår){
        FORFATTER = forfatter;
        UTGIVELSESÅR = utgivelsesår;
    }


    // X.compareTo(Y) gir et positivt tall hvis X > Y, negativt hvis X < Y, 0 ellers
    @Override
    public int compareTo(Tuppel tuppel) {

        // Bushra sin metode
        /*if (FORFATTER.equals(tuppel.FORFATTER)) {
            if (UTGIVELSESÅR > Tuppel.UTGIVELSESÅR) {
                return 1;
            }
            else if (UTGIVELSESÅR < Tuppel.UTGIVELSESÅR) {
                return -1;
            }
        } */
        
        // Leonard sin metode (BEDRE)
        if (FORFATTER.equals(tuppel.FORFATTER)){
            return UTGIVELSESÅR - tuppel.UTGIVELSESÅR; // hvis forfatterne er like sorteres det på utgivelsesår
        }
        return FORFATTER.compareTo(tuppel.FORFATTER); // ellers sorterer på forfatter
    }

}