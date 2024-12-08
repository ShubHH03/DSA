public class countWords {
    static int solution(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
            {
                count++;
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String str = "Beauty lies in the eyes of beholder";
        System.out.println(solution(str));
    }   
}
