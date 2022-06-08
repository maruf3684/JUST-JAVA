package Recursion;

public class Dise {
    public static void main(String[] args) {
        int terget=4;
        System.out.println("sdtart");
        way(terget,"");

    }

    public static void way(int terget,String p){
        if(terget==0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <=6 && i<=terget; i++) {
            way(terget-i,p+i);
        }
    }
}
