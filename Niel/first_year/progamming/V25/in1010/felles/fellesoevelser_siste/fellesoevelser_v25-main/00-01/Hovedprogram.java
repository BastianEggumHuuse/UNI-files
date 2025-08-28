import java.util.*;
import java.io.*;

// Her har jeg skrevet et kjapt testprogram (som jeg ikke forventer dere skal skjønne alt av nå). Det er for deg som ønsker å teste koden din! Send inn farger.txt og kategorier.txt som argumenter når du har kompilert, slik: "java Hovedpgoram farger.txt kategorier.txt"
public class Hovedprogram {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Vennligst oppgi filnavnene til fargene og kategoriene som kommandolinjeargumenter");
	    System.exit(1);
        }	
	ArrayList<String> farger = lesFraFil(args[0]);
	ArrayList<String> kategorier = lesFraFil(args[1]);
	Garderobe garderobe = new Garderobe();

	for (int i = 0; i < kategorier.size(); i++) {
	    String kategori = kategorier.get(i);
	    ArrayList<String> fargeliste = new ArrayList<>(farger.subList(0, 2));
	    garderobe.nyttPlagg(kategori, fargeliste);
	    System.out.println("La til et nytt plagg med følgende kategori og farger: " + kategori + ", " + fargeliste);
	    Collections.shuffle(farger);
	}

	ArrayList<String> favoritter = new ArrayList<>();
	favoritter.add("kjole");
	favoritter.add("strømpebukse");

	boolean harAntrekk = garderobe.lagNyttAntrekk(favoritter, "grønn", "fest");

	if (harAntrekk) {
	    System.out.println("Jeg har et perfekt antrekk!");
	} else {
	    System.out.println("Jeg har ingenting å ha på meg! :((");
	}
      
    }

    private static ArrayList<String> lesFraFil(String filnavn) {
        ArrayList<String> liste = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filnavn));
            while (scanner.hasNextLine()) {
                String linje = scanner.nextLine().strip();
                liste.add(linje);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fant ikke filen: " + filnavn);
        }
        return liste;
    }


}
