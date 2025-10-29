import java.util.Scanner;

public class GuviTaskTwo {
    public static void main(String[] args) {
        Scanner text= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int inputone= text.nextInt();

        int amount=0;

        while ( inputone !=0 ){
            int cash=inputone %10;
            inputone=inputone/10;
            amount =amount *10+cash;

        }
        System.out.println(amount);


    }
}
