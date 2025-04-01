class Flettetraad implements Runnable
{
    private Monitor monitor;

    public Flettetraad(Monitor monitor_)
    {
        monitor = monitor_;
    }

    @Override
    public void run()
    {
        while(true)
        {
            Frekvenstabell[] f = monitor.taUtTo();

            if(f == null)
            {
                break;
            }

            // if(f[0] != null)
            // {
            //     System.out.println("f1 -------------");
            //     System.out.println(f[0]);
            //     System.out.println("f2 -------------");
            //     System.out.println(f[1]);
            //     System.out.println("end-------------");
            // }
            // else
            // {
            //     System.out.println("Null Issue???");
            // }


            Frekvenstabell flettet = Frekvenstabell.flett(f[0],f[1]);

            monitor.settInn(flettet);
        }
    }
}