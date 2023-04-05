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
            System.out.print(next + " ");// TODO: 5.4.2023 г. add array to calculate sum

        }
    }
}




