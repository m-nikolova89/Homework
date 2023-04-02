package task4;

import java.util.Scanner;

public class TaskArray6 {
    /*
    Условие №6:
    Напишете програма, която отпечатва сумата на
    първите N члена от редицата на Фибоначи.Числата на Фибоначи започват от 0 и 1,
    като всяко следващо се получава като сума от предходните две.
     */
    public static void main(String[] args) {
        int first = 0, second=1;
        int N;
        System.out.print("Enter how many Fibonaci numbers to print: ");
        Scanner SC = new Scanner(System.in);
        N = SC.nextInt();
        System.out.print("The first " + N + " Fibonacci numbers are: ");
        System.out.print(first + " " + second);
        for (int i = 1; i <= N-2; ++i) {
           int sum = first + second;
           first = second;
           second = sum;
           System.out.print(" " + sum);
        }
    }
}
