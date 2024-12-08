public class missingNum {
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int total = 0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        return sum-total;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0};
        int result = missingNumber(arr);
        System.out.println(result);
    }
}
