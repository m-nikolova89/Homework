package task1;

import java.util.Scanner;
public class MyFirstAssignment {

    public static void main(String[] args)
    {
        String name;
        String hobby;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name: ");
        name= sc.nextLine();

        System.out.println("Enter Hobby: ");
        hobby=sc.nextLine();

        System.out.println("Nice to meet you " + name + "!");
        System.out.println("It's good to hear that you love " + hobby + "!");
    }
}