import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


// brute force
class Solution{
    public int[] twoSum(int [] sum,int target){
        int n = sum.length;
        for(int i = 0 ; i< n ; i++){
            for (int j = i+1; j < n ; j++){
                if (sum[i]+sum[j] == target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    public int[] twoSum1(int [] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++) map.put(nums[i],i);
        for (int i = 0 ; i < n ; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement)!=i){
                return new int[]{i,map.get(complement)};
            }
        }
        return new int[]{};
    }

//    efficient approach
    public int[] twoSum2(int [] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n ; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)) return new int[]{map.get(complement),i};
            map.put(nums[i],i);
        }
        return new int[]{};
    }


}