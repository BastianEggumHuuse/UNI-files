public class Bille extends Insekt {
    public final static String ART = "Ips Typographus";
    public static int antall = 0;
    private int antallEgg;
    private String kjoenn;
    private static Random random = new Random();


    public Bille(HashSet<String> kjennetegn) {
        super(kjennetegn);
        
        antallEgg = 0;
        if (random.nextDouble() > 0.5 {
            kjoenn = "hunn";
        } else {
            kjoenn = "hann";
        }
        antall++;
    }

    public static void oppdaterAntall(int differanse) {
        if (antall + differanse >= 0) {
            antall += differanse;
        }
    }

    public static int hentAntall() {
        return Bille.antall;
    }

    public void leggTilKjennetegn(String k) {
        kjennetegn.add(k);
    }

    private void leggEgg() {
        antallEgg += random.nextInt(40,81);
    }

    public String BilleMorgang() {
        String morgang = "\n";
        if (kjoenn.equals("hunn")) {
            int lengde = random.nextInt(15) + 10; //hva er dette?
            for (int i = 0; i < lengde; i++) {
                morgang += "~";
                if (random.nextDouble() < 0.3) {
                    this.leggEgg();
                    morang += "=";
                }
            }
        } else {
            morgang += "Jeg er en hann :c";
        }
        morgang += "\n";
        return morgang;
    }

    




}