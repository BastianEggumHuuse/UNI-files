import java.util.*;
import java.io.File;

class Subsekvensregister
{
    private static final int SUBSEKVENSLENGDE = 3;

    private ArrayList<Frekvenstabell> register = new ArrayList<Frekvenstabell>();

    public void settInn(Frekvenstabell f)
    {
        register.add(f);
    }

    // Kom tilbake til denne!!!
    public Frekvenstabell taUt()
    {
        //Forutsetter at det ikke er tomt i listen.
        //Er litt usikker på hva det er vi skal med denne metoden?
        //Sto bare "fjerner vilkårlig frekvenstabell" i oppgaven.
        Frekvenstabell r = register.remove(register.size()-1);
        //System.out.println(r);
        //System.out.println("--");

        return(r);
    }

    public int antall()
    {
        return(register.size());
    }

    public static Frekvenstabell les(String filnavn)
    {
        Frekvenstabell f = new Frekvenstabell();

        Scanner fil = null;
        try 
        {
            fil = new Scanner(new File(filnavn));
        } catch (Exception e) {
            System.out.println("Kunne ikke lese fil.");
            System.out.println(e.getMessage());
            System.exit(1);
        }

        String currentString = null;
        char[] chars = null;
        while (fil.hasNextLine()) 
        {
            currentString = fil.nextLine();
            chars = currentString.toCharArray();

            for(int i = 0; i < chars.length - 2; i += 1)
            {   
                // From util
                char[] currentChars = Arrays.copyOfRange(chars, i, i + SUBSEKVENSLENGDE);
                String currentSubSequence = new String(currentChars);
                f.put(currentSubSequence,1); // put() overskriver duplikater, slik at vi bare får unike subsekvenser. 
            }
        }
        fil.close();
        
        return(f);
    }
}