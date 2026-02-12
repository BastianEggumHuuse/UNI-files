import java.util.*;
import java.util.Scanner;


class AVL_main {

    AVL_Tre set;

    public static void main(String[] args){

        AVL_Tre set = new AVL_Tre();
        Scanner scanner = new Scanner(System.in);

        int linjer = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i < linjer; i++){
            String linje = scanner.nextLine();

            if (linje.equals("size")) {
                System.out.println(set.size(set.root));
                continue;
            }


            String[] splitArray = linje.split(" ");


            if (splitArray[0].equals("insert")) {
                set.root = set.Insert(set.root, Integer.parseInt(splitArray[1]));
            } else if (splitArray[0].equals("remove")) {
                set.root = set.Remove(set.root, Integer.parseInt(splitArray[1]));
            } else if (splitArray[0].equals("contains")) {
                System.out.println((set.contains(set.root,Integer.parseInt(splitArray[1]))));
            }
        scanner.close();
    }
}