abstract class Resept {
    public int id;
    public Legemiddel legemiddel;
    public Lege utskrivendeLege;
    public int pasientId;
    public int reit;
   

    public Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.pasientId = pasientId;
        this.reit = reit;
    }

    public int hentId(){
        return id;
    }
    public Legemiddel hentLegemiddel(){
        return legemiddel;
    }
    public Lege hentLege(){
        return utskrivendeLege;
    }
    public int hentPasientId(){
        return pasientId;
    }
    public int hentReit(){
        return reit;
    }

    public boolean bruk(){
        if (reit > 0) {
            reit = reit - 1;
            return true;
        }
        return false;
    }

    //Vet ikke om jeg har gjort hele oppgaven feil. Siden jeg prøver å printe legemiddelet så bruker den også toString metoden som ødelegger denne toStringen. Derfor lagde jeg en egen metode som henter kun navnet til legemiddelet.
    @Override
    public String toString() {
        return "Legemiddel: "+ legemiddel.hentNavn() + ", Utskrivende lege styrke: "+utskrivendeLege.hentNavn()+", Pasient Id: "+pasientId+", antall reit: "+reit+", Farge: "+farge()+",";
    }    

    //Returnerer reseptens farge, enten hvit eller blå.
    abstract public String farge();

    //Returnerer prisen pasienten må betale.
    abstract public int prisABetale();

    




}