
import java.util.HashMap;

public class Twosum {
    public static void main(String[] args) {
        
         int[] arr ={2,6,5,8,11};
         int target = 14;

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[i]+arr[j]== target){
        //             System.out.println(i+" "+j);
        //         }
        //     }
            
        // }


        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int prev = target - arr[i];
            if(map.containsKey(prev)){
                System.out.println(map.get(prev)+" "+i);
            }
            map.put(arr[i], i);
        }
    }
}
