package Recursion;

import java.util.Stack;

public class RevStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);
        reverse(stack);

    }

    public static void reverse(Stack<Integer> stack){
        if(stack.size()==1){
            return;
        }
        int preserve = stack.pop();
        reverse(stack);
        //System.out.println(preserve);
        insert(stack,preserve);
    }

    public static void insert(Stack<Integer> stack,int preserve){

       // System.out.println("start");
        System.out.print(stack);
        System.out.println(preserve);
       // System.out.println("end");

//        if(stack.isEmpty()){
//            stack.push(preserve);
//            return;
//        }
//        int temp=stack.pop();
//        insert(stack,preserve);
//        stack.push(temp);

    }
}

//same stack 2 function mela chane korse