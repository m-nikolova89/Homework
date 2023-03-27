package task3;

import java.util.Scanner;

public class Rectangle {
        static int areaRectangle(int a, int b){
            int area = a * b;
            return area;
        }
        static int perimeterRectangle(int a,int b){
            int perimeter = 2 * (a + b);
            return perimeter;
        }
    public static void main(String[] args) {
        int a, b;

        Scanner SC = new Scanner(System.in);
        System.out.print("Enter number for a: ");
        a = Integer.parseInt(SC.next());
        System.out.print("Enter number for b: ");
        b = Integer.parseInt(SC.next());
        System.out.println("Area = "+ areaRectangle(a,b));
        System.out.println("Perimeter = "+ perimeterRectangle(a,b));
    }
}
