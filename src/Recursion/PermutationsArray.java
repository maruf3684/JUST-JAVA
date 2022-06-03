package Recursion;

import java.util.ArrayList;

public class PermutationsArray {
    public static void main(String[] args) {
        System.out.println( perArray("","abc"));


    }

    public static ArrayList<ArrayList<String>> perArray(String process,String unprocess){
        if(unprocess.isEmpty()){
            ArrayList<String> minarr=new ArrayList<>();
            ArrayList<ArrayList<String>> bigarr=new ArrayList<>();
            minarr.add(process);
            bigarr.add(minarr);
            return  bigarr;

        }

        ArrayList<ArrayList<String>> returnArr=new ArrayList<>();
        int len=process.length();
        char ch=unprocess.charAt(0);
        for (int i = 0; i <= len; i++) {

            String first=process.substring(0,i);
            String last =process.substring(i,process.length());

            returnArr.addAll(perArray(first+ch+last ,unprocess.substring(1)));

        }

        return returnArr;

    }
}
