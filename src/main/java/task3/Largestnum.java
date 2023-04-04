package task3;

import java.util.Scanner;

public class Largestnum {
    /*
    Условие:
    Напишете програма/метод, която приема от конзолата
    3 подадени числа определя кое е най-голямoтo.
     */
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for a: ");
        a = Integer.parseInt(sc.next());
        System.out.print("Enter number for b: ");
        b = Integer.parseInt(sc.next());
        System.out.print("Enter number for c: ");
        c = Integer.parseInt(sc.next());

        //Comparing numbers a,b,c;
        if (a >= b && a >= c)
            System.out.println(a + " is the largest Number");
        else if (b >= a && b >= c)
            System.out.println(b + " is the largest Number");

            //Prints c is the largest number if the above conditions are false;
        else
            System.out.println(c + " is the largest number");
    }
}




