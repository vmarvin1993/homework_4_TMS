/**
 * Создайте двумерный массив целых чисел.
 * Отсортируйте элементы в строках двумерного массива по возрастанию.
 *
 Result:

 Before
 7 5 4 1 9
 8 9 1 8 9
 9 3 5 3 4
 1 4 5 1 5
 3 1 4 3 6

 After
 1 4 5 7 9
 1 8 8 9 9
 3 3 4 5 9
 1 1 4 5 5
 1 3 3 4 6

 */
public class Array_6 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int min = 1;
        int max = 10;
        int res;
        System.out.println("Before");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = min + (int) (Math.random() * (max - min + 1));
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("After");


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i][j] > array[i][k]) {
                        res = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = res;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
