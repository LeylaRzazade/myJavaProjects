package Lesson2;
import java.util.Arrays;

/*
Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
пройти по нему циклом, и числа меньшие 6 умножить на 2;
*/
public class CreateArray2 {
    public static void createArray2(){
        int[] myArray = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i = 0;
        while(i<myArray.length){
            if(myArray[i]<6){
                myArray[i] = myArray[i]*2;
            }
            i++;
        }
        System.out.println(Arrays.toString(myArray));
    }
//    public static void main(String[] args) {
//        createArray2();
//    }
}
