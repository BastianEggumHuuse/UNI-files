import java.util.Scanner;


class Handletur {
    public static void main (String[] args){
        

        int Broed = 20;
        int Melk = 15;
        int Ost = 40;
        int Youghurt = 12;

        int total = 0;

        System.out.println("");
        System.out.println("Hei! Velkommen til IFI-butikken.");

        System.out.println("Hvor mange broed vil du ha?");
        Scanner bruker_broed = new Scanner(System.in);
        int antall_broed = bruker_broed.nextInt();
        total += antall_broed*Broed;


        System.out.println("Hvor mange Melk vil du ha?");
        Scanner bruker_Melk = new Scanner(System.in);
        int antall_Melk = bruker_Melk.nextInt();
        total += antall_Melk*Melk;

        System.out.println("Hvor mange Ost vil du ha?");
        Scanner bruker_Ost = new Scanner(System.in);
        int antall_Ost = bruker_Ost.nextInt();
        total += antall_Ost*Ost;

        System.out.println("Hvor mange Youghurt vil du ha?");
        Scanner bruker_Youghurt = new Scanner(System.in);
        int antall_Youghurt = bruker_Youghurt.nextInt();

        total += antall_Youghurt*Youghurt;

        System.out.println("Totall pris: "+ total +"kr.");

    }
}
