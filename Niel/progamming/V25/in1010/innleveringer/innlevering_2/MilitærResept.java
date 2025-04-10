public class MilitærResept extends HvitResept{
    
    public MilitærResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, 3);

    }

    @Override
    public int prisABetale() {
        return 0;  // 100% rabatt
    }    

}
