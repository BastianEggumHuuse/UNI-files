import java.util.concurrent.CountDownLatch;


public class Lesetråd implements Runnable{
    String filnavn;
    Monitor monitor;
    CountDownLatch barier;


// Konstruktør for Lesetråd-klassen    
    public Lesetråd(String ny_filnavn, Monitor ny_monitor,CountDownLatch ny_barier){
        filnavn = ny_filnavn;
        monitor = ny_monitor;
        barier = ny_barier;
    }


    @Override 
// Denne metoden blir automatisk kalt når tråden startes
    public void run(){
        Frekvenstabell tabel = Monitor.les(filnavn);
        monitor.settInn(tabel);
        barier.countDown();
    }
}
