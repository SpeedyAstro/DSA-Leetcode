public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = nums[0];
        for(int i = 1 ; i < nums.length;i++){
            nums[i] += sum;
            sum = nums[i];
        }
        return nums;
    }
}