
public class Computer implements Order{
    String orderID;
    static int currID = 0;

    @Override
    public String getID() {
        return orderID;
    }

    public String generateID() {
        currID++;
        String str = Integer.toString(currID);
        return str;
    }

    @Override
    public void orderFunction() {
        orderID = generateID();
        System.out.print("Order #" + orderID + " on computer\n");
    }

}