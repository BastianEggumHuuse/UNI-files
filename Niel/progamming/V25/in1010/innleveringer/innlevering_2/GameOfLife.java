class GameOfLife {

    public static void main(String[] args) {
        // Oppretter en ny verden med 8 rader og 12 kolonner.
        Verden verden = new Verden(8, 12);

        // Løkke for å tegne og oppdatere verden 4 ganger.
        for (int i = 0; i < 4; i++) {
            verden.tegn(); // Tegner det nåværende tilstanden til verden.
            verden.oppdatering(); // Oppdaterer verden til neste generasjon.
        }
    }
}
