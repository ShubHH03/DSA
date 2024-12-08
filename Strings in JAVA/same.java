public class same {
    static int solution(String A, String B) 
    {
        int count = 0;
        String s1 = A.toLowerCase();
        String s2 = B.toLowerCase();
        for(int i =0;i<A.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int ans = solution("abCde","abcfe");
        System.out.print(ans);
    }
}
