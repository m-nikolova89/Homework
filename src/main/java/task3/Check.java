package task3;

import java.util.Scanner;

public class Check {
    /*
    Условие:
    Напишете програма/метод, която чете число
    и изписва в конзолата дали числото е четно или не.
     */
    public static void main(String[] args) {
        int a;

        Scanner SC = new Scanner(System.in);
        System.out.print("Enter number for a: ");
        a = Integer.parseInt(SC.next());

        //Check is a is ODD or Even
        if (a %2 == 0)
            System.out.println(a + " is Even");
        else
            System.out.println(a + " is ODD");
    }
}
