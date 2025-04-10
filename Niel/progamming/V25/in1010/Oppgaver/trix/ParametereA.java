public class ParametereA {
    public static void main(String[] args) {
        String a = "en tekst!";
        int b = 5;

        a = metodeEn(a);
        b = metodeTo(b);

        System.out.println(a);
        System.out.println(b);


        String c = "hei! ";
        String d = metodeTre(c);

        System.out.println(c);
        System.out.println(d);

    }

    public static String metodeEn(String a) {
        a = a + 12;
        System.out.println(a);
        return a;
    }

    public static int metodeTo(int b) {
        b = b + 2;
        return b;
    }    

    public static String metodeTre(String noe) {
        noe = noe + "og hallo!";
        return noe;
    }
}

