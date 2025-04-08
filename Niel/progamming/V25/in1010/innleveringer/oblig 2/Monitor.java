import java.util.concurrent.locks.*;
import java.util.*;

public class Monitor {

    Subsekvensregister register;
    String fil; 
    Lock lås;
    Condition tilfelle;

    public Monitor (Subsekvensregister ny_register, String ny_fil){
        register = ny_register;
        fil = ny_fil;
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

        lås.lock();
        try {
            if (register.taUt() == null) {
                try {
                    tilfelle.await();
                } catch (InterruptedException e) {
                    System.out.println("hei");
                }
            }
            
            return register.taUt();
        }
        finally {
            lås.unlock();
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