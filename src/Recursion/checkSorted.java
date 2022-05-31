package Recursion;

public class checkSorted {
    public static void main(String[] args) {
        int [] arr={1,2,3,6,4,5,5};
        int index=0;
        System.out.println(check(arr,index));
    }

    public static boolean check(int[] arr,int index){

        if (index==arr.length-1){
            return true;
        }

        if (arr[index]<=arr[index+1]){
            return check(arr,index+1);
        }

        return false;

    }




}
