package Lesson2;
import java.util.Arrays;

/*
Задать пустой целочисленный массив длиной 100.
С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 */
public class CreateArray {
    public static void createArray() {
        int[] myArray = new int[100];
        int i = 0;
        while (i <= 99) {
            myArray[i] = i + 1;
            i++;
        }
        System.out.println(Arrays.toString(myArray));
    }


//    public static void main(String[] args) {
//        createArray();
//    }
}
