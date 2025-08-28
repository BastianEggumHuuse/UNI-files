class boolskeverdier{
    public static void main (String[] args){
        boolean sann = true;
        boolean falsk = false;

        System.out.println("Sann : " + sann);
        System.out.println("False : " + falsk);
        System.out.println("");

        if (sann =! falsk) {
            System.out.println("Forste test slo til!");
        } else {
            System.out.println("Noe gikk feil");
        }

        if (sann == falsk) {
            System.out.println("Noe gikk feil");
        } else {
            System.out.println("Andre test slo ikke til!");
        }


    }
}