
// Move zeroes to end

public class move_zeroes {
    public static int[] moveZeros(int n, int[] nums) {
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return nums;
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int a[] = {0,1,0,0,3,12,0};
        int n = a.length;
        moveZeros(n, a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
