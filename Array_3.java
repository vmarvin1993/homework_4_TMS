/**
Задание №3
Умножение двух матриц
 > Создайте два массива целых чисел размером 3х3 (две матрицы).
 > Напишите программу для умножения двух матриц.
 > Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 > Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 > Ожидаемый результат:  1  2  3   1  1  1   0  0  0

 Результат работы программы:

 1 2 3
 1 1 1
 0 0 0
 */
public class Array_3 {
    public static void main(String[] args) {
        int[][] arrayMat1 = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] arrayMat2 = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };
        int[][] arrayMult = new int[arrayMat1.length][arrayMat2.length];


        for (int i = 0; i < arrayMult.length; i++)
            for (int j = 0; j < arrayMult.length; j++)
                for (int e = 0; e < arrayMat1.length; e++)
                    arrayMult[i][j] += arrayMat1[i][e] * arrayMat2[e][j];


        for (int[] item : arrayMult) {
            for (int j = 0; j < arrayMult.length; j++) {
                System.out.print(item[j] + " ");
            }
            System.out.println();
        }




    }
}
