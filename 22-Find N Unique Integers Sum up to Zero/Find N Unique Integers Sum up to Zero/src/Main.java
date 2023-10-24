public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution{
    public int[] sumZero(int n){
        int [] ans = new int[n];
        int h = 0;
        for (int i = 1 ; i <= n/2 ; i++){
            ans[h] = i;
            ans[h+1] = i*-1;
            h+=2;
        }
        return ans;
    }
}