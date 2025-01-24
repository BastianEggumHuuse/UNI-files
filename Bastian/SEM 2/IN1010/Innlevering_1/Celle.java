class Celle
{
    boolean Levende;
    Celle[] Naboer;
    int AntNaboer;
    int AntLevendeNaboer;

    public Celle()
    {
        Levende = false;
        Naboer = new Celle[8];
        AntNaboer = 0;
        AntLevendeNaboer = 0;
    }

    public void SetDod()
    {
        Levende = false;
    }

    public void SetLevende()
    {
        Levende = true;
    }

    public boolean ErLevende()
    {
        return(Levende);
    }

    public char HentStatusTegn()
    {
        if (Levende)
        {
            return('0');
        }
        return('.');
    }

    public void LeggTilNabo(Celle NyNabo)
    {
        // Her forutsetter vi at vi ikke prøver å legge til mer enn 8 naboer 
        Naboer[AntNaboer] = NyNabo;
        AntNaboer ++;
    }

    public void TellLevendeNaboer()
    {
        AntLevendeNaboer = 0;

        for(int i = 0; i < AntNaboer; i++)
        {
            if (Naboer[i].ErLevende)
            {
                AntLevendeNaboer ++;
            }
        }
    }

    public void OppdaterStatus()
    {
        if (AntLevendeNaboer == 3)
        {
            SetLevende();
        }
        else
        {
            SetDod();
        }
    }
}