package Recursion;


import java.util.ArrayList;

public class findItems {
    public static void main(String[] args) {
        int[] arr ={1,2,33,44,55,66,767,99,44,44,44};
        ArrayList<Integer> list=new ArrayList<Integer>();
        //System.out.println(check(arr,0,44,list));
        System.out.println(check2(arr,0,44));

    }

    public static ArrayList<Integer> check(int[] arr, int index, int target,ArrayList<Integer> list){

        if(index==arr.length){
            return list;
        }

        if (arr[index]==target){
            list.add(arr[index]);
        }

        return check(arr,index+1,target,list);

    }

    public static ArrayList<Integer> check2(int[] arr,int index,int target){
        ArrayList<Integer> list =new ArrayList<Integer>();

        if (index==arr.length){
            return list;
        }

        if (arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> porer_call_er_list=check2(arr,index+1,44);

        list.addAll(porer_call_er_list);

        return list;

    }

}
