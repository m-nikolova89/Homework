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
        int n;

        System.out.print("Enter how many Fibonacci numbers to print: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] fArray= new int[n];

        System.out.print("The first " + n + " Fibonacci numbers are: ");
        System.out.print(first + " " + second);//todo add if

        for (int i = 1; i <= n-2; ++i) {
           int next = first + second;
           first = second;
           second = next;
           System.out.print(" " + next);
           fArray[i-1]= first;
           fArray[i]= second;
        }
        System.out.println();
        for (int i = 0; i < fArray.length; i++) {
            System.out.println(fArray[i]);
        }
    }
}
