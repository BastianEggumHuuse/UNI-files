class Binær_tre {


int tall;
Binær_tre parent = null;
Binær_tre rightChild = null;
Binær_tre leftChild = null;

Public Binær_tre (int ny_tall){
    tall = ny_tall;
}




public boolean contains(int x){
    if (tall ==  x){
        return true;
    } else if (tall > x) {
        if (leftChild != null) {
            return leftChild.contains(x);
        } 
        return false;

    } else if (tall < x) {
        if (rightChild != null) {
            return rightChild.contains(x);
        }
        return false;
    }
}


public void insert(int x){
    if (tall == x) {
        return;
    } else if (tall > x){
        if (leftChild != null) {
            leftChild.insert(x);
        }
        leftChild = new Binær_tre(x);
    } else if (tall < x) {
        if (rightChild != null) {
            rightChild.insert(x);
        }
        rightChild = new Binær_tre(x);
    }
}


public void remove(int x){
    if (tall == x) {
        if (rightChild != null) {
            binær_tre = rightChild;
            while (leftChild != null){

            }

        }
    }
}


public int size() {

    if (this == null) {
        return 0;
    }

    int total = 0;

    if (leftChild != null) {
        return leftChild;
    } 
    return false;

    } else if (tall < x) {
        if (rightChild != null) {
            return rightChild.contains(x);
        }
        return false;
    }    
}


"""
contains(set, x) er x med i mengden?
insert(set, x) setter x inn i mengden (uten duplikater)
remove(set, x) fjerner x fra mengden
size(set) gir antall elementer i mengden
"""



}