class Monitor
{
    private Subsekvensregister sRegister;

    public Monitor()
    {
        sRegister = new Subsekvensregister();
    }

    

    public void settInn(Frekvenstabell f)
    {
        sRegister.settInn(f);
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
}