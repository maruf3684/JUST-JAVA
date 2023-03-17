package DP;

import java.util.Arrays;

public class KnapTop {

    public static void main(String[] args) {

        int[] productWeight = {2,4,3,1};
        int[] productPrice = {3,4,5,2};
        int lenth =4;
        int weight = 7;
        int [][] arr = new int[lenth+1][weight+1];
        Arrays.stream(arr).forEach(a -> Arrays.fill(a, -1));


        for (int index = 0; index<=lenth ; index++) {
            for (int bag = 0; bag <=weight ; bag++) {

                if (index==0 || bag==0){
                    arr[index][bag]=0;}
                else if(productWeight[index-1]<=bag){
                    arr[index][bag]=Math.max(  productPrice[index-1]    +arr[index-1][bag-productWeight[index-1]]    ,arr[index-1][bag]);
                }else{
                    arr[index][bag]=arr[index-1][bag];
                }


            }
        }

        System.out.println(arr[lenth][weight]);
        //System.out.println(Arrays.deepToString(arr));
    }
}
