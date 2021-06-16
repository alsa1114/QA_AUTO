//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

public class Array {

    public static void main(String[] args) {

        System.out.println("Дан массив чисел от 1 до 12");

        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        System.out.println("Элементы масссива, кратные 3ем:");

        for (int i = 0; i < myList.length; i++) {

            if (myList[i] % 3 == 0) {

                System.out.println(myList[i]);
            }
        }
    }
}
