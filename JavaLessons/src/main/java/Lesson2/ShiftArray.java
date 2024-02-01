package Lesson2;
import java.util.Arrays;
/*
Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи
 нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
  при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
 */
public class ShiftArray {
    public static int[] shiftArray(int[] myArray, int num){
        int[] myNewArray = new int[myArray.length];

        int[] rightArray;
        int[] leftArray;


        int j=0;
        int k=0;
        if(num>0){
            rightArray = new int[num];
            leftArray = new int[myArray.length-num];

            for(j=0; j<rightArray.length;j++){
                rightArray[rightArray.length-j-1] = myArray[myArray.length-1-j];
            }

            for(k=0; k<leftArray.length; k++){
                leftArray[k] = myArray[k];
            }

            int l=0;
            for(l=0;l<rightArray.length;l++){
                myNewArray[l] = rightArray[l];
            }
            int m;
            int s=0;
            for(m=rightArray.length;m<myArray.length;m++){
                myNewArray[m] = leftArray[s];
                s++;
            }
        }
        else{

            int len = num*-1;
            leftArray = new int[len];
            rightArray = new int[myArray.length-len];

            for(j=0; j<rightArray.length;j++){
                rightArray[rightArray.length-j-1] = myArray[myArray.length-1-j];
            }

            for(k=0; k<leftArray.length; k++){
                leftArray[k] = myArray[k];
            }

            int l=0;
            for(l=0;l<rightArray.length;l++){
                myNewArray[l] = rightArray[l];
            }
            int m;
            int s=0;
            for(m=rightArray.length;m<myArray.length;m++){
                myNewArray[m] = leftArray[s];
                s++;
            }
        }

        return myNewArray;

    }

    public static void main(String[] args) {
        int[] myArray = new int[]{1,2,3,8};
        int[] result = shiftArray(myArray,-3);
//        System.out.println(Arrays.toString(result));

    }
}
