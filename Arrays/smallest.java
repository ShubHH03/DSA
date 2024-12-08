public class smallest {
    static int solution(int a[]){
        int n = a.length;
        int small = a[0];
        for(int i=0;i<n;i++){
            if(a[i]<small){
                small = a[i];
            }
        }
        
        return small;
    }
    public static void main(String[] args) {
        int arr[] = {11,3,7,8,8,2};
        System.out.println(solution(arr));

    }
}