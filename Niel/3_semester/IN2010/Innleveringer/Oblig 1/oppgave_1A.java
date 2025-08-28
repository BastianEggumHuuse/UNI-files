import java.util.*;
import java.util.Scanner;


class oppgave_1A {

    TreeSet<Integer> set;

    public static void main(String[] args){

        TreeSet<Integer> set = new TreeSet<Integer>();
        Scanner scanner = new Scanner(System.in);

        int linjer = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i < linjer; i++){
            String linje = scanner.nextLine();

            if (linje.equals("size")) {
                System.out.println(set.size());
                continue;
            }


            String[] splitArray = linje.split(" ");


            if (splitArray[0].equals("insert")) {
                set.add(Integer.parseInt(splitArray[1]));
            } else if (splitArray[0].equals("remove")) {
                set.remove(Integer.parseInt(splitArray[1]));
            } else if (splitArray[0].equals("contains")) {

                if (set.contains(Integer.parseInt(splitArray[1]))) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } 


        }
        scanner.close();
    }
}