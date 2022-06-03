package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
     public static void main(String[] args) {
         String unprocessed="";
         String processed="abc";
         var ans=subsequence(unprocessed,processed);
         System.out.println(ans);

    }

//    public static void subsequence(String unprocessed,String processed){
//
//         if(processed.isEmpty()){
//             System.out.println(unprocessed);
//             return;
//         }
//
//         subsequence(unprocessed+processed.charAt(0),processed.substring(1));
//         subsequence(unprocessed,processed.substring(1));
//    }

    public static ArrayList<String> subsequence(String unprocessed, String processed){

        if(processed.isEmpty()){
        ArrayList<String> arr =new ArrayList<>();
        arr.add(unprocessed);
        return arr;
        }

        ArrayList<String> left = subsequence(unprocessed+processed.charAt(0),processed.substring(1));
        ArrayList<String> right = subsequence(unprocessed,processed.substring(1));
        left.addAll(right);
        return left;
    }
}
