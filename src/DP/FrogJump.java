package DP;
import java.lang.Math;
import java.util.Arrays;

public class FrogJump {
//    There is a frog on the 1st step of an N stairs long staircase.
//    The frog wants to reach the Nth stair.
//    HEIGHT[i] is the height of the (i+1)th stair.If Frog jumps from ith to jth stair,
//    the energy lost in the jump is given by |HEIGHT[i-1] - HEIGHT[j-1] |.In the Frog is on ith staircase,
//    he can jump either to (i+1)th stair or to (i+2)th stair.
//    Your task is to find the minimum total energy used by the frog to reach from 1st stair to Nth stair.

//    For Example
//    If the given ‘HEIGHT’ array is [10,20,30,10],
//    the answer 20 as the frog can jump from 1st stair to 2nd stair (|20-10| = 10 energy lost) and then a jump from
//    2nd stair to last stair (|10-20| = 10 energy lost). So, the total energy lost is 20.

    public static void main(String[] args) {

        int[] stair={30,10,60,10,60,50};
        int n=5;
        int[] dp= new int[n+1];
        int ans=just_recr(stair,n);
        int ans2=dprecr(stair,n,dp);
        int ans3=tabulation(stair,n,dp);
        int ans4=tabulationSpace(stair,n,dp);

        //ans
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
    }

    public static  int just_recr(int[] stair,int n){
        if (n==0){
            return 0;
        }
        //0 er khatre nicher code cholbe na
        int left =Math.abs(stair[n]-stair[n-1])+just_recr(stair,n-1);
        int right=Integer.MAX_VALUE;
        if (n>1){
            right=Math.abs(stair[n]-stair[n-2])+just_recr(stair,n-2);
        }

        return Math.min(left,right);
    }


    public static int dprecr(int[] stair,int n,int[] dp){
        if (n==0){
            return 0;
        }
        //0 er khatre nicher code cholbe na
        if(dp[n]!=0){
            return dp[n];
        }
        int left =Math.abs(stair[n]-stair[n-1])+just_recr(stair,n-1);
        int right=Integer.MAX_VALUE;
        if (n>1){
            right=Math.abs(stair[n]-stair[n-2])+just_recr(stair,n-2);
        }

        return dp[n]= Math.min(left,right);
    }


    public static int tabulation(int[] stair,int n,int[] dp){
        dp[0]=0;
        for (int i = 1; i <= n; i++) {
           int  first=dp[i-1]+Math.abs(stair[i]-stair[i-1]);
           int second=Integer.MAX_VALUE;
           if(i>1){
               second=dp[i-2]+Math.abs(stair[i]-stair[i-2]);
           }
           dp[i]=Math.min(first,second);
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }


    public static int tabulationSpace(int[] stair,int n,int[] dp){
        int prev=0;
        int prev2=0;
        for (int i = 1; i <= n; i++) {
            int  first=prev+Math.abs(stair[i]-stair[i-1]);
            int second=Integer.MAX_VALUE;
            if(i>1){
                second=prev2+Math.abs(stair[i]-stair[i-2]);
            }
            int cur=Math.min(first,second);
            prev2=prev;
            prev=cur;
        }

        return dp[n];
    }
}
