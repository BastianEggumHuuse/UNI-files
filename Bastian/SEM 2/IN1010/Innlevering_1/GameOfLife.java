import java.util.Scanner;

class GameOfLife
{

    

    public static void main(String[] Args)
    {

        int Rader = 8;
        int Kolonner = 12;
        try 
        {
            if(Args.length > 1)
            {
                Rader = Integer.parseInt(Args[0]);
                Kolonner = Integer.parseInt(Args[1]);
            }
        }
        catch (NumberFormatException e)
        {
            // Vi gjør ingen ting her :)
        }

        Verden v = new Verden(Rader,Kolonner);


        Scanner s = new Scanner(System.in);
        String Input = ""; 

        while(Input == "")
        {
            v.Tegn();
            v.Oppdater();

            Input = s.nextLine();
        }

        System.out.println("");
        System.out.println("Spillet er ferdig :)");
    }

}