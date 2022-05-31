package Recursion;

import java.security.cert.PolicyQualifierInfo;
import java.util.Arrays;

public class Quicksort{
    public static void main(String[] args) {
        //int[] arr={4,6,2,5,7,9,1,3};
        int[] arr={10,5,4,3,2,50};
        QuickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void QuickSort(int[] arr,int low,int high){

        if(low<high){
            int sortedOnePosition=partition(arr,low, high);
            QuickSort(arr,low,sortedOnePosition-1);
            QuickSort(arr,sortedOnePosition+1,high);
        }


    }

    public static int partition(int[] arr,int start,int end){

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

        return j;

    }
}
