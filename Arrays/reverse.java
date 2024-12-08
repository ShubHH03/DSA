public class reverse {

    static void solution(int a[], int n){
        int start = 0, end = n-1;
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;  
            start++;
            end--;        
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int n = arr.length;
        solution(arr, n);

        // int[] a = new int[n];
        // for(int i=0;i<n;i++){
        //     a[n-i-1] = arr[i];
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(a[i]+" ");
        // }
    }
}
