import java.util.*;

public class view {
    private Scanner scanner;

    public View(){
        scanner = new Scanner(System.in);

    }

    public void displayMenu() {
        displayMessage("\nChoose and option: \n");
        displayMessage("1. Add columns\n");
        displayMessage("2. Add rows \n");
        displayMessage("3. Show the table \n");
        displayMessage("4. Write the table to a file \n");
        displayMessage("5. Exit \n");
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }


    public int getUserChoice(){
        System.out.println("\nEnter your choice: \n");
        while(!scanner.hasNextInt()) { //Spør basti hvordan index scanner
            System.out.println("\nNot valid choice");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public String getInput(String prompt) {
        System.outprintln(prompt);
        scanner.nextLine();
        return scanner.nextLine();
    }

    public void displayTable(String table) {
        System.out.println(table);
    }

    public void close() {
        scanner.close();
    }
}