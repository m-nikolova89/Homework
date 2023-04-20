package task6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    /*
    Условие:
    Напишете метод, който проверява дали въведен стринг може да бъде използван за парола.
    Основни правила за парола:
      -   Паролата трябва да е поне 8 символа;
      -   Паролата трябва да съдържа символ, число и букви;
     */
    public static boolean ValidPassword(String password) {

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        //check password length
        if( 8 <= password.length() && password==null) {
            return false;
        }

        // to check space
        if (password.contains(" ")) {
            return false;
        }
        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);

        // Return if the password
        // matched the ReGex
        return m.matches();
    }

    public static void main(String[] args) {
        String pass;

        System.out.println("Enter password: ");
        Scanner sc = new Scanner(System.in);
        pass = sc.nextLine();

        if (ValidPassword(pass)) {
            System.out.println(pass + " - Valid Password");
        }
        else {
                System.out.println(pass + " - Invalid Password!");
            }
        }
    }

