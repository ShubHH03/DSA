
// Left Rotate by one place

import java.util.*;

public class rotate_by_1{

    static int[] rotateArray(int[] arr, int n) {
        int temp = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        return arr;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: "); 
        int n = sc.nextInt();
        System.out.print("Enter the "+n+" elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        rotateArray(arr, n);
        System.out.print("Left Rotated Array: ");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}