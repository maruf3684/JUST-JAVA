package Recursion;

public class Permutations {
    public static void main(String[] args) {

        String name="ab";

        System.out.println(name.substring(2,2));
//        System.out.println(name.substring(2,3));
        permutations("","abc");

    }

    static void permutations(String processed,String name){
        if (name.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch=name.charAt(0);

        for (int i = 0; i <=processed.length() ; i++) {
            String first=processed.substring(0,i);
            String last =processed.substring(i,processed.length());
            permutations(first+ch+last,name.substring(1));

        }
    }
}
