public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int count = 0 ;
        int [] ans = new int[nums.length];
        for(int i = 0 ; i < n ; i++){
            ans[count++] = nums[i];
            ans[count++] = nums[n+i];
        }
        return ans;
    }
}