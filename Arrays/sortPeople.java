// You are given an array of names , and an array of heights. Both arrays are of length n.
// For each index i, names[i] and heights[i] denote the name and height of the ith person.
// Return names sorted in descending order by the peoples heights.

// Input: names = ["Alice" , "Bob" , "Bob"], heights = [155, 180, 150] 
// Output: ["Bob" , "Alice" , "Bob"]

import java.util.Arrays;
import java.util.HashMap;

public class sortPeople {
    static String[] solution(String[] names, int[] heights){
        HashMap<Integer, String> mpp = new HashMap<>();
        for(int i=0;i<names.length;i++){
            mpp.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] result = new String[heights.length];
        int idx = 0;
        for(int i=heights.length-1;i>=0;i--){
            result[idx] = mpp.get(heights[i]); idx++;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] h = {155, 180, 190, 125};
        String[] n = {"Alice", "Bob", "Max", "Charlie"};
        String[] solution = solution(n, h);
        for(int i=0;i<h.length;i++){
            System.out.print(solution[i]+" ");
        }
    }
}