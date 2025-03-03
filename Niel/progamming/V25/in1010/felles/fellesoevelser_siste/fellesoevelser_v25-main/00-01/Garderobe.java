import java.util.*;

public class Garderobe {

    private HashMap<String, Kategori> kategorier; // deklarerer en HashMap, som er samme datatype som Python sin "dict" --> en ordbok, les Javas dokumentasjon 
    private ArrayList<Antrekk> antrekk;

    public Garderobe() { // konstruktør uten parametere
        kategorier = new HashMap<>();
        antrekk = new ArrayList<>();
    }

    public void nyttPlagg(String kategorinavn, ArrayList<String> farger) {
        if (!kategorier.keySet().contains(kategorinavn)) { // .keySet() henter en mengde med nøklene i ordboka kategorier, og vi sjekker om kategorinavnet finnes i denne mengden med .contains()
            Kategori kategori = new Kategori(kategorinavn); // oppretter en ny Kategori kun hvis den ikke finnes fra før, ellers lager vi en ny kategori hver gang, og det vil vi ikke
            kategorier.put(kategorinavn, kategori);
        }	
        kategorier.get(kategorinavn).nyttPlagg(farger); // legger til et nytt plagg
    }

    public ArrayList<Antrekk> finnAntrekkTilAnledning(String anledning) {
        ArrayList<Antrekk> liste = new ArrayList<>();

        for (Antrekk a : antrekk) {
            if (a.passerTil(anledning)) {
                liste.add(a);
            }
        }	
        return liste;
    }

    public Antrekk velgFoersteAntrekk(String anledning, String farge) {
        ArrayList<Antrekk> liste = finnAntrekkTilAnledning(anledning);

        for (Antrekk a : liste) { // en liste er ordnet, og vi legger til elementer bakerst hele tiden, så hvis vi tar det første vi finner i denne løkka, blir det det første som ble lagt til 
            if (a.harFarge(farge)) {
                return a;
            }
        }
        return null;
    }

    public ArrayList<Plagg> finnPlaggTilAntrekk(ArrayList<String> kategorinavn, String farge) {
        ArrayList<Plagg> liste = new ArrayList<>();

        for (String navn : kategorinavn) {
	    
            if (!kategorier.keySet().contains(navn)) { // hvis ett av kategorinavnene ikke finnes, vil ikke ha noen liste, returner null
                return null;
            }
            Kategori kategori = kategorier.get(navn);
            Plagg plagg = kategori.trekkTilfeldigPlagg(farge);
	    
            if (plagg == null) { // hvis vi mangler et plagg med oppgitt farge vil vi heller ikke ha noen liste, returner null 
                return null;
            }
            liste.add(plagg);
        }

        return liste;
    }

    public boolean lagNyttAntrekk(ArrayList<String> kategorinavn, String farge, String anledning) {
        ArrayList<Plagg> liste = finnPlaggTilAntrekk(kategorinavn, farge);
	
        if (liste != null) {
            Antrekk a = new Antrekk(liste, anledning);
            antrekk.add(a);
            return true;
        }
        return false;
    }
}
