
public class leftRotateOne {
    // Optimal Approach
    static void solve(int a[], int n) {
        int temp = a[0];
        for (int i = 0; i < n-1; i++) {
            a[i] = a[i+1];
        }
        a[n-1] = temp;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        solve(arr, n);
    }

    // Brute Force Approach
    // static void solve(int a[], int n){
    // int[] temp = new int[n];
    // for(int i=1;i<n;i++){
    // temp[i-1] = a[i];
    // }
    // temp[n-1] = a[0];
    // for(int i=0;i<n;i++){
    // System.out.print(temp[i]+" ");
    // }
    // }

    // public static void main(String[] args) {
    // int[] arr = {1,2,3,4,5};
    // int n = arr.length;
    // solve(arr, n);
    // }
}
