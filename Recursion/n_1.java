
// Print n to 1 using recursion

public class n_1 {
    public static void printt(int n) {
        if(n>0){
            System.out.print(n+" ");
            printt(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        printt(n);

    }
}
