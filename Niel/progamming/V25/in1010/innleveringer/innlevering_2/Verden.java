class Verden {

    // lage rutenettet som representerer cellene i verden og generasjonsnummer
    Rutenett rutenett; 
    int genNr; 

    // Konstruktør som initialiserer verden
    public Verden(int rader, int kolonner) {
        rutenett = new Rutenett(rader, kolonner); // Oppretter et nytt rutenett.
        genNr = 0; // Setter generasjonsnummeret til 0.
        rutenett.fyllMedTilfeldigeCeller(); // Fyller rutenettet med tilfeldige celler.
        rutenett.kobleAlleCeller(); // Knytter alle celler til sine naboer.
    }

    // Tegner nåværende tilstand i verden med generasjonstall og antall levende celler.
    public void tegn() {
        System.out.println("");
        System.out.println("-------------");
        System.out.println("Generasjon: " + genNr);
        rutenett.tegnRutenett(); // Tegner rutenettet.
        int antallLevende = rutenett.antallLevende(); // Teller antall levende celler.
        System.out.println(antallLevende);
    }

    // Oppdaterer tilstanden i verden til neste generasjon.
    public void oppdatering() {
        int antRader = rutenett.antRader; // Henter antall rader i rutenettet.
        int antKolonner = rutenett.antKolonner; // Henter antall kolonner i rutenettet.

        // Første gjennomgang: Tell levende naboer for hver celle.
        for (int r = 0; r < antRader; r++) {
            for (int k = 0; k < antKolonner; k++) {
                Celle celle = rutenett.hentCelle(r, k);
                celle.tellLevendeNaboer(); // Teller hvor mange av cellens naboer som lever.
            }
        }

        // Andre gjennomgang: Oppdater statusen til hver celle basert på naboene.
        for (int r = 0; r < antRader; r++) {
            for (int k = 0; k < antKolonner; k++) {
                Celle celle = rutenett.hentCelle(r, k);
                celle.oppdaterStatus(); // Oppdaterer cellens status i henhold til reglene.
            }
        }

        genNr += 1; // Øker generasjonsnummeret med 1
    }
}
