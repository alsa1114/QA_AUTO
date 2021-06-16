//Составить алгоритм: если введенное число больше 7, то вывести “Привет”

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckNumber {

    public static void main(String[] args) {

        double num = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number, please:");

        try {
            num = in.nextDouble();

            if (num > 7) {

                System.out.println("Hello!");

            } else {

                System.out.println("Try again");
            }
            in.close();

        } catch (InputMismatchException e) {
            System.out.println("You entered symbol-(s), not number-(s).Please,try again");
        }
    }
}


