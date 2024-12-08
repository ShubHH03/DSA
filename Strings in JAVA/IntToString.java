import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close(); // Close the scanner to free up resources
        
        String m = Integer.toString(n);
        // Print the simple name of the class of the object 'm'
        System.out.println(m.getClass().getSimpleName());

        // if(n>=-100 && n<=100) System.out.println("Good job");
        // else System.out.println("Wrong answer");
    }
}

