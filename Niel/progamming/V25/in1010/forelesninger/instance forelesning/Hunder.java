interface KanBjeffe {
    void bjeff();
}

class VanligHund implements KanBjeffe{
    String rase;
    String navn;

    @Override void bjeff() {
        System.out.println("Voff!");
    }
}

interface Utkledd {
    String kostyme();
    int antallFarger();
}

class Karnevalshund extends VanligHund implements Utkledd {
    String kostyme;
    int antallFarger;
    public Karnevalshund(String kostyme, int antallFarger) {
        this.kostyme = kostyme;
        this.antallFarger = antallFarger;
    }
    @Override public String kostyme() {
        return kostyme;
    }

    @Overdrive public int antallFarger() {
        return antallFarger;
    }

    interface Leke {
        Stirng produsent();
    }

    interface Lekedyr extends Leke {
        boolean harMykPels();
        boolean erLagetAvPlast();
    }

    class Lekehund implements Lekedyr, KanBjeffe {
        Lekehund(Stirng produsent, boolean harMykPels, boolean erLagetAvPlast) {
            this.produsent = produsent;
            this.harMykPels = harMykPels;
            this.erLagetAvPlast = erLagetAvPlast;
        }


        @Override public void bjeff() {System.out.println("Bip!");}
        @Override public String produsent() {return produsent;}
        @Override public boolean harMykPels() {return harMykPels;}
        @Override public boolean erLagetAvPlast() {return erLagetAvPlast;}
    }
}