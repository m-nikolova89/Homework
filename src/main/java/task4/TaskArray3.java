package task4;
public class TaskArray3 {
    /*
    Условие №3:
    Напишете програма, която приема масив от числа
    и изчислява сумата на всички четни и нечетни числа от поредицата
    изписвайки подходящо съобщение с резултата.
     */
    public static void main(String[] args) {

        int[] arr = new int[30];
        int even = 0;
        int odd = 0;
        System.out.print("\nArray of numbers: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i]+ " ");
            if (i % 2==0)
                even += arr[i];
            else
                odd += arr[i];
        }

        System.out.println("\nEven numbers sum: " + even);
        System.out.println("Odd numbers sum: " + odd);

        }
    }

