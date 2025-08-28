import java.util.HashSet;

public abstract class Insekt extends Dyr { // Insekt arver alle felt og metoder som Dyr har
    
    public final static String KLASSE = "Insecta"; // Insekt får en ny konstant klassevariabel 

    public Insekt(HashSet<String> kjennetegn) {
	super(kjennetegn); // Kallet på superklassen må stå øverst i konstruktøren
    }

    // Insekt er også en abstrakt klasse, og må derfor ikke implementere leggTilKjennetegn()

    
}
