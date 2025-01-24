import java.util.Scanner;

class MindreStorre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tall = 0;
        

        System.out.println("Tast inn et tall:");
        tall = input.nextInt();

        if (tall < 10) {
            System.out.println("Tallet er under 10.");
        } else if (tall > 20) {
            System.out.println("Tallet er storre enn 20.");
        } else if (tall < 20) {
            System.out.println("Tallet er mellom 10 og 20.");
        }


    }
}
