package Recursion;


import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {

//     char a='1';
//     int b= (int) (a +'0');
//     System.out.println(((Object) b).getClass().getName());
//     System.out.println(b);
//     System.out.println(Integer.parseInt(Character.toString(a)));
//     System.out.println((char)('a'+3));

        calc("","23");
        System.out.println(calcWithReturn("","23"));


    }

    public static void calc(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char digit = unprocessed.charAt(0);
        int digitint=Integer.parseInt(Character.toString(digit));
        for (int i = (digitint-1)*3; i <(digitint*3) ; i++) {
            char newchar=(char)('a'+i);
            calc(processed+Character.toString(newchar),unprocessed.substring(1));
        }
    }

    public static ArrayList<ArrayList<String>> calcWithReturn(String processed,String unprocessed){
        ArrayList<ArrayList<String>> mainarr=new ArrayList<ArrayList<String>>();
        if(unprocessed.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(processed);
            mainarr.add(arr);
            return mainarr;
        }
        char digit = unprocessed.charAt(0);
        int digitint=Integer.parseInt(Character.toString(digit));
        for (int i = (digitint-1)*3; i <(digitint*3) ; i++) {
            char newchar=(char)('a'+i);
            var ans =calcWithReturn(processed+Character.toString(newchar),unprocessed.substring(1));
            mainarr.addAll(ans) ;
        }

        return mainarr;
    }
}
