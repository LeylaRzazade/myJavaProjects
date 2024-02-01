package Lesson2;
import java.util.Arrays;
/*
9.* Написать метод, принимающий на вход два аргумента:
len и initialValue, и возвращающий одномерный
массив типа int длиной len, каждая ячейка которого равна initialValue;
*/
public class Method9 {

    public static int[] createArray(int len, int initialValue){
        int i = 0;
        int[] myArray = new int[len];
        while(i<len){
            myArray[i] = initialValue;
            i++;

        }
        return  myArray;
    }

//    public static void main(String[] args) {
//        int [] myArray2 = createArray(4, 5);
//        System.out.println(Arrays.toString(myArray2));
//    }
}
