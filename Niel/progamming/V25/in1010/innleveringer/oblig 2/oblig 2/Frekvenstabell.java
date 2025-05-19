import java.util.*;
import java.io.PrintWriter;

class Frekvenstabell extends TreeMap<String, Integer> {
    @Override
    // Formaterer frekvenstabell til streng
    public String toString() {
        String LangStreng = "";
        for (String s : keySet()) {
            LangStreng += s + " " + get(s) + "\n";
        }
        return LangStreng;
    }

    // Slår sammen to frekvenstabeller
    public static Frekvenstabell flett(Frekvenstabell f1, Frekvenstabell f2) {
        Frekvenstabell flettet = new Frekvenstabell();
        
        // Legger inn alle fra første tabell
        for (String s : f1.keySet()) {
            flettet.put(s,f1.get(s));
        }

        // Legger til/oppdaterer med andre tabell
        for (String s : f2.keySet()) {
            if (flettet.containsKey(s)) {
                flettet.put(s,flettet.get(s)+f2.get(s));
            } else {
                flettet.put(s,f2.get(s));
            }
        }
        return flettet;
    }

    // Skriver tabellen til fil
    public void skrivTilFil(String filnavn) {
        PrintWriter skriver = null;
        try {
            skriver = new PrintWriter(filnavn);
        }
        catch (Exception e) {
            System.exit(1);
        }
        skriver.print(toString());
        skriver.close();
    }
}