class Test {

    public static void main(String args[]) {
        Frekvenstabell tabell = new Frekvenstabell();
        Frekvenstabell tabell2 = new Frekvenstabell();
        
        Frekvenstabell tabell3 = Subsekvensregister.les("TestData/fil1.csv");


        tabell.put("Top", 1);
        tabell.put("Mid", 2);
        tabell.put("Bot", 3);

        tabell2.put("Top", 1);
        tabell2.put("Mid", 2);
        tabell2.put("Bot", 3);

        Frekvenstabell flettetTable= Frekvenstabell.flett(tabell,tabell2);

        System.out.println(tabell);

        System.out.println(flettetTable);

        System.out.println(tabell3);




    }
}