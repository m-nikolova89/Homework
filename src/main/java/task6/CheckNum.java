package task6;

import java.util.Scanner;

public class CheckNum {
    /*
        Условие:
    Напишете метод, който проверява дали въведените 3 числа са:
    - Положителни;
    - Равни;
 */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        if ((a == b) && (b == c)) {
            System.out.println("Numbers are equal.");
        }

            if ((a >= 0) && (b >= 0) && (c >= 0)) {
                System.out.println("Entered numbers are all positive numbers.");
            }
            else if((a < 0) && (b < 0) && (c < 0)) {
                System.out.println("Entered numbers are all negative numbers.");
            }
            else {
                System.out.println("Entered numbers are mixed numbers.");
            }
        }
    }



