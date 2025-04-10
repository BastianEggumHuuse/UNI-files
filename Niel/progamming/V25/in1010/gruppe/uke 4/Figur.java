abstract class Figur {
    protected String farge;
    protected double areal;

    public Figur(String farge, double areal){
        this.farge = farge;
        this.areal = areal;
    }

    public Figur(double areal){
        this.farge = "gjennomsiktig";
        this.areal = areal;
    }

    public double hentAreal(){
        return areal;
    }

    public String hentFarge(){
        return farge;
    }

    @Override
    public String toString(){
        return "Dette er en figur med farge " + farge + " og areal " + areal;
    }
}
