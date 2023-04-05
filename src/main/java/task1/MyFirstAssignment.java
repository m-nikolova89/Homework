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

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name: ");
        name= sc.nextLine();

        System.out.println("Enter Hobby: ");
        hobby=sc.nextLine();
        
        System.out.println("Nice to meet you " + name + "!");
        System.out.println("It's good to hear that you love " + hobby + "!");
    }
}