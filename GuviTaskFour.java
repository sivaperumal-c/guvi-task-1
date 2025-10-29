import java.util.Scanner;

public class GuviTaskFour {
    public static void main(String[] args) {
        Scanner test=new Scanner(System.in);

        System.out.println("Enter the First value:");
        int first= test.nextInt();
        System.out.println("Enter the Second value:");
        int Second= test.nextInt();
        System.out.println("Enter the Third value:");
        int third= test.nextInt();

        int small =Math.min(first,Math.min(Second,third));

        System.out.println("Small value : "+small);

    }
}
