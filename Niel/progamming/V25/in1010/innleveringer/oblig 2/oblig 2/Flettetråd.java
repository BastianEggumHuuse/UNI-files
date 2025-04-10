import java.util.concurrent.CountDownLatch;

public class Flettetråd implements Runnable{
    Monitor monitor;

    public Flettetråd(Monitor ny_monitor){
        monitor = ny_monitor;
    }


    @Override 

    public void run(){
        while(true) {
            Frekvenstabell[] listeMedTo = monitor.taUtTo();

            if (listeMedTo[0] == null || listeMedTo[1] == null){
                break;
            }

            //System.out.print()

            Frekvenstabell tabell = Frekvenstabell.flett(listeMedTo[0],listeMedTo[1]);
            monitor.settInn(tabell);
        } 
    }
}
