public class sum_of_n {
    static int total(int n){
        int count = 0;
        if(n>0){
            // count = n + total(n-1);
            count = n * (n+1)/2;
        }
        return count;
    }
    public static void main(String[] args) {
        int result = total(5);
        System.out.print(result);
    }
    
}
