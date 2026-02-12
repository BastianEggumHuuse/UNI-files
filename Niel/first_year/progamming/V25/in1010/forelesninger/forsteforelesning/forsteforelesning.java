class forelesning_1 {

    public static void main (String[] args) {
        
        String hilse = "Hello World";
        String liste2 = "Liste tall:";
        System.out.println(hilse);

        int [] mittArray = new int[10];

        mittArray[0] = 1;
        mittArray[1] = 2;
        mittArray[5] = 6;


        int tall = 10;

        for (int i = 0; i < tall; i++){
            System.out.println(mittArray[i]);
        }

        System.out.println(liste2);

        int [] liste_tall = new int[10];

        for(int i = 1; i < 11; i++){
            liste_tall[i-1] = i;
        }

        for (int i = 0; i < 10; i++){
            System.out.println(liste_tall[i]);
        }
    }

}
