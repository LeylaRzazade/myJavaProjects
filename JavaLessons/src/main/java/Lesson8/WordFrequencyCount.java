package Lesson8;
/*
Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordFrequencyCount {
    public static void wordFrequencyCount() {
        // Creating an array with a set of words
        String[] wordsArray = {"world", "automation", "lesson", "world", "engineer", "automation", "coding", "lesson", "world", "computer", "coding", "automation"};

        // Creating a set to store unique words
        Set<String> uniqueWords = new HashSet<>();

        // Creating a map to store word frequencies
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Iterating through the array to find unique words and count frequencies
        for (String word : wordsArray) {
            uniqueWords.add(word);
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Printing unique words
        System.out.println("Unique words: " + uniqueWords);

        // Printing word frequencies
        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}
