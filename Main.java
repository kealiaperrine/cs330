
public class Main {
    public static void main(String[] args) {
        IceShop kiosk = new Kiosk();
        //IceShop store = new Store();

        kiosk.display();
        kiosk.order();
        kiosk.pay();

        // store.display();
        // store.order();
        // store.order();
    }
}
