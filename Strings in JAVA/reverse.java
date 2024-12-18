// Reverse a string in place

public class reverse {
    static void solution(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solution(s);
        for (char c : s) {
            System.out.print(c + " ");
        }
    }
}
