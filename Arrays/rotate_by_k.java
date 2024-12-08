
// left rotate array by 'k' places

public class rotate_by_k{
    static int[] rotate(int[] arr, int k){
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[(i+k)%arr.length] = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = temp[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

