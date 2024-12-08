import java.util.ArrayList;

class Solution {

    public static void Merge(int[] arr, int low, int mid, int high){
        
        int i = low;                                       // i is the pointer of left sub-array
        int j = mid+1;                                     // j is the pointer of right sub-array
        

        ArrayList<Integer> temp = new ArrayList<>();
        
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<=high){
            temp.add(arr[j]);
            j++;
        }
        for(i=low; i<=high;i++){
            arr[i] = temp.get(i-low);
        }

    }

    public static void mergeSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        Merge(arr, low, mid, high);
    }
}

public class merge{
    public static void main(String[] args) {
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.print("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Solution.mergeSort(arr, 0, n - 1);
        System.out.print("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}