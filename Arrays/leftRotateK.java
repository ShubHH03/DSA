public class leftRotateK {
    //Optimal Approach
    public static void Reverse(int[] a, int start, int end) {
         // Function to Reverse the array
        while(start<=end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    // Function to Rotate k elements to left
  public static void Rotateeletoleft(int[] arr, int n, int k) {
    // Reverse first k elements
    Reverse(arr, 0, k - 1);
    // Reverse last n-k elements
    Reverse(arr, k , n - 1);
    // Reverse whole array
    Reverse(arr, 0, n - 1);
  }

    // Brute Force Approach
    // public static void rotate(int[] nums, int k) {
    //     int n = nums.length;
    //     k = k%n;
    //     int temp[] = new int[k];
    //     for(int i=0;i<k;i++){
    //         temp[i] = nums[i];
    //     }
    //     for(int i=k;i<n;i++){
    //         nums[i-k] = nums[i];
    //         System.out.print(nums[i]+" ");
    //     }
    //     for(int i=n-k;i<n;i++){
    //         nums[i] = temp[i-(n-k)];
    //         System.out.print(nums[i]+" ");
    //     }
    // }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int k = 4;
        int n = arr.length;
        Rotateeletoleft(arr, n, k);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
