public class AVL_Node {
    int height;
    int element;
    AVL_Node left;
    AVL_Node right;

    public AVL_Node(int e){
        element = e;
        height = 1;
    }
}