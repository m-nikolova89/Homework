package task4;

import java.util.Scanner;
public class TaskArray4and5 {
    /*
    Условие №4:
    Напишете програма (метод), която отпечатва на конзолата числата от 1 до N.
    Числото N се приема като параметър.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for n: ");
        int n = Integer.parseInt(sc.next());
        // initialize the value of the variable i
        // with 1 and increment each time with 1

        for (int i = 1; i <= n; i++) {
            // print the value of the variable as
            // long as the code executes
            System.out.print(i + "  ");
        }
        /*
        Условие №5:
        Напишете програма, която отпечатва на конзолата
        числата от 1 до n, които не се делят на 3 и 7.
         */
        System.out.print("\n\nNumbers not divided by 3 & 7:  ");

        for (int i = 1; i <=n; i++) {
            if (i % 3 != 0 && i % 7 != 0)
                System.out.print(i + "  ");

        }
        System.out.println("\n");
    }
}


