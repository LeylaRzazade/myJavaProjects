package Lesson2;
import java.util.Arrays;
/*
8. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами
 (можно только одну из диагоналей, если обе сложно).
 Определить элементы одной из диагоналей можно по следующему принципу:
  индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */

public class Method8 {

    public static void createTwoDimArray(){
        int[][] myArray = new int[4][4];
        int i = 0;
        int j = 0;
        for (i=0; i<myArray.length; i++){
            for(j=0; j<myArray.length; j++){
                if(i==j || i+j==(myArray.length-1)){
                    myArray[i][j] = 1;
                }
            }
        }
//        for (i = 0; i < myArray.length; i++) {
//            System.out.println(Arrays.toString(myArray[i]));
//        }
    }



//    public static void main(String[] args) {
//        createTwoDimArray();
//    }
}
