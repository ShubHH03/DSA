
// Write a program to count the number of lowercase letters in a string

public class countSmall {
    static int solution(String s) {
        int count = 0;
        StringBuilder lowercaseLetters = new StringBuilder();
        
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                count++;
                lowercaseLetters.append(s.charAt(i)); // Append lowercase letters to the StringBuilder
            }
        }

        // Print the string with all lowercase letters
        System.out.println("Lowercase letters: " + lowercaseLetters.toString());

        return count;
    }

    public static void main(String[] args) {
        int ans = solution("This is a Great PLace");
        System.out.println("Number of lowercase letters: " + ans);
    }
}
