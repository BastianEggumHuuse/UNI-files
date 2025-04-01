import java.util.*;
import java.io.PrintWriter;

class Frekvenstabell extends TreeMap<String, Integer> 
{

    @Override
    public String toString()
    {
        Set<String> keys = keySet();
        String outLine = "";

        for(String s : keys)
        {
            outLine += s + " " + get(s);
            if(s != lastKey())
            {
                outLine += "\n";
            }
        }

        return(outLine);
    }

    public static Frekvenstabell flett(Frekvenstabell f1, Frekvenstabell f2) 
    {
        Frekvenstabell flettet = new Frekvenstabell();
        
        Set<String> keys1 = f1.keySet();
        Set<String> keys2 = f2.keySet();

        for(String s : keys1)
        {
            flettet.put(s,f1.get(s));
        }

        for(String s : keys2)
        {
            if(flettet.containsKey(s))
            {
                flettet.put(s,flettet.get(s) + f2.get(s));
            }
            else
            {
                flettet.put(s,f2.get(s));
            }
        }

        return flettet;
    }

    public void skrivTilFil(String filnavn)
    {
        PrintWriter f = null;
        try 
        {
            f = new PrintWriter(filnavn);
        } catch (Exception e) {
            System.out.println("Kan ikke lage fil.");
            System.exit(1);
        }

        f.print(toString());
        f.close();
    }

}