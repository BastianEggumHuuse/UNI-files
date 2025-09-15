class Oppgave_1_3
{
    public static void main(String[] args) {
        


    }
}

// Firstly, we have a very rudimentary binary tree
class SentenceTree
{
    SemanticObject Element;
    SentenceTree   Left;
    SentenceTree   Right;

    public SentenceTree(SemanticObject NewElement) 
    {
        Element = NewElement;
    }

    public SemanticObject Collapse()
    {
        // If we have any children, we have both, so we only have to check if one is null
        if(Left == null)
        {
            return Element;
        }

        // Collapsing the left and right children
        SemanticObject LeftElement  = Left.Collapse();
        SemanticObject RightElement = Right.Collapse();

        // Collapsing this node

        // Firstly, if either of the elements are null, we return null
        // This means that something has gone wrong
        if(LeftElement == null || RightElement == null)
        {
            return null;
        }

        // Now that we have gotten here, we have three possibilities


        return(null);

    }
}

interface SemanticObject<T>
{
    int GetType();
    T GetElement();
}