import java.util.Scanner;

public class input {

    private int teller = 0;
    Scanner myObj = new Scanner(System.in);  

    public int hentVerdi(){
        
        return this.teller;

    }
    
    public void enter(){
    

        while (this.teller < 10) {
            String bruker = myObj.nextLine();

            if (bruker == "") {
                this.teller++;
                System.out.println("teller:"+this.teller);
            } else {
                System.out.println("Noe gikk galt");
                break;
            }
    }
    }

}