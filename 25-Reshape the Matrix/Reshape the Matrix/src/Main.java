public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] array = new int[r][c] ;
        int row = 0 , col = 0;
        if(r!=mat.length&& c!=mat[0].length) return mat;
        for(int[] i : mat){
            for(int j : i){
                array[row][col] = j;
                col++;
                if (col==c){
                    row++;
                    col = 0;
                }
            }
        }
        return array;
    }
}