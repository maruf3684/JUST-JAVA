package Tree;

class tree{
    int data;
    tree left;
    tree right;

    tree(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}


public class Maketree {
    public static tree main() {
        tree node1=new tree(1);
        tree node2=new tree(2);
        tree node3=new tree(3);
        tree node4=new tree(4);
        tree node5=new tree(5);
        tree node6=new tree(6);
        tree node7=new tree(7);

        node1.left=node2;
        node1.right=node3;

        node2.left=node4;
        node2.right=node5;

        node3.left=node6;
        node3.right=node7;


        tree root=node1;

        return root;

        //System.out.println(root.data);

    }
}
