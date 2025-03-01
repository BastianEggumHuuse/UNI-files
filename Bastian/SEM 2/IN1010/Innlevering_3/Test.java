
class Box
{
    public String Contents;

    Box(String c)
    {
        Contents = c;
    }
}

@SuppressWarnings("unused")
interface Lockable
{
    
}

class LockedBox extends Box 
{
    LockedBox(String c)
    {
        super(c);
    }
}
