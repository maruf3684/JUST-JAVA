package Recursion;

import java.util.Arrays;

public class PartitionFunction {
    public static void main(String[] args) {
        //int[] arr={4,6,2,5,7,9,1,3};
        int[] arr={10,5,4,3,2};
        partition(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }


    public static void partition(int[] arr,int start,int end){

        int i=start;
        int j=end;
        int pivot=arr[start];
        while(i<j){
            while (i<=end && arr[i]<=pivot){
                i++;
            }

            while (j>=start && arr[j]>pivot){
                j--;
            }

            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[start];
        arr[start]=arr[j];
        arr[j]=temp;

    }
}
