class Verden
{
    // Definerer Variabler i toppen av klassen.
    Rutenett Nett;
    public int GenNR;

    // Konstruktør for klassen Verden, som kjøres når et nytt Verden-Objekt dannes.
    public Verden(int Rad, int Kol)
    {
        // Denne variabelen holder styr på hvilken generasjon vi er på
        GenNR = 0;

        // Skaper et Rutenett-objekt, fyller det med Celler, og Kobler disse Cellene sammen.
        Nett = new Rutenett(Rad,Kol);
        Nett.FyllMedTilfeldigeCeller();
        Nett.KobleAlleCeller();
    }

    // Metode som tegner hele rutenettet, og printer informasjon om den nåværende generasjonen.
    public void Tegn()
    {
        Nett.TegnRutenett();

        System.out.println("\nDet er nå " + Nett.AntallLevende() + " Levende Celler");
        System.out.println("Nåverende Generasjon er nr " + GenNR + "\n");
    }

    // Metode som oppdaterer hele brettet, og inkrementerer Generasjons-nummeret.
    public void Oppdater()
    {
        Nett.TellLevendePerCelle();
        Nett.OppdaterAlleCeller();
        GenNR ++;
    }
}