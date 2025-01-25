class Rutenett
{
    int AntRader;
    int AntKolonner;
    Celle[][] Rutene;

    public Rutenett(int Rader,int Kolonner)
    {
        AntRader = Rader;
        AntKolonner = Kolonner;
        Rutene = new Celle[Rader][Kolonner];
    }

    public void LagCelle(int Rad,int Kol)
    {
        Celle NyCelle = new Celle();
        if (Math.random() <=0.3333)
        {
            NyCelle.SettLevende();
        }


        Rutene[Rad][Kol] = NyCelle;
    }

    public void FyllMedTilfeldigeCeller()
    {
        for(int i = 0; i < AntRader; i ++)
        {
            for (int j = 0; j < AntKolonner; j ++)
            {
                LagCelle(i,j);
            }
        }
    }

    public Celle HentCelle(int Rad,int Kol)
    {
        if (Rad < 0 || Rad >= AntRader || Kol < 0 || Kol >= AntKolonner)
        {
            return null;
        }

        return Rutene[Rad][Kol];
    }

    public void TegnRutenett()
    {
        for(int Rad = 0; Rad < AntRader; Rad ++)
        {
            TegnLinje();
            TegnRadCeller(Rad);
        }

        TegnLinje();
    }

    public void TegnLinje()
    {
        String Linje = "";
        for(int Kol = 0; Kol < AntKolonner; Kol ++)
        {
            Linje += "+---";
        }
        Linje += "+";

        System.out.println(Linje);
    }

    public void TegnRadCeller(int Rad)
    {
        String CelleRad = "";
        for(int Kol = 0; Kol < AntKolonner; Kol ++)
        {
            CelleRad  += ("| " + HentCelle(Rad,Kol).HentStatusTegn() + " ");
        }

        CelleRad += "|";
        System.out.println(CelleRad);
    }

    public void SettNaboer(int Rad, int Kol)
    {
        Celle HovedCelle = HentCelle(Rad,Kol);

        for(int i = Rad-1; i <= Rad + 1; i ++)
        {
            for(int j = Kol-1; j <= Kol + 1; j ++)
            {
                Celle NaboCelle = HentCelle(i,j);
                if (NaboCelle != null && NaboCelle != HovedCelle && HovedCelle.AntNaboer < 8)
                {
                    HovedCelle.LeggTilNabo(NaboCelle);
                } 
            }
        }
    }

    public void KobleAlleCeller()
    {
        for(int i = 0; i < AntRader; i ++)
        {
            for(int j = 0; j < AntKolonner; j ++)
            {
                SettNaboer(i,j);
            }
        }
    }

    public int AntallLevende()
    {
        int Teller = 0;

        for(int i = 0; i < AntRader; i ++)
        {
            for(int j = 0; j < AntKolonner; j ++)
            {
                Celle NyCelle = HentCelle(i,j);
                if (NyCelle.ErLevende())
                {
                    Teller += 1;
                }
            }
        }

        return(Teller);
    }

    //Disse metodene er ikke fra oppgaven, men jeg valgte å inkludere dem for leselighet

    public void TellLevendePerCelle()
    {
        for(int i = 0; i < AntRader; i ++)
        {
            for(int j = 0; j < AntKolonner; j ++)
            {
                Celle NyCelle = HentCelle(i,j);
                NyCelle.TellLevendeNaboer();
            }
        }
    }

    public void OppdaterAlleCeller()
    {
        for(int i = 0; i < AntRader; i ++)
        {
            for(int j = 0; j < AntKolonner; j ++)
            {
                Celle NyCelle = HentCelle(i,j);
                NyCelle.OppdaterStatus();
            }
        }
    }

}