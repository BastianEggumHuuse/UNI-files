class Celle
{
    // Definerer Variabler i toppen av klassen.
    boolean Levende;
    Celle[] Naboer;
    int AntNaboer;
    int AntLevendeNaboer;

    // Konstruktør for klassen Celle, som kjøres når et nytt Celle-Objekt dannes.
    public Celle()
    {
        Levende = false;
        Naboer = new Celle[8];
        AntNaboer = 0;
        AntLevendeNaboer = 0;
    }

    // Metoder som kontrollerer cellens "Levende"-verdi.
    public void SettDod()
    {
        Levende = false;
    }

    public void SettLevende()
    {
        Levende = true;
    }

    // Metode som brukes til å sjekke om en Celle er levende eller ikke.
    public boolean ErLevende()
    {
        return(Levende);
    }

    // Metode som returnerer riktig tegn for denne cellen.
    // Dette tegnet er '0' dersom cellen lever, og '.' dersom cellen er død.
    public char HentStatusTegn()
    {
        if (Levende)
        {   
            // I java brukes "" til å definere Strings, og '' til å definere Chars, altså enkeltkarakterer.
            return('0');
        }
        return('.');
    }

    // Metode som legger til en nabo til denne Cellen.
    // Disse naboene brukes til å sjekke om cellen skal leve neste generasjon
    // Legg merke til at Cellen ikke vet noe om hvor den selv er, eller hvor naboene er.
    // Den har bare tilgang til Naboenes Celle-objekter.
    public void LeggTilNabo(Celle NyNabo)
    {
        // Her forutsetter vi at vi ikke prøver å legge til mer enn 8 naboer 
        Naboer[AntNaboer] = NyNabo;
        AntNaboer ++;
    }

    // Metode som teller antall levende naboer.
    // Det er denne metoden vi bruker til å finne ut om Cellen skal leve. 
    public void TellLevendeNaboer()
    {
        AntLevendeNaboer = 0;

        for(int i = 0; i < AntNaboer; i++)
        {
            // Her bruker vi metoden ErLevende, skrevet over, til å finne Levende-verdien til Nabocellen.
            if (Naboer[i].ErLevende())
            {
                AntLevendeNaboer ++;
            }
        }
    }

    // Metode som oppdaterer Cellens status, basert på spillets regler.
    public void OppdaterStatus()
    {
        if (AntLevendeNaboer == 3)
        {
            SettLevende();
        }
        else
        {
            SettDod();
        }
    }
}