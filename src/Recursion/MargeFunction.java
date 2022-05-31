package Recursion;

import java.util.Arrays;

public class MargeFunction {
    public static void main(String[] args) {
        int[] arr1={2,4,5};
        int[] arr2={1,3};
        int totalLength=arr1.length+arr2.length;
        int[] ans= new int[totalLength];

        int ansIndex=0;
        int index1=0;
        int index2=0;

        while(index1<arr1.length && index2<arr2.length){
            if (arr1[index1]<=arr2[index2]){
                ans[ansIndex]=arr1[index1];
                index1++;
            }else{
                ans[ansIndex]=arr2[index2];
                index2++;
            }
            ansIndex++;
        }

        while (index1<arr1.length){
            ans[ansIndex]=arr1[index1];
            index1++;
            ansIndex++;
        }

        while (index2<arr2.length){
            ans[ansIndex]=arr2[index2];
            index2++;
            ansIndex++;
        }




        System.out.println(Arrays.toString(ans));
    }
}
