public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] bin : image){
            flipme(bin);
        }
        return image;
    }
    public void flipme(int[] arr){
        int t = 0;
        int n = arr.length;
        for(int i=1;i<=(arr.length+1)/2 ; i++ ){
            t = arr[n-i] ^ 1;
            arr[n-i] = arr[i-1] ^ 1;
            arr[i-1] = t;
        }
    }
}