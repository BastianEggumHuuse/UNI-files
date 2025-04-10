public class utskrift {
    
    public static void main(String[] Args){
        String text = "Hei på deg";
        int tall = 10;
        int tall2 = 5;
        utskrift(text);
        utskrift(tall,tall2);
    }

    public static void utskrift(String tekst) {
        System.out.println("Her er teksten: "+tekst);
    }

    public static void utskrift(int tall1,int tall2) {
        int sum = tall1 + tall2;
        System.out.println("Her er tall 2: "+ sum);
    }


}
