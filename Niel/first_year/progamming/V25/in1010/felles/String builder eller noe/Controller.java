import java.util.*;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void start (){
        view.displayMessage("Elcome to the Markdown table creator!");
    }

    private void menyLoop(){
        while(True) {
            view.displayMenu();
            int choice = view.getUserChoice();

            if (choice == 1) {
                addColumns();
            } else if (choice == 2) {
                addRows();
            }else if () {
                String table = model.buildTable();
                view.displayTable(table);
            } else if (choice == 4) {
                //writeToFile();
            } else if (choice == 5) {
                view.displayMessage("\nBye\n");
                view.close();
                return;
            } else {
                view.displayMessage("Invalid choice. try again");
            }
        }
    }

    private void addColumns() {
        String input = view.getInput("\nEnter column names sparated by a comma: \n");
        String[] column = input.split(",");
        model.addColumns(columns);
        view.displayMessage("Added column: "+ Arrays.toString(columns));
    }

    private void addRows() {
        String input = view.getInput("\nEnter row data separated by a comma: \n");
        String[] rowData = input.split(",");
        if (rowData.length > model.tableSize()){
            view.displayMessage("You entered too many rows. Please try again.");
            return;
        }
        List<String> row = new ArrayList <> ();
        for (String data : rowData) {
            row.add(data.trim());
        }

        model.addRow(row);
        view.displayMessage("\nAdded row: "+ row + "\n");
    }


}