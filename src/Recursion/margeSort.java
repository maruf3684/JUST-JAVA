package Recursion;

import java.util.Arrays;

public class margeSort {
    public static void main(String[] args) {

        int[] array={1,5,6,3,8,4,7,2};

        Margsort(array);
        System.out.println(Arrays.toString(array));

    }


    public static int[] Margsort(int[] array){

        if(array.length<=1){
            System.out.println(Arrays.toString(array));
            return array;
        }


        int mid=array.length/2;
        int[] left=Margsort(Arrays.copyOfRange(array,0,mid));
        int[] right=Margsort(Arrays.copyOfRange(array,mid,array.length));

        return marge(left,right);

    }

    public static int[] marge(int[] arr1,int[] arr2){
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

        return ans;

    }
}
