package Recursion;

public class pattern {
    public static void main(String[] args) {

        triangle(4,4);

    }
    public static void triangle(int row,int col){

        if (col==0){
            return;
        }
        if (row==0){
            System.out.print("\n");
            col=col-1;
            triangle(row=col,col);

        }else{
            System.out.print("*");
            row=row-1;
            triangle(row ,col);

        }
    }
}
