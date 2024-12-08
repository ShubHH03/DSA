// Source: https://leetcode.com/problems/count-the-number-of-consistent-strings/

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