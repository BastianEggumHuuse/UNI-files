public class Hovedprogram {
    public static void main(String[] args) {
        // Opprette leger
        Lege lege = new Lege("Dr. Mario");
        Spesialist spesialist = new Spesialist("Dr. Luigi", "1881");

        // Opprette legemidler
        Vanlig paracet = new Vanlig("Paracet", 50, 500);
        Vanedannende muffin = new Vanedannende("Muffin", 120, 250, 5);
        Narkotisk morfin = new Narkotisk("Morfin", 300, 100, 10);

        // Opprette resepter
        HvitResept hvitResept = new HvitResept(paracet, lege, 1, 3);
        BlaResept blaResept = new BlaResept(muffin, spesialist, 2, 5);
        MilitærResept militærResept = new MilitærResept(morfin, spesialist, 3, 3);
        PResept pResept = new PResept(paracet, lege, 4, 2);

        // Skrive ut informasjon
        System.out.println("Leger:");
        System.out.println(lege);
        System.out.println(spesialist);

        //teste String hentKontrollkode()

        System.out.println("Spesialist kontrollkode: "+ spesialist.hentKontrollkode());

        System.out.println("\nLegemidler:");
        System.out.println(paracet);
        System.out.println(muffin);
        System.out.println(morfin);

        System.out.println("\nResepter:");
        System.out.println(hvitResept);
        System.out.println(blaResept);
        System.out.println(militærResept);
        System.out.println(pResept);


        // Test av farge-metoden

        System.out.println("\nFarge på hvite resepten: "+ hvitResept.farge());
        System.out.println("Farge på blaa resepten: "+ blaResept.farge());
        System.out.println("Farge på militær resepten: "+ militærResept.farge());
        System.out.println("Farge på P-resepten: "+ pResept.farge());


        // Test av prisABetale

        System.out.println("\nPris på hvite resepten: "+ hvitResept.prisABetale());
        System.out.println("Pris på blaa resepten: "+ blaResept.prisABetale());
        System.out.println("Pris på militær resepten: "+ militærResept.prisABetale());
        System.out.println("Pris på P-resepten: "+ pResept.prisABetale());

        // Test av bruk-metoden på en resept
        System.out.println("\nBruker en den hvite resepten:");
        System.out.println("Reit for bruk: " + hvitResept.hentReit());
        hvitResept.bruk();
        System.out.println("Reit etter bruk: " + hvitResept.hentReit());
    }
}
