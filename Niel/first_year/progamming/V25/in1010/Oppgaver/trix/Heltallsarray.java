class heltallarray {
    public static void main(String[] args) {
        int tall1 = 0;
        int tall2 = 1;
        int tall3 = 2;
        int tall4 = 3;
        int tall5 = 4;

        System.out.println("Utskrift av variable:");

        System.out.println("tall1 = " + tall1);
        System.out.println("tall2 = " + tall2);
        System.out.println("tall3 = " + tall3);
        System.out.println("tall4 = " + tall4);
        System.out.println("tall5 = " + tall5);

        int mittArray [] = new int [5];

        int lengdeArray = mittArray.length;
        
        for (int i = 0; i < lengdeArray; i++) {
            mittArray[i] = i;
        }

        System.out.println("Utskrift array:");

        for (int i=0; i < lengdeArray; i++) {
            System.out.println("Index[" + i + "] har tallet "+ mittArray[i] +".");
        }
    }
}