/**
 * Создайте двумерный массив.
 * Выведите на консоль диагонали массива.
 *
 Result:
 3 2 1 8 10
 7 5 5 2 8
 1 4 3 10 3
 6 8 6 5 10
 6 1 10 9 1

 3 5 3 5 1 Top Left  - right bottom
 6 8 3 2 10 Bottom left - top right
 10 2 3 8 6 Top right - bottom left
 1 5 3 5 3 Bottom right - top left


 */
public class Array_5 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int min = 1;
        int max = 10;
        int res;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = min + (int) (Math.random() * (max - min + 1));
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int i, j;

        for (i = 0, j = 0; i < array.length; i++, j++){
            System.out.print(array[i][j] + " ");

        }   System.out.println("Top Left  - right bottom");

        for (i = array.length-1, j = 0; j < array.length; i--, j++){
            System.out.print(array[i][j] + " ");

        }   System.out.println("Bottom left - top right");


        for (i = 0, j = array.length-1; i < array.length; i++, j--){
            System.out.print(array[i][j] + " ");

        }   System.out.println("Top right - bottom left");


        for ( i = array.length-1, j = array.length-1; j >= 0; i--, j--){
            System.out.print(array[i][j] + " ");

        }   System.out.println("Bottom right - top left");

    }
}
