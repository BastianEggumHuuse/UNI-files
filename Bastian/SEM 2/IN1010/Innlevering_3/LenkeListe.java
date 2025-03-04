
abstract class LenkeListe <E> implements Liste<E> 
{
    protected class Node
    {
        protected E element;
        protected Node prevElement;
        protected Node nextElement;

        public Node(E newElement,Node pElement, Node nElement)
        {
            element = newElement;
            prevElement = pElement;
            nextElement = nElement;
        }

        public E getElement()
        {
            return(element);
        }
    }

    protected Node firstElement;
    protected int elementCount = 0;

    @Override
    public int størrelse()
    {
        return(elementCount);
    }

    @Override
    public void leggTil (E x)
    {

        if (firstElement == null)
        {
            firstElement = new Node(x,null,null);
        }
        else
        {
            Node iterator = firstElement;

            while (iterator.nextElement != null)
            {
                iterator = iterator.nextElement;
            }

            iterator.nextElement = new Node(x,iterator,null);
        }

        elementCount += 1;
    }
    

    @Override
    public E hent()
    {
        return(firstElement.getElement());
    }

    @Override
    public E fjern()
    {
        E temp = firstElement.getElement();

        firstElement = firstElement.nextElement;
        elementCount -= 1;

        return(temp);
    }

    @Override
    public String toString()
    {
        String s = "";

        if (firstElement == null)
        {
            s = "Listen er tom";
        }
        else
        {
            Node iterator = firstElement;
            while (iterator != null)
            {
                s += (iterator.getElement() + " ");
                iterator = iterator.nextElement;
            }


        }

        return(s);
    }
}