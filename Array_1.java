/**
 *  Создать трехмерный массив из целых чисел
 *  С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
 *  Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
 * Результат работы:

 Вводим: 3
 13 33 53 73
 13 23 33 43
 23 43 63 83

 */
import java.util.Scanner;


public class Array_1 {
    public static void main(String[] args) {
        int[][][] array = {{{10,30,50,70}, {10,20,30,40}},{{20,40,60,80}}};
        System.out.println("Введите число, на которое хотите увеличить: ");
        Scanner scan = new Scanner(System.in);
        int scanNumber = scan.nextInt();


        for (int[][] item1: array){
            for (int[] item2: item1){
                for (int item3: item2){
                    item3 = item3 + scanNumber;
                    System.out.print(item3 + " ");
                } System.out.println();
            }
        }

    }
}
