// Remove Outermost Parentheses
// Input: s = "(()())(())"
// Output: "()()()"

public class removeOuter {
    static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) { // Only add opening parentheses if not the outermost
                    result.append(c);
                }
                balance++;
            } else {
                if (balance > 1) { // Only add closing parentheses if not the outermost
                    result.append(c);
                }
                balance--;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String ans = removeOuterParentheses("(()())(())");
        System.out.print(ans);
    }
}
