import java.util.Scanner;

public class Differanse {



    public static void main(String[] args){
        
    Scanner input_1 = new Scanner(System.in);
    Scanner input_2 = new Scanner(System.in);

    System.out.println("Oppgi verdien til x:");

    int tall_1 = input_1.nextInt();

    System.out.println("Oppgi verdien til y:");

    int tall_2 = input_2.nextInt();

    int differanse = Math.abs(tall_1 - tall_2);

    System.out.println("Differansen mellom x og y er "+ differanse+".");

    input_1.close();
    input_2.close();
    }
}
