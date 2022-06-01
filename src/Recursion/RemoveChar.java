package Recursion;

//remove a

public class RemoveChar {

    public static void main(String[] args) {

        String text="munnaapplkkappler";
//        String ans ="";
//        String ansWer=Remover(text,0);
//        System.out.println(ansWer);

         String ansWer=Removeapple(text);
        System.out.println(ansWer);





    }

//    public static String Remover(String text,int index,String ans){
//
//        if(index==text.length()){
//            return ans;
//        }
//
//        if(text.charAt(index)!='a'){
//            ans=ans+text.charAt(index);
//        }
//
//
//        return Remover(text,index+1,ans);
//
//
//    }

//
//    public static String Remover(String text,int index){
//        String ans="";
//        if(index==text.length()){
//            return ans;
//        }
//
//        if(text.charAt(index)!='a'){
//            ans=ans+text.charAt(index);
//        }
//
//
//        String nextAns=Remover(text,index+1);
//
//        return ans+nextAns;
//
//    }



    public static String Removeapple(String text){
        if (text.isEmpty()){
            return "";
        }
        if(text.startsWith("apple")){
            return Removeapple(text.substring(5));
        }else {
            return text.charAt(0)+Removeapple(text.substring(1));
        }

    }

}