
public class Stabel<E> extends LenkeListe
{

    // Dette funker ikke ????
    // Skal sjekke en gang :)

    @Override
    public void leggTil(E x)
    {
        Node temp = firstElement;
        firstElement = new Node(x,temp,null);

        elementCount += 1;
    }
}