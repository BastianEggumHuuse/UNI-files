class Celle {

    boolean levende;
    Celle[] naboer;
    int AntallNaboer;
    int antLevendeNaboer;

    public Celle(){
        levende = false;
        AntallNaboer = 0;
        antLevendeNaboer = 0;
        naboer = new Celle[8];
    }

    public void settDod(){
        levende = false;
    }

    public void settLevende(){
        levende = true;
    }

    public boolean erLevende(){
        if (levende == true){
            return true;
        } else {
            return false;
        }
    }

    public char hentStatusTegn(){
        if (levende == true){
            return 'O';
        } else {
            return '.';
        }
    }

    public void leggTilNabo(Celle nabo) {
        if (naboer.length > AntallNaboer){
            naboer[AntallNaboer] = nabo;
            AntallNaboer ++;
        } else {
            System.out.println("Kan ikke ha flere naboer");
        }
        
    }

    public void tellLevendeNaboer(){
        antLevendeNaboer = 0;

        for (int i = 0; i < AntallNaboer; i++){
            if (naboer[i].erLevende()){
                antLevendeNaboer ++;
            }
        }
    }

    public void oppdaterStatus() {
        if (antLevendeNaboer == 3) {
            settLevende();
        } else {
            settDod();
        }
    }



    

}