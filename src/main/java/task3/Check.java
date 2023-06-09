package task3;

import java.util.Scanner;

public class Check {

    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for a: ");
        a = Integer.parseInt(sc.next());

        //Check if the entered number is ODD or Even
        if (a %2 == 0)
            System.out.println(a + " is Even");
        else
            System.out.println(a + " is ODD");
    }
}
