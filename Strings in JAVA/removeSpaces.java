public class removeSpaces {
    static String solution(String s){
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "Take you forward";
        System.out.println(solution(str));
    }
}
