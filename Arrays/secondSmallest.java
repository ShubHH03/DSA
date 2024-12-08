

public class secondSmallest {
    static int solution(int arr[], int n){
        int small = Integer.MAX_VALUE;
        int secsmall = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
                small = Math.min(small, arr[i]);
            }
            for(int i=0;i<n;i++){
                if(arr[i]!= small && arr[i] < secsmall){
                    secsmall = arr[i];
                }
            }
            return secsmall;
        }
        

    public static void main(String[] args) {
        int[] arr = {3,4,3,2,2,5,6};
        int n = arr.length;
        int result = solution(arr, n);
        System.out.println(result);
    }
}
