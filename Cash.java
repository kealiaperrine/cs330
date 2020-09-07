import java.util.Scanner;

public class Cash implements Payment{
    float saleAmt = 0; 
    float paymentAmt = 0;
    float change = 0;

    // public float inputAmount() {
    //     Scanner sc = new Scanner(System.in);
    //     float f = sc.nextFloat();
    //     sc.nextLine();
    //    // sc.close();
    //     return f;
    // }

    @Override
    public float getSaleAmt() {
        return saleAmt;
    }

    @Override
    public void setSaleAmt() {
        System.out.print("Enter sale amount: ");
        saleAmt = sc.nextFloat();
        // sc.nextLine();
        // System.out.print("Enter payment amount: ");  
        // paymentAmt = sc.nextFloat();
        // sc.close();
    }

    @Override
    public void pay() {
        System.out.println("Paying with cash.");
        setSaleAmt();
        System.out.println(saleAmt);
    }

    // public void setSaleAmt() 
    // {
    //     Scanner sc= new Scanner(System.in); 
    //     System.out.print("Enter sale amount: ");  
    //     saleAmt = sc.nextFloat();
    //     sc.nextLine();
    //     System.out.print("Enter payment amount: ");  
    //     paymentAmt = sc.nextFloat();
    //     sc.close();
    // }

    // public void pay()
    // {
    //     System.out.println("Paying with cash.");
    //     setSaleAmt();
    //     // inputPayment();
    //     calculateChange();
    //     System.out.print(change);
    // }

    // public void inputPayment() {
    //     Scanner scan= new Scanner(System.in); 
    //     System.out.print("Enter payment amount: ");  
    //     paymentAmt = scan.nextFloat();
    //     scan.close();
    // }

    // public void calculateChange() {
    //     change = paymentAmt - saleAmt;
    // }
}