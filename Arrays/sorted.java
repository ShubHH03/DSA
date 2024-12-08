
// Check if array is sorted
public class sorted {
    static int solution(int arr[], int n){
        for(int i=1;i<n;i++){
                if(arr[i]<arr[i-1]){
                    return 0;
                }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int result = solution(arr, n);
        System.out.println(result);
    }
}
