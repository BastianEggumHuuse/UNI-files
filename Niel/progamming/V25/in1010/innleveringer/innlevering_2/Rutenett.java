public class Rutenett {

    int antRader;
    int antKolonner;
    Celle[][] rutene;

    public Rutenett(int Rader,int Kolonner){
        antRader = Rader;
        antKolonner = Kolonner;
        rutene = new Celle[Rader][Kolonner];

    }

    public void lagCelle(int rad,int kol){

        Celle nyCelle = new Celle();

        if (Math.random() <=0.3333){
            nyCelle.settLevende();
        }

        rutene[rad][kol] = nyCelle;
    }

    public void fyllMedTilfeldigeCeller(){
        for (int i = 0; antRader > i; i++){
            for (int j = 0; j < antKolonner; j++) {
                lagCelle(i, j);
            }
        }
    }

    public Celle hentCelle(int rad ,int kolonne){
        if (antRader > rad && 0 < rad){
            if (antKolonner > kolonne && 0 < kolonne){
                return (rutene[rad][kolonne]);
            }
        }

        return(null);
    }


    public void tegnRutenett() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
        
        String radSeparator = "+";
        for (int kx = 0; kx < antKolonner; kx++) {
            radSeparator += "---+";
        }
        
        
        
        for (int rx = 0; rx < antRader; rx++) {
            
            System.out.println(radSeparator);
            
            System.out.print("|");
            for (int kx = 0; kx < antKolonner; kx++) {
                Celle celle = rutene[rx][kx];
                System.out.print(" " + celle.hentStatusTegn() + " |");
            }
            System.out.println();
        }
        
        System.out.println(radSeparator);
    }


    public void settNaboer(int rad, int kolonne){
        Celle celle = hentCelle(rad,kolonne);


    }





}