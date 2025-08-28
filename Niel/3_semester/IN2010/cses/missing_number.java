import java.util.Scanner;


public class missing_number {

    static void algoritme (int i , int[] list) {
        
        int tall = 0; 
        while (tall < i){

            if (list.contains(tall)) {
                tall++;
            } else {
                System.out.println(tall);
            }

        }

    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Give a interger: ");

        int number_0 = input.nextInt();

        String numbers = input.nextString();
        
        String[] streng = numbers.split(" ");

        // Convert to integers
        List<Integer> numbers_list = new ArrayList<Integer>(streng.length);

        for (int i = 0; i < streng.length; i++) {
            numbers_list[i] = Integer.parseInt(streng[i]);
        }

        algoritme(number,numbers_list);

        input.close();
    }

}