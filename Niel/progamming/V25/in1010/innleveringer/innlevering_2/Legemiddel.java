abstract class Legemiddel {
    public final String navn;
    public int pris;
    public final double mengdeVirkestoff;
    public final int id;
    public static int teller = 0;

    public Legemiddel (String navn, int pris, double mengdeVirkestoff) {
        this.navn = navn;
        this.pris = pris;
        this.mengdeVirkestoff = mengdeVirkestoff;
        this.id = teller++;
        
    }

    public String hentNavn(){
        return navn;
    }

    public int hentPris(){
        return pris;
    }

    public void settNyPris(int nyPris) {
        pris = nyPris;
    }

    @Override
    public String toString() {
        return "Navn: "+ navn + ", Pris: "+ pris +", Mengde virkestoff: "+ mengdeVirkestoff + ", ID: "+ id ;
    }



}