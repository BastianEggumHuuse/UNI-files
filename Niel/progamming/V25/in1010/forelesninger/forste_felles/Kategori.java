import java.util.ArrayList; 

public class Kategori {
    private String navn;
    private ArrayList<Plagg> plagg;

    public Kategori(String navn) {
        this.navn = navn;
        plagg = new ArrayList<>(); //kan skrive <String> men trenger ikke.
    }

    public void nyttPlagg(ArrayList<Plagg> farger) {
        Plagg p = new Plagg(farger);
        plagg.add(p);
    }

    public ArrayList<Plagg> finnPlaggMedFarge(String farge) {
        ArrayList<Plagg> liste = new ArrayList<>();

        for (Plagg p : plagg) {  //sjekke om Plagg p er i plagg array
            if (p.harFarge(farge)) {
                liste.add(p);
            }
        }
        return liste;
    }

    public Plagg trekkeTilfeldigPlagg(String farge) {
        ArrayList<Plagg> liste = finnPlaggMedFarge(farge);

        if (liste.length != 0) {  // kan gjøre : !liste.isEmpty()
            Random tilfeldig = new Random();
            int index = tilfeldig.nextInt(liste.size());
            return liste.get(index);
        }
        return null;

    }



}