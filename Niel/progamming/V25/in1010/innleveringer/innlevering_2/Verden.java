class Verden {
    Rutenett rutenett;
    int genNr;
    
    public Verden (int rader,int kolonner) {
        rutenett = new Rutenett(rader,kolonner);
        genNr = 0;
        rutenett.fyllMedTilfeldigeCeller();
        rutenett.kobleAlleCeller();
    }

    public void tegn() {
        System.out.println("Generasjon: "+ genNr);
        rutenett.tegnRutenett();
        int antallLevende = rutenett.antallLevende();
        System.out.println(antallLevende);

    }

    public void oppdatering() {
        int antRader = rutenett.antRader;
        int antKolonner = rutenett.antKolonner;
        
        for (int r = 0; r < antRader; r++) {
            for (int k = 0; k < antKolonner; k++) {

                Celle celle = rutenett.hentCelle(r,k);

                celle.tellLevendeNaboer();

                
                
            }
        }

        for (int r = 0; r < antRader; r++) {
            for (int k = 0; k < antKolonner; k++) {

                Celle celle = rutenett.hentCelle(r,k);

                celle.oppdaterStatus();
                                
            }
        }

        genNr += 1;

    }
}