class Celle {

    boolean levende; // Variabel for om cellen er levende
    Celle[] naboer; // Array for naboceller
    int antNaboer; // Variabel til å telle antall naboer
    int antLevendeNaboer; // Variabel til å telle antall levende naboer.

    public Celle(){
        levende = false; // Setter cellen som død ved initiering.
        antNaboer = 0; // Initierer antall naboer til 0.
        antLevendeNaboer = 0; // Initierer antall levende naboer til 0.
        naboer = new Celle[8]; // Skaper en array for å lagre inntil 8 naboer.
    }

    // Setter statusen til cellen som død.
    public void settDød(){
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
        if (naboer.length > antNaboer){
            naboer[antNaboer] = nabo;
            antNaboer++;
        } else {
            System.out.println("Kan ikke ha flere naboer");
        }
    }

    // Teller antall levende naboer ved å iterere gjennom naboer-arrayen.
    public void tellLevendeNaboer(){
        antLevendeNaboer = 0;

        for (int i = 0; i < antNaboer; i++){
            if (naboer[i].erLevende()){
                antLevendeNaboer++;
            }
        }
    }

    // Oppdaterer statusen til cellen; blir levende hvis den har nøyaktig 3 levende naboer, ellers blir den død.
    public void oppdaterStatus() {

        if (this.erLevende()){
            if (antLevendeNaboer < 2){
                settDød();
            } else if (antLevendeNaboer > 3) {
                settDød();
            }
        } else { // om  cellen er død
            if (antLevendeNaboer == 3) {
                settLevende();
        }

    }
    }
}
