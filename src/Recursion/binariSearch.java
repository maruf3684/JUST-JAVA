package Recursion;

public class binariSearch {
    public static void main(String[] args) {
       int[] arr={8,1};
       int start=0;
       int end=arr.length-1;
        System.out.println(binariSearch(arr,start,end,1));
    }
    public static int binariSearch(int[] arr,int start ,int end,int target){

        if(start>end){
            return -1;
        }

        int mid=(start+end)/2;
        if(arr[mid]==target){
            return mid;
        }

        if(arr[start]<=arr[mid]){
            if(arr[start]<=target && arr[mid]>target){
                end=mid-1;
                return binariSearch(arr,start,end,target);
            }else{
                start=mid+1;
                return binariSearch(arr,start,end,target);
            }

        }
        else{
            if(arr[end]>=target && arr[mid]<target){
                start=mid+1;
                return binariSearch(arr,start,end,target);
            }else{
                end=mid-1;
                return binariSearch(arr,start,end,target);
            }
        }
    }
}
