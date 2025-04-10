public class LegemiddelTest {
    public static void main(String[] args) {
        // Test av Vanlig
        Vanlig paracet = new Vanlig("Paracet", 50, 500);
        System.out.println(paracet);

        //om du vil prøve..
        //System.out.println(paracet.hentNavn());
        //paracet.settNyPris(200);
        //System.out.println(paracet.hentPris());
        
        // Test av Vanedannende
        Vanedannende muffins = new Vanedannende("Muffins", 120, 250, 5);
        System.out.println(muffins);
        //System.out.println(muffins.hentNavn());

        
        // Test av Narkotisk
        Narkotisk morfin = new Narkotisk("Morfin", 300, 100, 10);
        System.out.println(morfin);
        // Teste settNyPris 
        morfin.settNyPris(200);

        // Skrive ut nytt pris
        System.out.println("Ny pris for Morfin: " + morfin.hentPris());
 
    }
}