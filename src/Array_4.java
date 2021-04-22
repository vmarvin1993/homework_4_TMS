/**
 * Создайте двумерный массив целых чисел.
 * Выведите на консоль сумму всех элементов массива.
 Числа в массиве: {1, 3, 5}, {7, 2, 6}
 Результат:
 24
 */
public class Array_4 {
    public static void main(String[] args) {
        int[][] array = {{1, 3, 5}, {7, 2, 6}};
        int sum = 0;
        for (int[] item : array)
            for (int item2 : item)
            sum += item2;
        System.out.println(sum);

    }
}
