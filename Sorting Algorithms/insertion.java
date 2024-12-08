// import java.util.*;

public class insertion {
    static void insertion_sort(int arr[], int n) {
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.print("After Insertion sort: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;
        System.out.print("Before Insertion sort: ");
        for (int i = 0; i <n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertion_sort(arr, n);
    }
}
