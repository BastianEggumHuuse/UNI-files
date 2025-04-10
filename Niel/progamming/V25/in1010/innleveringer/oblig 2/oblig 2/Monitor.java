import java.util.concurrent.locks.*;
import java.util.*;

public class Monitor {
    int teller = 0;
    Subsekvensregister register; 
    String filename;
    Lock lås;
    Condition tilfelle;

    public Monitor (String FileName){
        filename = FileName;
        register = new Subsekvensregister();
        lås = new ReentrantLock(true);
        tilfelle = lås.newCondition();
    }

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

    public Frekvenstabell taUt(){

        return register.taUt();

        }


    public Frekvenstabell[] taUtTo(){
        

        lås.lock();
        Frekvenstabell[] liste = new Frekvenstabell[2];
        try {

            while (antall() <= 1) {
                teller += 1;
                if (teller == 8) {
                    tilfelle.signalAll();

                    Frekvenstabell t = taUt();
                    t.skrivTilFil(filename);

                    return new Frekvenstabell[2];
                }
                tilfelle.await();
                if (teller == 8) {
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



    public int antall() {

        lås.lock();
        try {
            return register.antall();
        }
        finally {
            lås.unlock();
        }
    }

    public static Frekvenstabell les(String filnavn) {
        return Subsekvensregister.les(filnavn);
    }






}