import java.util.Scanner;

public abstract class IceShop {
    protected Payment payment;
    protected Order order;
    protected Scanner scan;

    public abstract void display();

    public void setPayment(Payment p) {
        payment = p;
    }

    public void setOrder(Order o) {
        order = o;
    }

    public void order() {
        order.orderFunction();
    }

    public void pay() {
        payment.pay();
    }
}