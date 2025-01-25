class Verden
{
    Rutenett Nett;
    public int GenNR;

    public Verden(int Rad, int Kol)
    {
        GenNR = 0;

        Nett = new Rutenett(Rad,Kol);
        Nett.FyllMedTilfeldigeCeller();
        Nett.KobleAlleCeller();
    }

    public void Tegn()
    {
        Nett.TegnRutenett();

        System.out.println("\nDet er nå " + Nett.AntallLevende() + " Levende Celler");
        System.out.println("Nåverende Generasjon er nr " + GenNR + "\n");
    }

    public void Oppdater()
    {
        Nett.TellLevendePerCelle();
        Nett.OppdaterAlleCeller();
        GenNR ++;
    }
}