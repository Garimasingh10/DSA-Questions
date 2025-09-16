
import java.util.HashMap;

public class longestsubarray {
    public static void main(String[] args) {
        
        int[] arr ={1,2,3,1,1,1,2,3,1,2,3,4};

        // optiimal solution (sliding window):

        // int left =0;
        // int right = 0;
        // int maxlen= 0;
        // int sum =0;
         int k = 3;

        // while(right<arr.length){
        //     sum += arr[right];

        //     while(sum>k){
        //         sum -= arr[left];
        //         left++;
        //     }

        //     if(sum==k){
        //         maxlen = Math.max(maxlen,right-left+1);
        //     }

        //     right++;
        // }
        // System.out.println(maxlen);


        int sum = 0;
        int maxlen = 0;

        HashMap<Integer,Integer> map = new  HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];

            if(sum==k){
                maxlen = i+1;
            }
            if(map.containsKey(sum-k)){
                maxlen = Math.max(maxlen, i-map.get(sum-k));

                
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        System.out.println(maxlen);


    
    
    }
}
