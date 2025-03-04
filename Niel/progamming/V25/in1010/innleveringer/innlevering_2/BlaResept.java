public class BlaResept extends Resept {
    private static double rabatt = 0.25;  

    public BlaResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    @Override
    public String farge() {
        return "blå";  
    }


    @Override
    public int prisABetale() {
        double pris = legemiddel.hentPris() * rabatt;
        return (int) Math.round(pris);  // Avrunder til nærmeste hele krone
    }
    



}




