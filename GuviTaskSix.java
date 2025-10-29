import java.util.Scanner;

public class GuviTaskSix {
    public static void main(String[] args) {
        //Scanner text = new Scanner(System.in);
        //int Newtext = text.nextInt();
//        System.out.println(Newtext);
//        text.close();
                int n = 5;
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++)
                        System.out.print(j<=i ? n-j : n-i);

                    System.out.println();
                }
            }
        }

