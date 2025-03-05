public class Bok implements Comparable<Bok> { // comparable er et grensesnitt
    private Kapittel første, siste = null; // ha private hvis den ikke skal tukles på utenfra
    private int antallKapitler = 0;
    public final Tuppel TUPPEL;
    private String tittel = "Ukjent tittel";
    public final String ISBN;

    public Bok(String ISBN, String forfatter, int utgivelsesår){
        this.ISBN = ISBN;
        TUPPEL = new Tuppel(forfatter, utgivelsesår);
    }

    public Bok(String ISBN, String forfatter, int utgivelsesår, String tittel){
        this(ISBN, forfatter, utgivelsesår) // Slipper å skrive alt på nytt
        this.tittel = tittel;
    }

    @Override
    public int compareTo(Bok bok) {
        if (ISBN.compareTo(bok.ISBN) != 0 && TUPPEL.compareTo(bok.TUPPEL) == 0) { // kunne brukt .equals
            return ISBN.compareTo(bok.ISBN)
        } 
        return TUPPEL.compareTo(bok.TUPPEL);
    }

    public leggTilKapittel(Kapittel kapittel){
        if (antallKapitler == 0) {
            første = siste = kapittel;
        } else {
            siste.settNeste(kapittel);
            siste.kapittel;
        }
        antallKapitler++;
    }

    public void leggTilKapittel(Kapittel kapittel, int kapittelnummer){
        if (kapittelnummer <= 0 || kapittelnummer > antallkapitler + 1){
            throw new UgyldigKapittelUnntak()
            System.out.println("Ugyldig kapittelnummer: "+ kapittelnummer);
        }
        if (antallKapitler == 0 || kapittelnummer = antallKapitler + 1) {
            leggTilKapittel(kapittel);
            return;
        }

        Kapittel ståsted = første;

        if (kapittelnummer == 1) {
            kapittel.settNeste(ståsted);
            første = kapittel;
            antallKapitler ++;
            return;
        }

        for (int i = 1, i < kapittelNummer - 1; i++){
            ståsted = ståsted.hentNeste();
        }

        Kapittel neste = ståsted.hentNeste();
        kapittel.settNeste(neste);
        ståsted.settNeste(kapittel);
        antallKapitler++;


    }



    public Kapittel fjernKapittel (int KapittelNummer) {
        if (KapittelNummer <= 0 || KapittelNummer > antallKapitler) {
            throw new UgyldigKapittelUntak("Ugyldig kapittel: "+ kapittelnummer);
        }

        Kapittel ståsted = første;
        Kapittel kapittel;

        if (kapittelnummer == 1) {
            kapittel = ståsted;
            første = ståsted.hentNeste();
            antallKapitler--;
            return kapittel;
        }

    }
}