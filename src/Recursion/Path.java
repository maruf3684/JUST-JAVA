package Recursion;

public class Path {
    public static void main(String[] args) {
       finder("",3,3);
    }

    public static  void finder(String s,int c ,int r){
        if(r==1 && c==1){
            System.out.println(s);
            return;
        }


        if(r>1){
            finder(s+'D',c ,r-1);
        }

        if (c>1){
            finder(s+'R',c-1,r);
        }



    }
}
