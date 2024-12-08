
// Given an integer target, return true if target is in matrix or false otherwise.
public class search2D {
    
    // Brute Force Approach
    // static boolean searchMatrix(int[][] matrix, int target) {
    //     int n = matrix.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j]==target) return true;
    //         }
    //     }
    //     return false;
    // }


    // Optimal Approach
    static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        //apply binary search:
        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m, col = mid % m;
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        boolean result = searchMatrix(matrix, 19
        );
        System.out.println(result ? "true" : "false");
    }
}
