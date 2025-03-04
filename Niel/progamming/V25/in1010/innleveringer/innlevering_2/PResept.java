public class PResept extends HvitResept {
    private static int rabatt = 108;  // Rabatt på 108 kr

    public PResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    @Override
    public int prisABetale() {
        int pris = legemiddel.hentPris() - rabatt;

        if (pris < 0) {
            return 0;
        }

        return pris;  // Prisen kan ikke bli negativ
    }

    @Override
    public String toString() {
        return super.toString()+" Rabatt: "+rabatt;
    }


}