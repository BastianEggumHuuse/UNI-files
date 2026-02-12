class Rektangel extends Figur {
    private double bredde;
    private double hoyde;

    public Rektangel(String farge, double bredde, double hoyde) {
        super(farge, bredde*hoyde);
        this.bredde = bredde;
        this.hoyde = hoyde;
    }

    public Rektangel(double bredde, double hoyde) {
        super(bredde*hoyde);
        this.bredde = bredde;
        this.hoyde = hoyde;
    }

    @Override
    public String toString() {
        return "Dette er et rektangel med farge " + farge + ", bredde " + bredde +", hoyde " + hoyde + ", og areal " + areal;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rektangel)) {
            return false;
        }
        Rektangel annenRektangel = (Rektangel) o;
        
        return (Double.compare(hentAreal(), annenRektangel.hentAreal()) == 0) && hentFarge().equals(annenRektangel.hentFarge());

    }

}
