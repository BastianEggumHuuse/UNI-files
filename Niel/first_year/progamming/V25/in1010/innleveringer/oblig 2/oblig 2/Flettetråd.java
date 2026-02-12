import java.util.concurrent.CountDownLatch;

public class Flettetråd implements Runnable{
    Monitor monitor;
    // Konstruktør - setter monitor
    public Flettetråd(Monitor ny_monitor){
        monitor = ny_monitor;
    }


    @Override 
    // Kjører fletting av tabeller til kun 1 gjenstår
    public void run(){
        while(true) {
            Frekvenstabell[] listeMedTo = monitor.taUtTo();
            // Avslutter hvis ikke nok tabeller
            if (listeMedTo[0] == null || listeMedTo[1] == null){
                break;
            }

            // Fletter og legger tilbake
            Frekvenstabell tabell = Frekvenstabell.flett(listeMedTo[0],listeMedTo[1]);
            monitor.settInn(tabell);
        } 
    }
}
