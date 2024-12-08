
// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
// Return the array in the form [x1,y1,x2,y2,...,xn,yn].

public class shuffle {

    static int[] shuffl(int[] arr, int n){
        int[] result = new int[2*n];
        for(int i=0;i<n;i++){
            result[2*i] = arr[i];
            result[2*i+1] = arr[n+i];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4,7};
        int n = arr.length/2;
        int res[] = shuffl(arr, n);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
