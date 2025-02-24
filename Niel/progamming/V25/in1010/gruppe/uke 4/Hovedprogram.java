public class Hovedprogram {
    public static void main(String[] args) {
       
        Figur sirkel1 = new Sirkel("Rød", 5);
        Figur sirkel2 = new Sirkel("Blå", 3);
        Sirkel sirkel3 = new Sirkel("Rød", 5); 

        System.out.println(sirkel1);
        System.out.println(sirkel2);
        System.out.println(sirkel3);

        System.out.println("Er sirkel1 lik sirkel2? " + sirkel1.equals(sirkel2)); 
        System.out.println("Er sirkel1 lik sirkel3? " + sirkel1.equals(sirkel3)); 

        System.out.println();

        Rektangel rektangel1 = new Rektangel("Grønn", 4, 6);
        Rektangel rektangel2 = new Rektangel("Gul", 3, 8);
        Rektangel rektangel3 = new Rektangel("Grønn", 4, 6); 

        System.out.println(rektangel1);
       

        System.out.println("Er rektangel1 lik rektangel2? " + rektangel1.equals(rektangel2)); 
        System.out.println("Er rektangel1 lik rektangel3? " + rektangel1.equals(rektangel3)); 

        System.out.println("Er rektangel1 lik sirkel1? " + rektangel1.equals(sirkel1)); 
    }
}

