import java.util.*;

public class Kategori {
    private String navn;
    private ArrayList<Plagg> plagg;

    public Kategori(String navn) {
        this.navn = navn;
        plagg = new ArrayList<>();
    }

    public void nyttPlagg(ArrayList<String> farger) {
        Plagg p = new Plagg(farger);
        plagg.add(p);
    }

    public ArrayList<Plagg> finnPlaggMedFarge(String farge) {
        ArrayList<Plagg> liste = new ArrayList<>();

        for (Plagg p : plagg) {
            if (p.harFarge(farge)) {
                liste.add(p);
            }
        }	
        return liste;
    }

    public Plagg trekkTilfeldigPlagg(String farge) {
	ArrayList<Plagg> liste = finnPlaggMedFarge(farge); // vi bruker en metode vi tidligere har definert i samme klasse. Vi trenger ikke bruke "this" slik "this.finnPlaggMedFarge()" fordi det her er entydig hvilken klasse metoden hører til 
	
	if (!liste.isEmpty()) { // "!" foran gir negasjonen av hele det boolske uttrykket vi skriver bak
	   Random random = new Random();
	   int indeks = random.nextInt(liste.size()); // les dokumentasjonen til Random
	   return liste.get(indeks);
	}	
	return null;	    	
    }
}
