package Lesson8;

import static Lesson8.WordFrequencyCount.wordFrequencyCount;

public class Main {
    public static void main(String[] args) {

        //calling wordFrequencyCount() function from WordFrequencyCount Class to see the result
        wordFrequencyCount();

        //PhoneDirectory class's object's type is a HashMap which contains surname and number respectively
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        // Adding entries to phone directory
        phoneDirectory.add("Rzazade", "132432422");
        phoneDirectory.add("Aliyev", "987654451");
        phoneDirectory.add("Rzazade", "555555555");

        // Searching by last names in phonedirectory HashMap and printing them
        System.out.println("Phone numbers for Rzazade: " + phoneDirectory.get("Rzazade"));
        System.out.println("Phone numbers for Aliyev: " + phoneDirectory.get("Aliyev"));
    }
}
