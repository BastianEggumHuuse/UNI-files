import java.ultil.HashSet;

public abstract class Dyr {
    public final static String RIKE = "Animalia";
    public HashSet<String> kjennetegn;

    public Dyr(HashSet<String> kjennetegn) {
        this.kjennetegn = kjennetegn;

    }

    public abstract void leggeTilKjennetegn(String k);


}

