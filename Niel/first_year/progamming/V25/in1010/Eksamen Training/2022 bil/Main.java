import java.util.Scanner;

interface Elektrisk {
    public int BatteriStørrelse();
}

interface Dialog {
    public boolean svarJaEllerNei(String spørsmål);
}

abstract class Bil {

    final String bilnummer;
    final int pris;
    Bil neste = null;
    Bil forrige = null;


    Bil (String bilnummer, int pris) {
        this.bilnummer = bilnummer;
        this.pris = pris;
    }

    @Override
    public String toString() {
        String info = "Bilnummer: "+ bilnummer+" Pris: "+ pris;
        return info;
    }

    Bil finnBilR(Dialog dialog, boolean kunElektrisk) {
        if (! kunElektrisk && dialog.svarJaEllerNei("Liker du "+ this +"?")) {
            return this;
        }
        if (neste != null) {
            return neste.finnBilR(Dialog dialog, boolean kunElektrisk);
        }
        return null;       

    }

}

 class Personbiler extends Bil{
    final int antPassasjer;

     Personbiler (String bilnummer, int pris, int antPassasjer) {
        super(bilnummer, pris);
        this.antPassasjer = antPassasjer;
    }
    
    @Override
    public String toString() {
        String PersonbilInfo = super.toString()+ " Antall passasjerer: "+ antPassasjer;
        return PersonbilInfo;
    }
}

 class ElektriskPersonbiler extends Personbiler implements Elektrisk {
    final int batteriStørrelse;

     ElektriskPersonbiler(String bilnummer, int pris, int antPassasjer, int batteriStørrelse){
        super(bilnummer,pris,antPassasjer);
        this.batteriStørrelse = batteriStørrelse;
    }

    @Override
    public String toString(){
        String ElektriskPersonbilInfo = super.toString() + " Batteri størrelse: "+ batteriStørrelse;
        return ElektriskPersonbilInfo;
    }

    @Override 
    public int BatteriStørrelse(){
        return batteriStørrelse;
    }
}


 class Varebiler extends Bil {
    final int lasteVolum;

     Varebiler (String bilnummer, int pris, int lasteVolum) {
        super(bilnummer, pris);
        this.lasteVolum = lasteVolum;
    }
    
    @Override
    public String toString() {
        String VarebilInfo = super.toString()+ " Laste volum: "+ lasteVolum;
        return VarebilInfo;
    }
}

 class ElektriskVarebiler extends Varebiler implements Elektrisk {
    final int batteriStørrelse;

    ElektriskVarebiler(String bilnummer, int pris,int lasteVolum, int batteriStørrelse){
        super(bilnummer,pris,lasteVolum);
        this.batteriStørrelse = batteriStørrelse;
    }

    @Override
    public String toString(){
        String ElektriskVarebilInfo = super.toString() + " Batteri størrelse: "+ batteriStørrelse;
        return ElektriskVarebilInfo;
    }

    @Override 
    public int BatteriStørrelse(){
        return batteriStørrelse;
    }

}


 class TastaturDialog implements Dialog {
    
    @Override
    public boolean svarJaEllerNei (String spørsmål) {

        System.out.println(spørsmål + " ");
        Scanner bruker = new Scanner(System.in);
        String svar = bruker.nextLine();

        bruker.close();
        if (svar.equals("j")) {
            return true;
        } else {
            return false;
        }
        
    }
}

class GUIDialog implements Dialog {
    JFrame vindu = null;
    JPanel panel;
    JLabel tekstefelt;
    JButton jaKnapp;
    JButton neiKnapp;

    Thread hovedtråd = Thread.currentThread();
    boolean svaret = true;

    @Override
    boolean svarJaEllerNei (String spørsmål) {
        if (vindu == null) {
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exeption e) {
                System.exit(1);
            }
            
            vindu = new Jframe("Ja eller Nei");
            vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            panel = newJPanel();
            vindu.add(panel);

            tekstfelt = new JLabel(spørsmål);
            panel.add(tekstfelt);

            class SvarJaNei implements ActionListener {
                boolean svar;

                SvarJaNei (boolean jn) {
                    svar = jn;
                }

                @Override
                public void actionPerformed (ActionEvent e) {
                    svaret = svar;
                    hovedtråd.interrupt();
                }
            }

            jaKnapp = new JButton("Ja");
            jaKnapp.addActionListener(new SvarJaNei(true));
            panel.add(jaKnapp);

            neiKnapp = new JButton("Nei");
            neiKnapp.addActionListener(new SvarJaNei(false));
            panel.add(neiKnapp);
            vindu.pack();
            vindu.setVisible(true);
        } else {
            tekstfelt.setText(spørsmål);
        }

        try {
            Thread.sleep(1000000);
        } catch (InterruptedExeception e) {}

        return svaret;
    }
}


 class Bilkollektiv {
    final int AB;
    Bil[] alleBiler;
    Bil første = null;
    Bil siste = null;

    Bilkollektiv (int antall) {
        AB = antall;
        alleBiler = new Bil[AB];
    }



    void lagBilPris() {

        Bil billigst = alleBiler[0];

        for (int i = 0; i <= AB; i++) {

            if (billigst.pris > alleBiler[i]){  
                billigst = alleBiler[i];
            }
        }

        første = billigst;

        for (int i = 0; i < AB-1; i++){
            Bil nyBillig = alleBiler[0];

            for (int i = 0; i <= AB; i++) {
                if(nyBillig.pris <= billigst.pris) {
                    nyBillig = alleBiler[i];
                }
                if (nyBillig.pris > alleBiler[i].pris) {
                    if (billigst.pris < alleBiler[i].pris){
                        nyBillig = alleBiler[i];
                    }
                }

            billigst.neste = nyBillig;
            nyBillig.forrige = billigst;

            billigst = nyBillig;
        }


    }


    taUtBil(Bil b) {

        if (første == b && siste == b) {
            første = null;
            siste = null;
        } else if (start == b) {
            start = start.neste;
            start.forrige = null;
        } else if {siste == b} {
            siste.forrige = siste;
            siste.neste = null;
        } else {
            b.forrige.neste = b.neste;
            b.neste.forrige = b.forrige
        }
    
    b.forrige = null;
    b.neste = null;

    }

    Bil velgBil(Dialog d) {

        Boolean brukerSvar = d.svarJaEllerNei("Er du bare interessert i elbil?");

        Bil b = start;
        while (b != null) {
            if (b.erElbil() || brukerSvar == false) {
                if (d.svarJaEllerNei("Liker du: " + b + "?")) {
                    taUtBil(b);
                    return b;
                }
            }
        b = b.neste;
        }

        return null;
    }
        

    Bil velgBilR(Dialog d) {

        Boolean brukerSvar = d.svarJaEllerNei("Er du bare interessert i elbil?");

        Bil b = start.finnBilR(Dialog dialog, boolean kunElektrisk);

        if (b != null) {
            taUt(b);
            }

        return b;
        }

}
}








/*
 class Main {
    public static void main(String args[]) {
        ElektriskVarebiler bil1 = new ElektriskVarebiler ("niel",1,5,10);

        System.out.println(bil1);
    }
}
*/
