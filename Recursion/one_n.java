
// Print 1 to n using recursion

public class one_n{

    // Approach - 1
    // public static void printt(int i, int n) {
    //     if(i<=n){
    //         System.out.print(i+" ");
    //         printt(i+1, n);
    //     }
    // }


    // Approach - 2
    public static void printNos(int N){
        if(N>0){
            printNos(N-1);
            System.out.print(N+" ");
        }
    }
    public static void main(String[] args) {
        int n = 10;
        printNos(n);
        // printt(1, n);
    }
}


