import java.util.Scanner;


public class weird_algoritim {

    static void algoritme (int i) {
        while (i != 1) {
            System.out.print(i + " ");

            if (i % 2 == 0){ // even number
                i = i / 2;
            } else {
                i = i * 3 + 1;
            }
        }

        System.out.println(i);
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Give a interger: ");

        int number = input.nextInt();

        algoritme(number);

        input.close();
    }

}