import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;


class Monitor
{
    private Subsekvensregister sRegister;

    private final ReentrantLock lock = new ReentrantLock();
    private Condition ikkeTom = lock.newCondition();

    private int threadCount = 0;
    private int waitCounter = 0;
    private String filNavn = "fil.txt";

    public Monitor(int threadCount_, String filNavn_)
    {
        sRegister = new Subsekvensregister();
        threadCount = threadCount_;
        filNavn = filNavn_;
    }



    public void settInn(Frekvenstabell f)
    {
        lock.lock();
        try
        {
            sRegister.settInn(f);
            ikkeTom.signalAll();
        }
        finally
        {
            lock.unlock();
        }
    }

    // Kom tilbake til denne!!!
    public Frekvenstabell taUt()
    {
        return(sRegister.taUt());  
    }

    public int antall()
    {
        return(sRegister.antall());
    }



    public Frekvenstabell[] taUtTo()
    {
        lock.lock();

        Frekvenstabell[] f = new Frekvenstabell[2];

        try
        {   
            // Venter på at det ligger 2 elementer i listen
            while (antall() <= 1)
            {
                waitCounter += 1;

                if(waitCounter == threadCount)
                {
                    ikkeTom.signalAll();

                    // Den siste traaden skriver ut den siste tabellen.
                    Frekvenstabell siste = taUt();
                    siste.skrivTilFil(filNavn);

                    return(null);
                }

                ikkeTom.await();

                if(waitCounter == threadCount)
                {
                    System.out.println("Yahoo");
                    return(null);
                }

                waitCounter -= 1;
            }

            System.out.println("GETTING FS!!!!");

            f[0] = taUt();
            f[1] = taUt();
        }
        catch(Exception e)
        {
            // traad ender opp her hvis den blir interrupted (Java krever at jeg har med catch-blokken)
        }
        finally
        {
            lock.unlock();
        }
        
        return(f);
    }
}