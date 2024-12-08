// Given a mxn matrix grid which is sorted in non-increasing order both row-wise and column-wise, 
// return the number of negative numbers in grid.

public class negativeNum {
    static int solution(int[][] a){
        int count = 0, row = a.length, col = a[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(a[i][j]<0) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,1}, {3,2,1,-1}, {1,1,-1,2}, {-1,-1,-2,-3}};
        System.out.println(solution(grid));
    }
}
