import java.util.*;
import java.io.File;
import java.util.concurrent.CountDownLatch;

class KlargjørData {

    public static Monitor monitor1;
    public static Monitor monitor2;
    public static final int ANTALL_TRÅDER = 8;

    public static void main(String args[]) {

        String mappe = "Data/";
        String filnavn = mappe + args[0];

        monitor1 = new Monitor("smittet");
        monitor2 = new Monitor("ikke_smittet");

        Scanner fil = null;

        try {
            fil = new Scanner(new File(filnavn));
        } catch (Exception e) {
            System.out.println("Kunne ikke lese fil.");
            System.out.println(e.getMessage());
            System.exit(1);
        }

        // Finner ut hvor mange lesetraader vi trenger
        int antallLestraader = 0;
        while(fil.hasNextLine())
        {
            antallLestraader += 1;
            fil.nextLine();
        }

        fil = null;
        try {
            fil = new Scanner(new File(filnavn));
        } catch (Exception e) {
            System.out.println("Kunne ikke lese fil.");
            System.exit(1);
        }

        CountDownLatch leseSignal = new CountDownLatch(antallLestraader);

        while (fil.hasNextLine()) {
            String[] data = fil.nextLine().split(",");
            
            Runnable leser = null;
            if(data[1].equals("True"))
            {
                leser = new Lesetråd(mappe + data[0],monitor1,leseSignal);
            }
            else
            {
                leser = new Lesetråd(mappe + data[0],monitor2,leseSignal);
            }
            
            Thread traad = new Thread(leser);
            traad.start();

        }
        fil.close();

        // Venter...
        try
        {
            leseSignal.await();

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        for(int i = 0; i < ANTALL_TRÅDER; i += 1)
        {
            Runnable f1 = new Flettetråd(monitor1);
            Runnable f2 = new Flettetråd(monitor2);

            Thread t1 = new Thread(f1);
            Thread t2 = new Thread(f2);

            t1.start();
            t2.start();
        }
    
    }


}