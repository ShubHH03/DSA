
// You are given a string num, representing a large integer. 
// Returm the largest-valued odd integer 
// (as a string) that is a non-empty substring of num, or an empty string if no odd integer exists.

public class largestOdd{
    static String largestOddNumber(String num) {
        int n= num.length();
        for(int i=n-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0) return num.substring(0,i+1);
        }
        return "";
    }
    public static void main(String[] args) {
        String ans = largestOddNumber("523");
        System.out.println(ans);
    }
}