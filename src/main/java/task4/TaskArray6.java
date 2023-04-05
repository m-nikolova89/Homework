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

        int first = 0, second = 1, next;
        Scanner sc = new Scanner(System.in);

        System.out.println("Еnter Fibonacci number:");
        int n = sc.nextInt();
        System.out.println("Fibonacci series is ");

        for (int i = 0; i < n; i++) {
            if (i <= 1)
                next = i;
            else

                next = first + second;
                first = second;
                second = next;

            System.out.print(next + " ");

        }

        System.out.println("\nThe sum of n Fibonacci series is : " + sumOfFibonacci(n-1));

    }
        // Calculate sum of Fibonacci series
        public static int sumOfFibonacci(int n) {
        if(n <= 0)
            return 0;
        if(n == 1)
            return 1;
        return sumOfFibonacci(n-1)+sumOfFibonacci(n-2) + 1;
    }
}




