import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution{
    public int[] createTargetArray(int[] nums,int[] index){
        List<Integer> target = new ArrayList<Integer>();
        for (int i=0;i< nums.length;i++){
            target.add(index[i],nums[i]);
        }
        int [] ans = new int[target.size()];
        for (int i=0;i< ans.length;i++){
            ans[i] = target.get(i);
        }
        return ans;
    }
}