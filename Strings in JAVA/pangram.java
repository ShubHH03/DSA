// A pangram is a sentence where every letter of the English alphabet appears at least once.
// Given a string sentence containing only lowercase English letters, 
// return true if sentence is a pangram, or false otherwise.
import java.util.HashSet;

public class pangram {
    static boolean checkIfPangram(String sentence) {
        HashSet<Character> atoz = new HashSet<>();
        for(int i='a';i<='z';i++){
            atoz.add((char)i);
        }
        for(int i=0;i<sentence.length();i++){
            atoz.remove(sentence.charAt(i));
            if(atoz.isEmpty()) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean ans = checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        System.out.println(ans);
    }
}
