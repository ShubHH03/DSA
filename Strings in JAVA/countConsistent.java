
// You are given a string allowed consisting of distinct characters and an array of strings words.
// A string is consistent if all characters in the string appear in the string allowed.
// Return the number of consistent strings in the array words.

// Example:
// Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]

import java.util.HashSet;
import java.util.Set;

public class countConsistent {
    static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char ch: allowed.toCharArray()){
            set.add(ch);
        }

        int count = 0;
        for(String word: words){
            boolean isConsistent = true;
            for(int i=0;i<word.length();i++){
                char ch = word.charAt(i);
                if(!set.contains(ch)){
                    isConsistent = false;
                }
            }
            if(isConsistent){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        int result = countConsistentStrings(allowed, words);
        System.out.println(result);
    }
}