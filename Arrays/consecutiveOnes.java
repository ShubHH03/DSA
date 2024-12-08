
// Given a binary array nums , return the maximum number of consecutive 1's in the array.
public class consecutiveOnes {
    static int solution(int arr[]){
        int n = arr.length;
        int count=0, result = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) count=0;
            else count++;
            result = Math.max(result, count);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1,1,1};
        int result = solution(arr);
        System.out.println(result);
    }
}
