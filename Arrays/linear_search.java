
public class linear_search {
    static int search(int[] arr, int n, int num){
        for(int i =0;i<n;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int num = 3;
        int n = arr.length;
        int result = search(arr, n, num);
        System.out.print(num+" is present at index "+result);
    }
}
