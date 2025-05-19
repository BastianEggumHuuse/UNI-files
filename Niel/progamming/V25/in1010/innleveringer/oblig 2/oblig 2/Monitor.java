import java.util.concurrent.locks.*;
import java.util.*;

public class Monitor {
    int ant_tråder;
    int teller = 0;
    Subsekvensregister register; 
    String filename;
    Lock lås;
    Condition tilfelle;
    // Konstruktør - initialiserer monitor med filnavn
    public Monitor (String FileName, int ant_tråder){
        filename = FileName;
        register = new Subsekvensregister();
        lås = new ReentrantLock(true);
        tilfelle = lås.newCondition();
        this.ant_tråder = ant_tråder;
    }

    // Setter inn frekvenstabell i register (sikker trådtilgang)
    public void settInn(Frekvenstabell f) {

        lås.lock();
        try {
            register.settInn(f);
            tilfelle.signal();
        }
        finally {
            lås.unlock();
        }
        
    }

    // Henter ut en frekvenstabell
    public Frekvenstabell taUt(){
        return register.taUt();
        }

// Henter ut to frekvenstabeller
    public Frekvenstabell[] taUtTo(){
        
        lås.lock();
        Frekvenstabell[] liste = new Frekvenstabell[2];
        try {

            while (antall() <= 1) {
                teller += 1;
                if (teller == ant_tråder) {
                    tilfelle.signalAll();

                    Frekvenstabell t = taUt();
                    t.skrivTilFil(filename);

                    return new Frekvenstabell[2];
                }
                tilfelle.await();
                if (teller == ant_tråder) {
                    
                return  new Frekvenstabell[2];
                }
                teller -= 1;
            }
            liste[0] = taUt();
            liste[1] = taUt();
        } catch(Exception e) {
            System.out.println("Feil skjedde med å ta ut to frekvenstabeller.");
        } finally{
            lås.unlock();
            return liste;
        }
    }


    // Returnerer antall frekvenstabeller i register
    public int antall() {
        lås.lock();
        try {
            return register.antall();
        }
        finally {
            lås.unlock();
        }
    }
    
    // Statisk metode for å lese frekvenstabell fra fil
    public static Frekvenstabell les(String filnavn) {
        return Subsekvensregister.les(filnavn);
    }






}