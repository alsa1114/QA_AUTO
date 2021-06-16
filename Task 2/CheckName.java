//Составить алгоритм:
// если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
// если нет, то вывести "Нет такого имени"

import java.util.Scanner;

public class CheckName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");

        String s1 = scanner.nextLine();

        if (s1.equals("")) {

            System.out.println("Вы ничего не ввели");

        } else {

            if (s1.equals("Вячеслав")) {

                System.out.println("Привет," + s1 + "!");

            } else {

                System.out.println("К сожалению, нет такого имени");

            }
        }
    }
}
