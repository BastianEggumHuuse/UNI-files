class oppgave {

    static int[] test = new int [] {80,91,7,33,50,70,13,321,12};

    static void Swap (int[] A, int j) {
        int temp = A[j];
        A[j] = A[j-1];
        A[j-1] = temp;
    }

    static int[] Insertion_sort (int[] A) {
        
        for (int i = 1; i <= A.length - 1; i++) {
            int j = i;
            while (j > 0 && A[j-1] > A[j]) {
                Swap(A,j);
                j = j - 1;
            }
        }
        return A;
    }


    public static void main(String[] args){

        Insertion_sort(test);
        for (int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }
        
    }
    


}