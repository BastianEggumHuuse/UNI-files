public class Lege {

    public String navn;

    public Lege(String navn){
        this.navn = navn;
    }
    public String hentNavn(){
        return navn;
    }

    @Override
    public String toString(){
        return "Legenavn: "+ navn;
    }

    
}
