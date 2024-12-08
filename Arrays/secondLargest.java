public class secondLargest {
    static int solution(int a[], int n){
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest = Math.max(largest, a[i]);
        }
        for(int i=0;i<n;i++){
            if(a[i]>seclargest && a[i]!=largest){
                seclargest = a[i];
            }
        }
        return seclargest;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,27,8,9,19};
        int n = a.length;
        int result = solution(a, n);
        System.out.println(result);
    }
}
