import java.util.HashMap;

public class countFreq {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4,5,3};

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i], 1);
            }
        } 

        for (int key : hm.keySet()) {
            System.out.println("Element: " + key + ", Frequency: " + hm.get(key));
        }
    }
    
}