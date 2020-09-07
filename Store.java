
public class Store extends IceShop{
    public Store() {
        payment = new CreditCard();
        order = new Computer();
    }

    @Override
    public void display() {
        System.out.println("At a store");
    }

}