
abstract class LenkeListe <E> implements Liste<E> 
{
    private class Node<T>
    {
        private T element;
        private Node<T> prevElement;
        private Node<T> nextElement;

        public Node(T newElement,Node<T> pElement, Node<T> nElement)
        {
            element = nyttElement;
            prevElement = pElement;
            nextElement = nElement;
        }

        public T getElement()
        {
            return(element);
        }
    }

    private Node<E> firstElement;

    void AddElement(E newElement,x newIndex)
    {
        if(firstElement == null)
        {
            firstElement = new Node<E>(newElement,null,null);
        }
    }
}