
// Given two strings of lowercase English letters, A and B. perform the following operations:
// 1. Sum the lengths of A and B.
// 2. Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
// 3. Capitalize the first letter in A and B and print them on a single line. separated by a space.


public class operations {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1.length()+s2.length());
        if(s1.charAt(0)>s2.charAt(0)) System.out.println("Yes");
        else System.out.println("No");
        System.out.println(
            s1.substring(0,1).toUpperCase()+s1.substring(1)+" "+
            s2.substring(0,1).toUpperCase()+s2.substring(1));
    } 
}
