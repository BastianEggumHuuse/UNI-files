public class Rektangel {

    private double lengde;
    private double bredde;

    public Rektangel (double l, double b) {   
        this.lengde = l;
        this.bredde = b;

    }
  
    public void oekLengde (double okning) {   
        lengde += okning;
    }
  
    public void oekBredde (double okning) {    
        bredde += okning;
    }
  
    public double areal () {    
        return this.lengde*this.bredde;
    }
  
    public double omkrets () {   
        return this.bredde*2 + this.lengde*2;
    }
  }