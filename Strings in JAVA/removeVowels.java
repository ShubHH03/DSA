public class removeVowels {
    static String solution(String s){
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        s = s.toLowerCase();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "take U forward";
        String result = solution(s);
        System.out.println(result);
    }
}
