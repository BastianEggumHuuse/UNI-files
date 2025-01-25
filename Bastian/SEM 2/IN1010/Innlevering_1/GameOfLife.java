
class GameOfLife
{

    

    public static void main(String[] Args)
    {

        Verden v = new Verden(8,12);

        while(v.GenNR < 3)
        {
            v.Tegn();
            v.Oppdater();
        }

        System.out.println("");
        System.out.println("Spillet er ferdig :)");
    }

}