public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans = new int[nums.length*2];
        for (int i = 0 ; i < ans.length;i++){
            ans[i] = nums[i%nums.length];
        }
        return ans;
    }
}