public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich = 0 ;
        for(int [] account : accounts){
            int sum = 0;
            for(int amount : account)
                sum+=amount;
            if(sum>rich) rich = sum;
        }
        return rich;
    }
}