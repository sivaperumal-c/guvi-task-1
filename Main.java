import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int inputone = text.nextInt();
        if (inputone >= 10) {
            for (int i = inputone; i <= 50; i++) {
                System.out.println(-i);

            }
            text.close();
        } else {
            System.out.println("invalid numbers");
        }
    }
}