public class TestClass
{
    public int Num = 10;
    private int HiddenNum;

    public TestClass(int NewNum)
    {
        HiddenNum = NewNum;
    } 

    public void Print()
    {
        System.out.println(Num);
        System.out.println(HiddenNum);

        // Krill Your shelf
    }
}