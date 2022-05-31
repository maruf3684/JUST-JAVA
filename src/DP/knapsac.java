package DP;

public class knapsac {
    public static void main(String[] args) {
       int[] weight={1,3,4,5};
       int[] val={1,4,5,7};
       int max_weight=7;
       int n=4;

       int ans=knpsac(weight,val,n-1,max_weight);
        System.out.println(ans);
    }

    public static int knpsac(int[] weight,int[] val,int n,int max_weight){

        if(max_weight==0||n<0){
            return 0;
        }

        if (weight[n] <= max_weight) {
            int take=val[n]+knpsac(weight,val,n-1,max_weight-weight[n]);
            int notTake=0+knpsac(weight,val,n-1,max_weight);
            return Math.max(take,notTake);

        }
        else {
            return 0+knpsac(weight,val,n-1,max_weight);
        }

    }
}
