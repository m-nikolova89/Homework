package task2;

public class Compare{
    /*
    Условие:
    Сравнете 2 стринга дали са еднакви -
    подадени от конзолата и изпишете резултата в нея.
     */
        public static void main(String[] args) {
            // first string
            String s1 = "Gaming for Geeks";
            // second string
            String s2 = "Gaming for geeks";
            // check
            if (s1.equals(s2)) {
                System.out.println("Strings Are Equal");
            } else {
                System.out.println("Strings Are Not Equal");
            }
        }
}
