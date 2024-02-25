package Lesson7;
import java.io.*;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                {100, 200, 111},
                {300, 40, 100}
        };

        AppData appData = new AppData(header, data);

        // Save data to CSV
        AppData.save(appData, "data.csv");

        // Load data from CSV
        AppData loadedData = AppData.load("data.csv");

        // Display loaded data
        if (loadedData != null) {
            System.out.println("Loaded Header: " + Arrays.toString(loadedData.getHeader()));
            System.out.println("Loaded Data:");
            for (int[] row : loadedData.getData()) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
}

