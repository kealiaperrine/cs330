
public class Kiosk extends IceShop{
    public Kiosk() {
        payment = new Cash();
        order = new Ticket();
    }

    @Override
    public void display() {
        System.out.println("At a kiosk");
    }
}