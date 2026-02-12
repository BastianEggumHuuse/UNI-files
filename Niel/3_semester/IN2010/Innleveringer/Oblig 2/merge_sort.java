class merge_sort {

    static int[] Merge (int[]A1,int[]A2,int[]A){
        int n = A1.length + A2.length;
        int i = 0;
        int j = 0;

        while ((i < A1.length) && (j < A2.length)){
            if (A1[i] <= A2[j]){
                A[i+j] = A1[i];
                i = i + 1;
            } else {
                A[i+j] = A2[j];
                j = j + 1;
            }
        }

        while (i < A1.length) {
            A[i + j] = A1[i];
            i = i + 1;
        }
        while (j < A2.length) {
            A[i + j] = A2[j];
            j = j + 1;            
        }
        return A;
    }

    static int[] MergeSort (int[] A){
        int n = A.length;

        if (n <= 1) {
            return A;
        }

        int[] topHalf;
        int[] bottomHalf;

        int i = n/2;

        if (n % 2 == 0) {
            topHalf = new int[i];
            bottomHalf = new int[i];
            System.arraycopy(A, 0,topHalf, 0, i);
            System.arraycopy(A, i, bottomHalf, 0, i); // Parameterne er Liste, startpunkt, output liste, startpukt i output liste, antall verdier

        } else {
            topHalf = new int[(int)(i + 0.5)];
            bottomHalf = new int[(int)(i - 0.5)]; //caster til int fra float tall
            
            System.arraycopy(A, 0,topHalf, 0, (int)(i + 0.5));
            System.arraycopy(A, i, bottomHalf, 0, (int)(i - 0.5)); // Parameterne er Liste, startpunkt, output liste, startpukt i output liste, antall verdier

        }
 

        int[] A1 = MergeSort(topHalf);
        int[] A2 = MergeSort(bottomHalf);

        System.out.println("This shits fire");
        return Merge(A1, A2, A);
    }

    static int[] test = new int [] {70,13,321,12,5,9};

    static int[] test2 = new int [] {80,91,7,33,50,10};

    static int[] test_emty = new int [test.length + test2.length];


    public static void main(String[] args){

        MergeSort(test_emty);

        Merge(test,test2,test_emty);

        

        for (int x = 0; x < test_emty.length; x++) {
                System.out.println(test_emty[x]);
            } 
        
    }



}