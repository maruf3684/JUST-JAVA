package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetIter {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        var ans=subArray(arr);
        System.out.println( ans);

    }

    public static ArrayList<?> subArray(int[] arr){
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        //[[]] add kore nelam

        for (int num : arr){
            int n=outer.size();

            for (int i = 0; i < n; i++) {

                ArrayList<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }

        }

        return  outer;

    }
}
