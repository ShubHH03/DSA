public class solution {
        //Asked in NETCORE CLOUD test

        // Function to calculate the reverse character
        public static char reverseChar(char c) {
            return (char) (219 - c);
        }
    
        // Function to count pairs with reversed characters
        public static int countReversedPairs(String s) {
            int count = 0;
            int n = s.length();
            
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (reverseChar(s.charAt(i)) == s.charAt(j)) {
                        count++;
                    }
                }
            }
            return count;
        }
    
        // Main function to test the implementation
        public static void main(String[] args) {
            String input = "abcxby";
            System.out.println(countReversedPairs(input));  
        }
    }
    
// }
