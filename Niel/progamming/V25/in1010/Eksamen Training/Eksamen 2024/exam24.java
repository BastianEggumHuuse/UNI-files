import java.util.Iterator;
import java.util.concurrent.locks.Conditions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



interface Motordrevet {
    int trekkraft();
}

abstract class Fly implements Motordrevet{

    String id;
    int motorAntall;
    int MTOW;
    int kraft;
    Fly neste;

    public String hentId() {
        return id;
    }

    public int hentMotorAntall() {
        return motorAntall;
    }

    public int hentMTOW() {
        return MTOW;
    }

    @Override
    public int trekkraft(){
        return kraft;
    }


    public Fly (int MTOW,int motorAntall,int kraft,String id){
        this.MTOW = MTOW;
        this.motorAntall = motorAntall;
        this.kraft = kraft;
        this.id = id;
    }

    public int finnMaxvekt(){
        int tall;

        if (neste =! null) {
            tall = neste.finnMaxvekt();
        } else {
            return MTOW;
        }

        if (tall > MTOW) {
            return tall;
        }

        return MTOW;
    }

}


abstract class MotorFly extends Fly{

    
    public MotorFly (int MTOW, int motorAntall, int kraft, String id){
        super(MTOW, motorAntall, kraft, id);
    }


}

class SeilFly extends Fly{
    int Synkehastighet;

    public SeilFly (int MTOW, int motorAntall, int kraft, String id, int Synkehastighet){
        super(MTOW, motorAntall, kraft, id);
        this.Synkehastighet = Synkehastighet;
    }

}	

class LasteFly	extends Motorfly{
    int maksvekt;

    public LasteFly (int MTOW, int motorAntall, int kraft, String id, int maksvekt){
        super(MTOW, motorAntall, kraft, id);
        this.maksvekt = maksvekt;
    }
}

class PassasjerFly{
    int passasjerer;

    public PassasjerFly (int MTOW, int motorAntall, int kraft, String id, int passasjerer){
        super(MTOW, motorAntall, kraft, id);
        this.passasjerer = passasjerer;
    }
}



class Flyformasjon {

    Fly førstefly;


    Flyformasjon(){

    }

    void leggTil(Fly nyttFly){

        if (førstefly =! null) {
            nyttFly.neste = førstefly;
        }

       førstefly = nyttFly;

    }


    public Boolean erMed(String id) {

        Fly finne = førstefly;

        while(finne != null) {
            if (finne.id.equals(id)) {
                return true;
            }

            finne = finne.neste;
        }

        return false;
    }


    public Fly taUt(String id){
        
        Fly finne = førstefly;
        Fly forrige = førstefly;

        while(finne != null) {
            if (finne.id.equals(id)) {

                if (finne =! førstefly) {
                    førstefly = finne.neste;
                    return finne;
                } 
                
                forrige.neste = finne.neste;  

                return finne;   
            
            }
            forrige = finne;
            finne = finne.neste;
            
        }

        return null;

    }


    @Override
    public Flyiter iterator() {
        return new Flyiter();
    }

    class Flyiter implements Iterator<Fly> {
        Fly iter;

        public Flyiter(){
            iter = førstefly;
        }

        @Override
        public Boolean hasNext(){
            if (iter == null){
                return false;
            }
            return true;
        }

        @Override
        public Fly next(){
            Fly dette = iter;
            iter = iter.neste;
            return dette;
        }

    }

    public PassasjerFly[] hentPassasjerFly(){
        int teller = 0;
        
        for(Fly f : this){
            if (f instanceof PassasjerFly){
                teller += 1;
            }
        }

        PassasjerFly[] array = new PassasjerFly[teller];

        teller = 0;

        for(Fly f : this){
            if (f instanceof PassasjerFly){
                array[teller] = (PassasjerFly)f;
                teller += 1;
            }
        }

    }

    public int totalVekt() {
        int total = 0;

        for(Fly f : this){
            total += f.hentMTOW();
        }

        return total;
    }

    public int maksVekt() {
        int Størst = førstefly.finnMaxvekt();

        return Størst;


    }
}



class Rullebane {
    int antallFly = 0;

    Lock lås = new ReentrantLock();

    Condition avventStartTillatelse = lås.newCondition();

    public void sjekkAvganger(){
        lås.lock();
        try {
            if (antallFly == 0) {
                return;
            }
            avventStartTillatelse.signal();
            antallFly -= 1;
        }finally{
            lås.unlock();
        }
    }

    public void hentStartTillatelse(Fly fly) {
        lås.lock();
        try {
            antallFly += 1;
            avventStartTillatelse.await();
        } catch(InterruptedExeption e) {
            return;
        }finally {
            lås.unlock();
        }
    }

    Condition avventStartTillatelse2 = lås.newCondition();

    Condition avventPilot = lås.newCondition();



    public void sjekkAvganger2(){
        lås.lock();
        try {
            
            while (antallFly == 0) {
                avventPilot.await();
            }

            avventStartTillatelse2.signal();
            antallFly -= 1;

        }finally{
            lås.unlock();
        }
    }

    public void hentStartTillatelse2(Fly fly) {
        lås.lock();
        try {
            antallFly += 1;
            avventPilot.signalall();
            avventStartTillatelse.await();
        } catch(InterruptedExeption e) {
            return;
        }finally {
            lås.unlock();
        }

    }
}


class Flygeleder implements Runnable{

    Rullebane monitor;

    Flygeleder(Rullebane rullebane){
        monitor = rullebane;
    }

    @Override
    public void run () {
        while (true) {
            monitor.sjekkAvganger();

            try {
                Thread.sleep(60 * 1000);
            } catch (InterruptedExeption e) {
                return;
            }

        }
    }
}


class Pilot implements Runnable{

    Rullebane monitor;
    Fly fly;

    Flygeleder(Rullebane rullebane, Fly fly){
        monitor = rullebane;
        this.fly = fly;
    }

    @Override
    public void run () {
        while (true) {
            monitor.hentStartTillatelse(fly);

        }
    }
}