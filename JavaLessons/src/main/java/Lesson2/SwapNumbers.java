package Lesson2;
import java.util.Arrays;
/*
Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 С помощью цикла и условия заменить 0 на 1, 1 на 0;
*/

public class SwapNumbers {
    public static void swapNumbers() {
        int[] myArray = new int[]{0, 1, 0, 1, 0, 0, 1};
        int array_length = myArray.length;
        int i = 0;
        while (i < array_length) {
            if (myArray[i] == 0) {
                myArray[i] = 1;
            } else {
                myArray[i] = 0;
            }
            i++;
        }
        System.out.println(Arrays.toString(myArray));
    }

//        public static void main(String[] args) {
//        swapNumbers();
//
//    }

}
