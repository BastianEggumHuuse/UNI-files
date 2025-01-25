class Rutenett
{
    // Definerer Variabler i toppen av klassen.
    int AntRader;
    int AntKolonner;
    Celle[][] Rutene;

    // Konstruktør for klassen Rutenett, som kjøres når et nytt Rutenett-Objekt dannes.
    public Rutenett(int Rader,int Kolonner)
    {
        AntRader = Rader;
        AntKolonner = Kolonner;
        // Dette er en dobbel Array, som eventuelt kan tolkes som en matrise.
        Rutene = new Celle[Rader][Kolonner];
    }

    // Metode som lager en enkelt Celle, og så bestemmer om Cellen skal leve eller ikke ved starten av spillet.
    public void LagCelle(int Rad,int Kol)
    {
        // Bruker Celle-konstruktøren.
        Celle NyCelle = new Celle();
        if (Math.random() <=0.3333) // Hver Celle har en 1/3 sjanse for å leve ved starten av spillet
        {
            NyCelle.SettLevende();
        }

        // Du får tilgang til en dobbel array ved å først indeksere Rad, og så indeksere Kolonne.
        // Her får Cellen sin plass i rutenettet.
        Rutene[Rad][Kol] = NyCelle;
    }

    // Metode som fyller Rutenettet med tilfeldige Celler.
    public void FyllMedTilfeldigeCeller()
    {
        // Her bruker vi en dobbel for-løkke, et triks som dukker opp mange ganger i denne oppgaven, for å iterere gjennom hele rutenettet.
        for(int i = 0; i < AntRader; i ++)
        {
            for (int j = 0; j < AntKolonner; j ++)
            {
                // Bruker LagCelle-metoden skrevet over, sammen med koordinatene funnet fra for-løkkene.
                LagCelle(i,j);
            }
        }
    }

    // Metode som returnerer Celle-objektet for Cellen som ligger ved gitt koordinat.
    public Celle HentCelle(int Rad,int Kol)
    {
        // Her sjekker vi om posisjonen gitt av Rad og Kol er gyldig, altså at den er innenfor rutenettet.
        if (Rad < 0 || Rad >= AntRader || Kol < 0 || Kol >= AntKolonner)
        {
            // Vi returnerer null dersom posisjonen er ugyldig.
            return null;
        }

        return Rutene[Rad][Kol];
    }

    // Metode som tegner rutenetett for den nåverende generasjonen.
    public void TegnRutenett()
    {
        // Jeg har valgt å dele opp tegningen i en og en Rad, for å gjøre ting litt mer ryddig (Dette var ikke gitt fra oppgaven).
        for(int Rad = 0; Rad < AntRader; Rad ++)
        {
            // Bruker metoder for å tegne linjer og rader med Celler.
            // Hver rad med Celler har en linje over og under seg.
            TegnLinje();
            TegnRadCeller(Rad);
        }

        // Tegner en siste linje for å fullføre brettet.
        TegnLinje();
    }

    // Metode for å tegne linjer.
    public void TegnLinje()
    {
        //Linjene består av "+" og "-", som beskrevet i oppgaveteksten.
        String Linje = "";
        for(int Kol = 0; Kol < AntKolonner; Kol ++)
        {
            //Vi legger til et "segment" av linjen for hver kolonne i rutenettet.
            Linje += "+---";
        }
        Linje += "+";

        System.out.println(Linje);
    }

    // Metode for å tegne rader med celler.
    public void TegnRadCeller(int Rad)
    {
        // Radene består av "|" og Cellenes Statustegn, som vi kan hente via metoden Celle.HentStatusTegn()
        String CelleRad = "";
        for(int Kol = 0; Kol < AntKolonner; Kol ++)
        {
            // Her henter vi ut den cellen vi er på, og henter statustegn fra den.
            // Dette er grunnen til at denne metoden krever Rad som parameter.
            CelleRad  += ("| " + HentCelle(Rad,Kol).HentStatusTegn() + " ");
        }

        CelleRad += "|";
        System.out.println(CelleRad);
    }

    // Metode som setter naboer for en Celle ved gitte koordinater
    public void SettNaboer(int Rad, int Kol)
    {
        // Henter Cellen-objektet vi skal sette naboer for
        Celle HovedCelle = HentCelle(Rad,Kol);

        // igjen en dobbel for-løkke, her for å iterere gjennom alle 8 Cellene rundt HovedCellen.
        // Vi itererer altså først over de tre cellene over hovedcellen, så de to på hver sin side, og så de tre under.
        for(int i = Rad-1; i <= Rad + 1; i ++)
        {
            for(int j = Kol-1; j <= Kol + 1; j ++)
            {
                // Henter ut nabocelle for gitte koordinater
                Celle NaboCelle = HentCelle(i,j);
                // Sjekker om NaboCellen fins (At koordinatene er gyldige) og at NaboCellen ikke er HovedCellen, slik at Hovedcellen ikke får seg selv som nabo.
                if (NaboCelle != null && NaboCelle != HovedCelle)
                {
                    HovedCelle.LeggTilNabo(NaboCelle);
                } 
            }
        }
    }

    // Metode som kjører SettNaboer() for alle Cellene i rutenettet
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

    // Metode som teller totale antall levende celler.
    public int AntallLevende()
    {
        // Bruker en integer for å holde styr på antallet.
        int Teller = 0;

        for(int i = 0; i < AntRader; i ++)
        {
            for(int j = 0; j < AntKolonner; j ++)
            {
                Celle NyCelle = HentCelle(i,j);
                if (NyCelle.ErLevende()) // Telleren inkrementeres kun dersom Cellen lever.
                {
                    Teller += 1;
                }
            }
        }

        return(Teller);
    }

    //Disse metodene er ikke fra oppgaven, men jeg valgte å inkludere dem for leselighet

    // Metode som får hver Celle til å telle sine egne levende naboer
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

    // Metode som oppdaterer hver Celle i rutenettet, til neste generasjon.
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