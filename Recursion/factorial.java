public class factorial {
    static int fact(int n) {
        if (n < 0) {
            System.out.println("Error: Negative numbers are not allowed.");
            return -1; // Return a value indicating an error occurred
        } else if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int result = fact(-1);
        System.out.print(result);
    }
}
