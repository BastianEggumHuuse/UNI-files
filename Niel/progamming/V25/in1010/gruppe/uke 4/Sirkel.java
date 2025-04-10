class Sirkel extends Figur {
    private double radius;

    public Sirkel(String farge, double radius) {
        super(farge, (Math.PI * radius * radius));
        this.radius = radius;
    }

    public Sirkel(double radius) {
        super((Math.PI * radius * radius));
        this.radius = radius;
    }

    @Override
    public String toString() {
        super.toString();

        return "Dette er en sirkel med farge " + farge + ", radius " + radius +", og areal " + areal;
    }

    @Override //sammenligner object lokasjon (om det er samme obj)
    public boolean equals(Object obj) {
        if (!(obj instanceof Sirkel)) {
            return false;
        }
        // Spør basitan hvorfor Sirkel i mean (Klasse) obj peker?
        Sirkel annenSirkel = (Sirkel) obj;
        //      type, 
        return (Double.compare(hentAreal(), annenSirkel.hentAreal()) == 0) && hentFarge().equals(annenSirkel.hentFarge());
    }
}
