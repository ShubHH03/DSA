
public class n_times {
    
    public static void printt(int n) {
        if (n>0) {
            System.out.println("Coding");
        printt(n-1);
        }
        
    }

    public static void main(String[] args) {
            int n = 4;
            printt(n);
    }
}
