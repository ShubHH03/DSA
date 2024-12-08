// An element of the array is considered a leader if it is greater than all the elements on its right side or
// if it is equal to the maximum element on its right side. 
// The rightmost element is always a leader.

import java.util.ArrayList;

public class leader {
    // Optimal
    static ArrayList<Integer> solution2(int[] arr, int n) {
        ArrayList<Integer> result = new ArrayList<>();

        int max = arr[n - 1];
        result.add(arr[n - 1]);
        // Start checking from the end whether a number is greater than max from right
        for (int i = n - 2; i >= 0; i--)
            if (arr[i] > max) {
                result.add(arr[i]);
                max = arr[i];
            }

        return result;
    }

    // Brute Force Approach
    // static ArrayList<Integer> solution1(int[] arr, int n) {
    //     ArrayList<Integer> result = new ArrayList<>();

    //     for (int i = 0; i < n; i++) {
    //         boolean leader = true;
    //         for (int j = i + 1; j < n; j++) {
    //             if (arr[j] > arr[i]) {
    //                 leader = false;
    //                 break;
    //             }
    //         }
    //         if (leader) {
    //             result.add(arr[i]);
    //         }
    //     }
    //     return result;

    // }

    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        ArrayList<Integer> ans = solution2(arr, n);
        System.out.print(ans);
    }
}
