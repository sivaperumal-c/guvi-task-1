import java.util.Scanner;

public class GuviTaskFive {
    public static void main(String[] args) {
        Scanner test=new Scanner(System.in);
        System.out.println("Enter the purchase amount:");
        int amount= test.nextInt();

        if (amount>=500 && amount<=1000 ){

            int discount = (amount * 10) / 100; // Calculate 10% discount
            int discountedAmount = amount - discount;
            System.out.println("With Discount amount Pay :"+discountedAmount);
            System.out.println("Discount amount:"+discount);

        } else if (amount>1000) {

            int discountabove = (amount * 20) / 100; // Calculate 10% discount
            int discountedAmountnew = amount - discountabove;
            System.out.println("With Discount amount Pay :"+discountedAmountnew);
            System.out.println("Discount amount:"+discountabove);

        }else {
            System.out.println("discount not applicable below Rs.500:");
            System.out.println("pay:"+amount);
        }
    }
}
