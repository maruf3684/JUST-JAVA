package DP;

import java.util.Arrays;

public class UniquePath {
    public static void main(String[] args) {
        int[][] dp = new int[3][3];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));

        //mamoization call
       // System.out.println(uniquePath(2, 2, dp));

        //tabulation call
        uniquePathTabulation(dp);
        System.out.println("Ans->" + Arrays.deepToString(dp));
        System.out.println(dp[2][2]);

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

    public static int uniquePathTabulation(int[][] dp) {

        //Steps
        //1. declare base case
        //2. express all states in for loop
        //3. copy the recurrence and write



        for (int i = 0; i < 3; i++) {
            System.out.println("inner start");
            for (int j = 0; j < 3; j++) {
                if (i == 0 && j == 0) {
                    dp[0][0] = 1;
                }else {
                    int up = 0;
                    int left=0;
                    if (i > 0) {
                        up = dp[i-1][j];
                    }
                    if (j>0){
                        left = dp[i][j-1];
                    }
                    dp[i][j] = up + left;
                    System.out.println(Arrays.deepToString(dp));
                }
            }
            System.out.println("inner end");
        }

        return 0;
    }


}
