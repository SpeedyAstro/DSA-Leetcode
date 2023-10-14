public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxgain = altitude;
        for(int i : gain){
            altitude += i;
            maxgain = Math.max(maxgain,altitude);
        }
        return maxgain;
    }
}