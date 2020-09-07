
import java.util.Scanner;

public class Ticket implements Order{
    String orderID;

    public void inputID()
    {
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter the ticket number: ");
        orderID = input.nextLine();
        input.close();
    }

    @Override
    public String getID() {
        return orderID;
    }

    @Override
    public void orderFunction() {
        inputID();
        System.out.print("order ticket " + orderID +  "\n");
    }

}