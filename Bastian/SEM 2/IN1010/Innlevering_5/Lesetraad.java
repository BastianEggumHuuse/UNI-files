class Lesetraad implements Runnable
{
    private String filNavn;
    private Monitor monitor;

    public Lesetraad(String filNavn_, Monitor monitor_)
    {
        filNavn = filNavn_;
        monitor = monitor_;
    }

    @Override
    public void run()
    {
        Frekvenstabell f = Subsekvensregister.les(filNavn);

        System.out.println(f);
        monitor.settInn(f);
    }
}