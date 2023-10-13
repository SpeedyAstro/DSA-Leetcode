public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    public int[] smallerNumbersThanCurrent(int[] num) {
        int bucket [] = new int[102],result = 0;
        for(int i = 0 ; i < num.length; i++)
            bucket[num[i]+1]++;
        for(int i=1;i<bucket.length;i++)
            bucket[i] += bucket[i-1];
        for(int i = 0 ; i < num.length ; i++)
            num[i] = bucket[num[i]];
        return num;
    }
}