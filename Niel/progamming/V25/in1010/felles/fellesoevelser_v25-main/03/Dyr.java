import java.util.*;

public abstract class Dyr { // Kan ikke opprette en instans av en abstrakt klasse

    public final static String RIKE = "Animalia"; // Deklarerer og initialiserer en konstant med det latinske navnet fra det biologiske hierarkiet
    protected HashSet<String> kjennetegn; // protected gjør feltet tilgjengelig for subklassene til Dyr, men ikke andre klasser
    protected static Random random = new Random(); // Vi trenger ikke en ny instans av denne for hver instans av Granbarkbille
    public Dyr(HashSet<String> kjennetegn) {
        this.kjennetegn = kjennetegn;
    }

    // En abstrakt metode --> implementeres ikke her, men MÅ implementeres i den første ikke-abstrakte subklassen
    public abstract void leggTilKjennetegn(String k);

}
