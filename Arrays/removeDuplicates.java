public class removeDuplicates {
    static int solution(int[] a){
        int i = 0;
        for(int j=1;j<a.length;j++){
            if(a[i]!=a[j]) i++; a[i] = a[j];
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3,4};
        int result = solution(arr);
        System.out.println(result);
    }
}
