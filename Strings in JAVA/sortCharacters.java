import java.util.Arrays;

public class sortCharacters {
    static String solution(String s){
        char arr[] = s.toCharArray();
        Arrays.sort(arr);

        String ans = new String(arr);
        return ans;
    }
    public static void main(String[] args) {
        String str = "zxcbg";
        System.out.println(solution(str));

    }
}
