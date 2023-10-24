import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        // Check if mat is already equal to target
        if (Arrays.deepEquals(mat, target)) {
            return true;
        }

        // Rotate mat 90 degrees clockwise and check if it is equal to target
        for (int i = 0; i < 3; i++) {
            rotate(mat);
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
        }

        // None of the rotations result in mat being equal to target
        return false;
    }

    private void rotate(int[][] mat) {
        int n = mat.length;
        int[][] temp = new int[n][n];

        // Perform the rotation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[j][n - 1 - i] = mat[i][j];
            }
        }

        // Copy the rotated matrix back to mat
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = temp[i][j];
            }
        }
    }
}