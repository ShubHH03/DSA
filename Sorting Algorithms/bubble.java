// import java.util.Scanner;

public class bubble {
    static void bubble_sort(int arr[], int n)
    {
        for(int i=n-1;i>=0;i--)
        {
            int swap=0;          // used for optimal approach
            for(int j=0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j] = temp;
                    swap=1;
                }
            }
            if(swap==0){
                break;
            }
        }
        System.out.print("Array after sorting: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        int arr[]= {13,46,24,52,20,9};
        int n = arr.length;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter size of array: ");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter elements of array(separated by space): ");
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.print("Array before sorting: ");
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        bubble_sort(arr, n);
    }
}



