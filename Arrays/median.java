import java.util.Arrays;

public class median {
    public static void main(String[] args) {
      int a[] = {4, 7, 1, 2, 5,6};
      System.out.println(solution(a));
  }
  static double solution(int arr[]){
    Arrays.sort(arr);
    double med = 0;
    int n = arr.length;
  
    if(n%2==0){
      double ind1 = arr[n/2] - 1;
      double ind2 = arr[n/2];
      med = (ind1+ind2)/2;
    }
    else{
      med = arr[n/2];
    }
    return med;
  }
}
