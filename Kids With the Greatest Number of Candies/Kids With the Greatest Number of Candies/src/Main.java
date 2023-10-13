import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // get the max candies a kid have
        // iterate through every kid and add extra candies
        // check if max out the max candies of one kid
        // if yes return true;
        ArrayList<Boolean> ans = new ArrayList<Boolean>();
        int max = getMaxCandies(candies);
        for(int candy : candies){
            // if((candy+extraCandies)> max)
            ans.add((candy+extraCandies)>= max);
        }
        return ans;
    }
    public int getMaxCandies(int [] candies){
        int max = 0;
        for(int candy : candies){
            if(max<candy) max = candy;
        }
        return max;
    }
}
