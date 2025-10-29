import java.util.Scanner;

public class GuviTaskThree {
    public static void main(String[] args) {
        Scanner mytype=new Scanner(System.in);
        System.out.println("Enter the number:");
        int text=mytype.nextInt();

        if (text>0){
            System.out.println("Positive");
        }else {
            System.out.println("negative");
        }
    }
}
