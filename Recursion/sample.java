
//  Write a program to print numbers from 1 to 5 using recursion.

public class sample {
    private static int count = 1;

    public static void printt() {
        if (count == 5) {
            return;
        }
        System.out.print(count);
        count += 1;
        printt();
    }

    public static void main(String[] args) {
        // Start the recursion
        printt();
    }
}
