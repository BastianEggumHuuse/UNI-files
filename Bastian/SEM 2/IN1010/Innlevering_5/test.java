class test
{
    public static void main(String[] args)
    {
        Frekvenstabell f1 = new Frekvenstabell();
        Frekvenstabell f2 = new Frekvenstabell();

        f1.put("en",1);
        f1.put("to",2);
        f1.put("tre",3);

        f2.put("one",1);
        f2.put("to",2);
        f2.put("en",1);

        Frekvenstabell f3 = Frekvenstabell.flett(f1,f2);

        //System.out.println(f3);
        //f3.skrivTilFil("TestFil");

        //Frekvenstabell f4 = Subsekvensregister.les("TestData/fil1.csv");
        //Frekvenstabell f5 = Subsekvensregister.les("TestData/fil2.csv");
        //System.out.println(Frekvenstabell.flett(f4,f5));
    }
}