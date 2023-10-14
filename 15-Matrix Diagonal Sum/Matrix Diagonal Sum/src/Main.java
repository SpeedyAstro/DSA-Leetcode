public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length,sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += mat[i][i] + mat[i][n-i-1];
            if((n-i-1) == i) sum -= mat[i][i];
        }
        return sum;
    }
}