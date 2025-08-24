
import java.util.ArrayList;

public class allsubset {
    public static void solve(int i , int[] num, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> ans){
        if(i>= num.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        path.add(num[i]);
        solve(i+1,num,path,ans);
        path.remove(path.size()-1);
        solve(i+1,num,path,ans);
        
    }
    public static void main(String[] args) {
        int[] num ={1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        solve(0,num, new ArrayList<>(), ans);
        System.out.println(ans);
    }

    
}
