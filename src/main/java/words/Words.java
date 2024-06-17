package words;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Words {
    public static List<String> getUniqueWordsFromSentence(String sentence) {
        // Convert the sentence to lowercase
        sentence = sentence.toLowerCase();

        // Remove punctuation by replacing all non-word characters with space
        sentence = sentence.replaceAll("[^a-zA-Z0-9\\s]", " ");

        // Split the sentence into words
        String[] wordsArray = sentence.split("\\s+");

        // Collect unique words into a list
        List<String> uniqueWords = Arrays.stream(wordsArray)
                .distinct()
                .collect(Collectors.toList());

        return uniqueWords;
    }
}
