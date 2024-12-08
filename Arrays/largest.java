
public class largest {
    static int solution(int a[], int n){
        int max = 0;
        for(int i=0;i<n;i++){
            if(a[i]>max) max = a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,1,6};
        int n = arr.length;
        int result = solution(arr, n);
        System.out.println(result);
    }
}
