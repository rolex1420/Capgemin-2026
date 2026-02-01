import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        text = text.toLowerCase().replaceAll("[^a-z ]", "");

        Map<String, Integer> map = new HashMap<>();
        for (String word : text.split("\\s+"))
            map.put(word, map.getOrDefault(word, 0) + 1);

        System.out.println(map);
    }
}
