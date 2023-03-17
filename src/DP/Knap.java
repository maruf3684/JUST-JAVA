package DP;

import java.util.Arrays;

public class Knap {

    public static int [][] arr = new int[10][10];


    public static void main(String[] args) {
        Arrays.stream(Knap.arr).forEach(a -> Arrays.fill(a, -1));
        int[] productWeight = {2,4,3,1};
        int[] productPrice = {3,4,5,2};
        int bag = 7;
        int index=productWeight.length-1;

        int calculate=calculate(productWeight,productPrice,bag,index);

        System.out.println(calculate);

    }

    public static int calculate( int[] productWeight, int[] productPrice,int bag,int index){

        if (bag==0 || index<0){
            return 0;
        }

        if(Knap.arr[bag][index]!=-1){
            return Knap.arr[bag][index];
        }

        if (bag>=productWeight[index]){
            int pick = calculate(productWeight,productPrice,bag-productWeight[index],index-1)+productPrice[index];
            int nonpick= calculate(productWeight,productPrice,bag,index-1)+0;

            return Knap.arr[bag][index]= Math.max(pick,nonpick);
        }else{
            return  Knap.arr[bag][index]=  calculate(productWeight,productPrice,bag,index-1)+0;
        }


    }
}
