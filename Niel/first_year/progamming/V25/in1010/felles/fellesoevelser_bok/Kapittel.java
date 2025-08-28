public class Kapittel {
    //private for at man ikke skal kunne nedre på de uten abstraksjon
    private Kapittel neste;
    private String tittel = "Ukjent tittel";
    private String tekst = "Ingen tekst";


    public Kapittel() {

    }


    public Kapittel(String tittel) {
        this.tittel = tittel;
    }


    public Kapittel hentNeste() {
        return neste;
    }

    public void settNeste(){
        neste = kapittel;
    }


    public void oppdaterTittel(String ny){
        tittel = ny;
    }


    public boid oppdaterTekst(String ny) {
        tekst = ny;
    }

    @Override
    public String toString() {
        return "Tittel: " + tittel + "\n" + "Tekst: " + tekst;
    }
}