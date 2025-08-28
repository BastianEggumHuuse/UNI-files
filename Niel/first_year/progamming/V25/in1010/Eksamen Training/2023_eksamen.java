
interface Motordrevet {
    Boolean fossilt();
    int trekkraft();
}

public abstract class Skinnegående implements Motordrevet {
    final String id;
    final int sporvidde;
    Node forrige, neste;

    String brennstoff;
    int antallkW;

    public Skinnegående(String id, int sporvidde, Node forrige, Node neste, String brennstoff, int antallkW){
        this.id = id;
        this.sporvidde = sporvidde;
        this.forrige = forrige;
        this.neste = neste;
        this.brennstoff = brennstoff;
        this.antallkW = antallkW;
    }

    public int hentid(){
        return id;
    }

    public int hentsporvidde() {
        return sporvidde;
    }

    @Override
    public Boolean fossilt() {
        if (brennstoff.equals("bensin") || brennstoff.equals("diesel") || brennstoff.equals("kull") || brennstoff.equals("ved")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int trekkraft() {
        return antallkW;
    }



    public void sjekkDenneSporvidden() {

        if (neste == null){
            return null
        }

        if (sporvidde != neste.sporvidde) {
            throw new FeilSporvidde();
        }

        neste.sjekkDenneSporvidden();
    }
}


public class Lokomotiv extends Skinnegående {

    public Lokomotiv (String id, int sporvidde, Node forrige, Node neste, String brennstoff, int antallkW){
        super(id, sporvidde, forrige, neste, brennstoff, antallkW);

    }
}


public abstract class Vogn extends Skinnegående {

    final int lengde; //heltall i centimeter

    public Vogn (String id, int sporvidde, Node forrige, Node neste, String brennstoff, int antallkW, int lengde){
        super(id, sporvidde, forrige, neste, brennstoff, antallkW);
        this.lengde = lengde;

    }
}


public class Godsvogn extends Vogn {

    final float maxlastevekt; //desimal i kg

    public Godsvogn (String id, int sporvidde, Node forrige, Node neste, String brennstoff, int antallkW, int lengde , float maxlastevekt){
        super(id, sporvidde, forrige, neste, brennstoff, antallkW, lengde);
        this.maxlastevekt = maxlastevekt;

    }
}


public class Passasjer extends Vogn {

    final int antallpassasjer;

    public Passasjer (String id, int sporvidde, Node forrige, Node neste, String brennstoff, int antallkW, int lengde , int antallpassasjer){
        super(id, sporvidde, forrige, neste, brennstoff, antallkW, lengde);
        this.antallpassasjer = antallpassasjer;

    }
    
}


    // Øve mer på !!

public class Tog implements Iterable <Skinngåendede> {

    public Skinnegående første == null;
    public Skinnegående siste == null;



    void leggTil(Skinnegående ny) {
        if (første == null) {
            første = ny;
            siste = ny;
        } else {
            siste.neste = ny;
            ny.forrige = siste;
            siste = ny;
        }
    }

    void TaUt(Skinnegående s) {
        if (første == s && siste == s) {
            // Kun ett element i listen.
            første = null;
            siste = null;
        } else if (s == første) {
            første = første.neste;
            første.forrige = null;
        } else if (s == siste) {
            siste = siste.forrige;
            siste.neste = null;
        } else {
            s.forrige.neste = s.neste;
            s.neste.forrige = s.forrige;
        }
            s.forrige = s.neste = null;
            return s;
        }


    

    // Øve mer på !!

    Skinnegående finn(String id){
        
        Skinngående s = første;
        
        while (s != null) {
            if (s.hentId().equals(id)){
                return s;
            }
            s = s.neste;
        }
        return null;

    }

    // Øve mer på !!

    Skinnegående finnOgTaUt(String id){
        
        Skinngående s = finn(id);

        if (s == null) {
            return null;
        }

        return TaUt(s);
        
    }

    Skinnegående leggTilForan (Skinnegående valgtTog, Skinnegående nyTog) {
        nyTog.forrige = valgtTog.forrige; 
        nyTog.neste = valgtTog; // Spør basitan om når ting blir "mistet data" pls;

        if (valgtTog == første) {
            nyTog = første;
        } else {
            valgtTog.forrige.neste = nyTog;
        }

        nyTog.forrige = valgtTog;
    }


    // Oppgave 3f


    public Iterator<Skinnegående> iterator() {
        return new TogIterator();
    }

    class TogIterator implements Iterator<Skinnegående> {
        
        Skinnegående iterator = første;


        //spør bastian om forstå

        @Override
        public boolean hasNext() {
            if (iterator.neste == null) {
                return false;
            } 
            return true;
        }

        @Override
        public boolean Next() {
            Skinnegående neste = iterator;
            iterator = iterator.neste;
            return neste;
        }
    
    }





    // BASTIANN HEEEEELPPPPP GET ME OTUTTTT GET OUT OF MY SKINN

    Passasjervogn[] hentPassasjervogner () {

        int antallPvogner = 0;
        for (Skinnegående s: this) {
            if (s instanceof Passasjervogn) {
                antallPvogner++;
            } 
        }

        Passasjervogn[] array = new Passaskjervogn[antallPvogner];

        int index = 0;

        for (Skinnegående s: this) {
            if (s instanceof Passasjervogn) {
                array[index] = (Passasjervogn)s;
                index++;
            }
        }

        return array;
    }


    void sjekkSporvidde() {
        if (første == null){
            return null
        }

        vidde1 = første.hentsporvidde();

        for (Skinnegående s: this) {
            if (vidde1 != s.hentsporvidde()) {
                throw new FeilSporvidde();
            }
        }
    }



    void leggTilSikker(Skinnegående s) {
        if (første != null) {
            sjekkSporvidde();
            if (første.hentsporvidde() == s.hentsporvidde()){
                throw new FeilSporvidde();
            }
        }
        leggTil(s);
    }

    // 4d) 

    void sjekkeSporvidder() {
        if (første != null) {
            første.sjekkDenneSporvidden();
        }
    }



    class FeilSporvidde extends Exception {}

}



class Leter implements Runnable {

    Tog tog;
    Monitor monitor;
    String tekst; 


    Leter (Tog t, Monitor mon, String s) {
        tog = t;
        monitor = mon;
        tekst = s; 
    }


    @Override 

    public void run() {
    for (Skinnegående s: tog) {
        if (sx.hentId().startsWith(tekst))
            monitor.leggTil(s);
    }

    monitor.ferdigLeting();

    }
}

// I WHYYY THIS KATARINIAAABUIOLDDDDD


class Resultat implements Runnable {

    Monitor monitor;

    Resultat (Monitor mon) {
        monitor = mon;
    }





    @Override
    public void run () {
        try {
            while (true) {
                Skinnegående s = monitor.hentNeste();
                if (s == null) break;
                System.out.println(s);
            }
        } catch (InterruptedException e) {
            System.exit(1);
        }
    }
}

// Oppgave 5c
class Monitor {


    private int antLetereIgjen;
    private ArrayList<Skinnegående> buffer = new ArrayList<>();
    private Lock laas = new ReentrantLock();
    private Condition noeSkjer = laas.newCondition();


    Monitor (int ant) {
        antLetereIgjen = ant;
    }

    void leggTil (Skinnegående s) {
            laas.lock();
        try {
            buffer.add(s);
            noeSkjer.signal();
        } finally {
            laas.unlock();
        }
    }

    void ferdigLeting () {
        laas.lock();
    try {
        --antLetereIgjen;
        noeSkjer.signal();
    } finally {
        laas.unlock();
    }
}
    Skinnegående hentNeste () throws InterruptedException {
    laas.lock();
    try {
        while (buffer.size()==0 && antLetereIgjen>0) {
        noeSkjer.await();
    }
    if (buffer.size() > 0)
        return buffer.remove(0);
        return null;
    } finally {
    laas.unlock();
    }
    }
}
