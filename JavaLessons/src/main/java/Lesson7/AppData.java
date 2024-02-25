package Lesson7;
import java.io.*;
import java.util.Arrays;

public class AppData {

    private String[] header;
    private int[][] data;

    // Constructor
    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    // Getter methods
    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    // Save data to CSV file
    public static void save(AppData appData, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write header
            writer.write(String.join(";", appData.getHeader()));
            writer.newLine();

            // Write data
            for (int[] row : appData.getData()) {
                writer.write(String.join(";", Arrays.stream(row)
                        .mapToObj(String::valueOf)
                        .toArray(String[]::new)));
                writer.newLine();
            }

            System.out.println("Data saved successfully to " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving data to file: " + e.getMessage());
        }
    }

    // Load data from CSV file
    public static AppData load(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Read header
            String[] header = reader.readLine().split(";");

            // Read data
            String line;
            int row = 0;
            int[][] data = new int[countRows(filePath)][header.length];

            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                for (int i = 0; i < values.length; i++) {
                    data[row][i] = Integer.parseInt(values[i]);
                }
                row++;
            }

            System.out.println("Data loaded successfully from " + filePath);
            return new AppData(header, data);

        } catch (IOException e) {
            System.err.println("Error loading data from file: " + e.getMessage());
            return null;
        }
    }

    // Utility method to count rows in the file
    private static int countRows(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int rows = 0;
            while (reader.readLine() != null) {
                rows++;
            }
            return rows;
        }
    }
}