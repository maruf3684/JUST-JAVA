package Recursion;

public class liniarSearch {
    public static void main(String[] args) {
       int[] arr ={1,2,33,44,55,66,767,99};
        System.out.println(  search(arr,0,44));


    }

    public static boolean search(int[] arr,int index,int target){

        if(index==arr.length){
            return false;
        }

        if (arr[index]==target){
            return true;
        }

        return search(arr,index+1,target);

    }
}
