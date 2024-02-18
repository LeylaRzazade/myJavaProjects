package Lesson6;

import java.util.ArrayList;
import java.util.List;

public class ProcessAndSumArray {

    //method which checks if array size  is correct,
    //if size is correct & entered data is correct, it prints sum of elements
    //if size is not correct, then it throws ArraySizException message
    public static int processAndSumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || !isRectangular(arr)) {
            throw new MyArraySizeException("Size of array should be 4x4!");
        }

        int sum = 0;
        //I created List to collect address of fields in array and then print them
        List<String> invalidAddresses = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException ex) {
                    invalidAddresses.add("[" + i + "][" + j + "]");
                }
            }
        }

        //if list of invalidaddresses is not empty, method throws ArrayDataException by printing wrong fields' addresses
        if (!invalidAddresses.isEmpty()) {
            throw new MyArrayDataException("Wrong data/input in the fields: " + invalidAddresses);
        }

        return sum;
    }

    //Method which checks if array is rectangular
    private static boolean isRectangular(String[][] arr) {
        int rowLength = arr[0].length;
        for (String[] row : arr) {
            if (row.length != rowLength) {
                return false;
            }
        }
        return true;
    }
}
