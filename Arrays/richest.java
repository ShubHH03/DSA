
// You are given an mxn integer grid accounts where accounts[i][j] is the
// amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts.

// Input: accounts = [[1,5], [7,3], [3,5]] |||| Output: 10
// 1st customer has wealth = 6, 2nd customer has wealth = 10, 3rd customer has wealth = 8
// The 2nd customer is the richest with a wealth of 10.

public class richest {
    static int solution(int[][] arr){
        int maxSum = 0;
        int n = arr.length, m=arr[0].length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<m;j++){
                sum+= arr[i][j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,2},{7,6}};
        int result = solution(accounts);
        System.out.println(result);
}
}