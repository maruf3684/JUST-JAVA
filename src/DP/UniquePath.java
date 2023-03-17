package DP;

import java.util.Arrays;

public class UniquePath {
    public static void main(String[] args) {
        int[][] dp = new int[101][101];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        System.out.println(uniquePath(100, 100, dp));

    }

    public static int uniquePath(int i, int j, int[][] dp) {
        //base case
        if (i == 0 && j == 0) {
            return 1;
        }

        if (i < 0 || j < 0) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int up = uniquePath(i - 1, j, dp);
        int left = uniquePath(i, j - 1, dp);

        dp[i][j] = up + left;

        return up + left;
    }

}
