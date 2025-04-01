import java.util.concurrent.CountDownLatch;

class Lesetraad implements Runnable
{
    private String filNavn;
    private Monitor monitor;
    CountDownLatch leseSignal;

    public Lesetraad(String filNavn_, Monitor monitor_,CountDownLatch leseSignal_)
    {
        filNavn = filNavn_;
        monitor = monitor_;
        leseSignal = leseSignal_;
    }

    @Override
    public void run()
    {
        Frekvenstabell f = Subsekvensregister.les(filNavn);

        /*
        System.out.println("--------------");
        System.out.println(f);
        System.out.println("--------------");
        */

        monitor.settInn(f);
        leseSignal.countDown();
    }
}