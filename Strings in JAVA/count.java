
// Count number of vowels, consonants, spaces in String

public class count {
    static void  solution(String s){
        int n = s.length();
        s = s.toLowerCase();
        int vowels =0, conso = 0, spaces = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            else if(ch>='a' && ch<='z'){
                conso++;
            }
            else if(ch==' '){
                spaces ++;
            }
        }
        System.out.println(vowels);
        System.out.println(conso);
        System.out.println(spaces);
    }

    
    public static void main(String[] args) {
        String str = "Take u forward is Awesome";
        solution(str);
    }
}
