class Celle {

    boolean levende; // Variabel til å lagre om cellen er levende.
    Celle[] naboer; // Array for å lagre naboceller.
    int AntallNaboer; // Variabel til å telle antall naboer.
    int antLevendeNaboer; // Variabel til å telle antall levende naboer.

    public Celle(){
        levende = false; // Setter cellen som død ved initiering.
        AntallNaboer = 0; // Initierer antall naboer til 0.
        antLevendeNaboer = 0; // Initierer antall levende naboer til 0.
        naboer = new Celle[8]; // Skaper en array for å lagre inntil 8 naboer.
    }

    // Setter statusen til cellen som død.
    public void settDod(){
        levende = false;
    }

    // Setter statusen til cellen som levende.
    public void settLevende(){
        levende = true;
    }

    // Returnerer true hvis cellen er levende, ellers false.
    public boolean erLevende(){
        if (levende == true){
            return true;
        } else {
            return false;
        }
    }

    // Returnerer 'O' hvis cellen er levende og '.' hvis den er død.
    public char hentStatusTegn(){
        if (levende == true){
            return 'O';
        } else {
            return '.';
        }
    }

    // Legger til en nabocelle til naboer-arrayen hvis det er plass.
    public void leggTilNabo(Celle nabo) {
        if (naboer.length > AntallNaboer){
            naboer[AntallNaboer] = nabo;
            AntallNaboer++;
        } else {
            System.out.println("Kan ikke ha flere naboer");
        }
    }

    // Teller antall levende naboer ved å iterere gjennom naboer-arrayen.
    public void tellLevendeNaboer(){
        antLevendeNaboer = 0;

        for (int i = 0; i < AntallNaboer; i++){
            if (naboer[i].erLevende()){
                antLevendeNaboer++;
            }
        }
    }

    // Oppdaterer statusen til cellen; blir levende hvis den har nøyaktig 3 levende naboer, ellers blir den død.
    public void oppdaterStatus() {
        if (antLevendeNaboer == 3) {
            settLevende();
        } else {
            settDod();
        }
    }
}
