package task4;
public class TaskArray1and2 {
    /*
    Условие №1:
    Да се напише програма, която създава масив с 20 елемента от целочислен тип
    и инициализира всеки от елементите със стойност равна на индекса на елемента умножен по 5.
    Елементите на масива да се изведат на конзолата.
     */
    public static void main(String[] args) {
        int[] arr = new int[20];
        double sum = 0;
        // Initializes each of the elements with a value
        // starting from 0, 1, 2, 3....19
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*5;
            // Formula for multiplying each element by 5.
            System.out.print(arr[i]);
            System.out.print("||");
        }
        /*
        Условие №2:
        Напишете програма, която изчислява средната стойност
        от всички числа в масив (може да се използва горния масив).
         */
        System.out.println("\n---------------------------");
        System.out.println("Calculating average of array [i] from 0...19:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            sum += arr[i];}
        {
            double average = sum / arr.length;
            System.out.print("Average value of array is: " + average);
        }
    }
}




