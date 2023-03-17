package DP;

import java.util.Arrays;

public class Ninja {
    public static void main(String[] args) {
        int n = 4;
        int[][] points = {
                {2,1,3},
                {3,4,6},
                {10,1,6},
                {8,3,7}
        };
        //System.out.println(Arrays.deepToString(points));

        int[][] dp = new int[4][4];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
       // System.out.println(Arrays.deepToString(dp));


        //Work Start
        //our base case
        dp[0][0]=Math.max(points[0][1],points[0][2]);
        dp[0][1]=Math.max(points[0][0],points[0][2]);
        dp[0][2]=Math.max(points[0][0],points[0][1]);
        dp[0][3]=Math.max(points[0][0],Math.max(points[0][1],points[0][2]));

        System.out.println(Arrays.deepToString(dp));

        for (int day = 1; day < n; day++) {
            for (int last = 0; last < 4; last++) {
                
                dp[day][last]=0;

                for (int task = 0; task < 3; task++) {
                    if (task!=last){
                        int point = points[day][task] + dp[day-1][task];
                        dp[day][last]=Math.max(dp[day][last],point);
                    }
                }

            }
        }

        System.out.println(Arrays.deepToString(dp));
        System.out.println(dp[n-1][3]);

    }
}
