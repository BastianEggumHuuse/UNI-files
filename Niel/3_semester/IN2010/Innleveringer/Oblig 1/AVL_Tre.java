public class AVLTre {

    AVL_Node root;

    
    public max(int v1, int v2){
        if (v1 >= v2) {
            return v1;
        } else {
            return v2;
        }
    }
    public findMin (AVL_Node z) {
        if (v.right == null && v.left == null) {
            return v;
        }
        if (v.left != null) {
            return findMin(v.left);
        } else if (v.right != null) {
            return findMin(v.right);
        }
    }

    public int height(AVL_Node v){
        if (v == null) {
            return -1;
        } else {
            return v.height;
        }
    }

    public setHeight(){
        if (v != null) {
            v.height = 1 + v.max(height(v.left),height(v.right))
        }
    }


    public AVL_Node høyreRotasjon(AVL_Node z){
        AVL_Node y = z.left;
        AVL_Node t1 = y.right;

        y.right = z;
        z.left = t1;

        setHeight(z);
        setHeight(y);

        return y;
    }   


    public AVL_Node venstreRotasjon(AVL_Node z){
        AVL_Node y = z.right;
        AVL_Node t1 = y.left;

        y.left = z;
        z.right = t1;

        setHeight(z);
        setHeight(y);

        return y;
    }  

    public AVL_Node BalanceFactor(AVL_Node z){
        if (z == null) {
            return 0;
        }
        return Height(z.left) - Height(z.right);
    }

    public AVL_Node Balance (AVL_Node z){
        if (BalanceFactor(z) < -1) {
            z.right = høyreRotasjon(z.right);
            return venstreRotasjon(z);
        }
        
        if (BalanceFactor(z) > 1 ) {
            z.left = venstreRotasjon(z.left);
            return høyreRotasjon(z);
        }
        
        return v;
    }

    public AVL_Node Insert (AVL_Node v , int x){

        if (v == null) {
            v = new AVL_Node(x);
        } else if (x < v.tall ) {
            v.left = Insert(v.left, x);
        } else if (x > v.tall) {
            v.right = Insert(v.right, x);
        }
        setHeight(v);
        return Balance(v);
    } 

    public Remove(v,x) {
        if (v == null) {
            return null;
        } 
        if (x < v.tall) {
            v.left = Remove(v.left, x);
        } else if (x > v.tall) {
            v.right = Remove(v.right,x);
        } else if (v.left == null) {
            v = v.right;
        } else if (v.right == null) {
            v = v.left;
        } else {
            u = FindMin(v.right);
            v.tall = u.tall
            v.right = Remove(v.right, u.tall);
        }
        SetHeight(v);
        return Balance(v);
    }

    public AVL_Node Search (AVL_Node v, int x){
        if (v == null) {
            return null;
        }
        if (v.tall == x) {
            return v;
        }
        if (x < v.tall) {
            return Search(v.left, x);
        }
        if (x > v.tall) {
            return Search(v.right, x);
        }
    }

    public boolean Contains (AVL_Node v, int x) {
        return (Search(v,x) != null);
    }

    public int Size(AVL_Node v){
        if (v == null) {
            return 0;
        } else {
            int leftSize = Size(v.left);
            int reightSize = Size(v.right);
            return 1 + leftSize + rightSize;
        }
    }
}