public class Rutenett {

    int antRader; // Antall rader
    int antKolonner; // Antall kolonner
    Celle[][] rutene; // array som representerer cellene i rutenettet.

    // Konstruktør som initialiserer rutenett med gitt antall rader og kolonner.
    public Rutenett(int Rader, int Kolonner){
        antRader = Rader;
        antKolonner = Kolonner;
        rutene = new Celle[Rader][Kolonner];
    }

    // Lager en ny celle på spesifisert posisjon, som er levende med 33.33% sannsynlighet, ellers død.
    public void lagCelle(int rad, int kol){
        Celle nyCelle = new Celle();
        if (Math.random() <= 0.3333){
            nyCelle.settLevende();
        }
        rutene[rad][kol] = nyCelle;
    }

    // Fyller hele rutenettet med celler, der hver celle har en 33.33% sjanse for å være levende.
    public void fyllMedTilfeldigeCeller(){
        for (int i = 0; i < antRader; i++){
            for (int j = 0; j < antKolonner; j++) {
                lagCelle(i, j);
            }
        }
    }

    // Returnerer cellen på gitt rad og kolonne, eller null hvis koordinatene er utenfor grensene.
    public Celle hentCelle(int rad, int kolonne){
        if (antRader > rad && 0 <= rad){
            if (antKolonner > kolonne && 0 <= kolonne){
                return (rutene[rad][kolonne]);
            }
        }
        return null;
    }

    // Tegner rutenettet ved å printe statusen til hver celle (levende eller død).
    public void tegnRutenett() {
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
        
        for (int rx = 0; rx < antRader; rx++) {
            for (int kx = 0; kx < antKolonner; kx++) {
                Celle celle = rutene[rx][kx];
                System.out.print(celle.hentStatusTegn());
            }
            System.out.println();
        }
        
    }

    // Setter naboene til cellen på gitt rad og kolonne.
    public void settNaboer(int rad, int kolonne){
        Celle celle = hentCelle(rad, kolonne);
        for (int i = rad - 1; i <= rad + 1; i++){
            for (int j = kolonne - 1; j <= kolonne + 1; j++) {
                Celle nabo = hentCelle(i, j);
                if (nabo != null && nabo != celle){
                    celle.leggTilNabo(nabo);
                }
            }
        }
    }

    // Knytter alle celler i rutenettet til sine respektive naboer.
    public void kobleAlleCeller() {
        for (int r = 0; r < antRader; r++) {
            for (int k = 0; k < antKolonner; k++) {
                settNaboer(r, k);
            }
        }
    }
    
    // Teller og returnerer antallet levende celler i rutenettet.
    public int antallLevende() {
        int teller = 0;
        for (int r = 0; r < antRader; r++) {
            for (int k = 0; k < antKolonner; k++) {
                Celle celle = hentCelle(r, k);
                if (celle.erLevende()) {
                    teller += 1;
                }
            }
        }
        return teller;
    }
}
