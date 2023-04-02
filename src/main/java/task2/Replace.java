package task2;

import java.util.Scanner;
public class Replace {
    /*
    Условие:
    Заместете даден под-string в даден string с друг текст.
     */
    public static void main(String args[])
    {
        // Replace sub String
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text string: ");
        String str = sc.nextLine();
        System.out.println("Enter the string to be replaced: ");
        String old_str = sc.nextLine();
        System.out.println("Enter the new string: ");
        String new_str = sc.nextLine();
        String replaced = str.replace(old_str, new_str);
        System.out.println("replaced string: " + replaced);
    }
}

