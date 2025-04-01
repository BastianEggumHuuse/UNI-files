import java.io.File;
import java.util.Scanner;

class KlargjorData
{
    public static void main(String[] args)
    {
        String filnavn = "TestData/metadata.csv";//args[0];
        File fil = new File(filnavn);
        String mappe = fil.getParent() + "/";

        Monitor smittet = new Monitor();
        Monitor ikkeSmittet = new Monitor();

        Scanner scanner = null;
        try 
        {
            scanner = new Scanner(new File(filnavn));
        } catch (Exception e) {
            System.out.println("Kunne ikke lese fil.");
            System.out.println(e.getMessage());
            System.exit(1);
        }

        while(scanner.hasNextLine())
        {
            String[] strings = scanner.nextLine().split(",");
            String currentFilNavn = mappe + strings[0];
            String currentSmittet = strings[1];

            Runnable leser = null;
            if(currentSmittet.equals("True"))
            {
                leser = new Lesetraad(currentFilNavn,smittet);
            }
            else
            {
                leser = new Lesetraad(currentFilNavn,ikkeSmittet);
            }
            
            Thread traad = new Thread(leser);
            traad.start();
        }
        scanner.close();
    }
}