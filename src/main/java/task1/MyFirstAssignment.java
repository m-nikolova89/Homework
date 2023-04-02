package task1;

import java.util.Scanner;
public class MyFirstAssignment {
    /*
    Условие:
    Напишете програма, която:
    - Чете за име на потребител;
    - Чете за любимо хоби на потребителя;
    - Изписва в конзолата подходящо съобщение за потребителя и хобито;
     */
    public static void main(String[] args)
    {
        String name, hobby;

        Scanner SC=new Scanner(System.in);

        System.out.print("Enter name: ");
        name= SC.nextLine();

        System.out.print("Enter Hobby: ");
        hobby=SC.nextLine();

        System.out.println();
        System.out.println("Nice to meet you " + name + "!");
        System.out.println("It's good to hear that you love " + hobby + "!");
    }
}