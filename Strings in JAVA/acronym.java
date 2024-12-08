// Check if a String Is an Acronym of Words
// what is an acronym?
// An acronym is a word formed by taking the first letters of the words in a phrase and making a word from them.

import java.util.ArrayList;
import java.util.List;

public class acronym {
    static boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length())
            return false;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) != s.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        String str = "abo";

        boolean ans = isAcronym(fruits, str);
        System.out.println(ans);
    }
}
