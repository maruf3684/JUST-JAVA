package Matrix;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

//[[1,10,4,2],[9,3,8,7],[15,16,17,12]]

public class LuckyNumber {
    public static void main(String[] args) {
        int[][] arr = {
                {1,10,4,2},
                {9,3,8,7},
                {15,16,17,12},
        };

        List<Integer> container = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            int min=Integer.MAX_VALUE;
            int minIndex=Integer.MAX_VALUE;
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]<min){
                    min=arr[i][j];
                    minIndex=j;
                }

            }

            int max=Integer.MIN_VALUE;
            for (int k = 0; k < arr.length; k++) {
               if(arr[k][minIndex]>max){
                   max=arr[k][minIndex];
               }
            }

            if(max==min){
                container.add(max);
                //System.out.println(max);
            }

        }
        System.out.println(container.toString());


    }
}
