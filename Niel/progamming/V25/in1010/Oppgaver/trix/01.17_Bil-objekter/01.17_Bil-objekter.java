class Bil{

    private String eier;
    private String merke;

    public Bil(String e, String m){
        eier = e; //setter den globale verdien eier til lokale eier
        merke = m; //setter den globale verdien merke til lokale merke
    }


    public void infoOmBil(){

        System.out.println ("Eier:    "+ eier);
        System.out.println ("Merke:   "+ merke);

    }

}