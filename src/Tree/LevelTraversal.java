package Tree;

public class LevelTraversal {
    public static void main(String[] args) {
        tree root=Maketree.main();

        //travarse level order

        for (int i = 1; i < 4; i++) {
            levelOrder(root,i);
        }


    }
    public static void levelOrder(tree root,int level){

        if (root==null){
            return;
        }

        if (level==1){
            System.out.println(root.data);
        }else if(level>1){
            levelOrder(root.left,level-1);
            levelOrder(root.right,level-1);
        }

    }
}


//o(n) =n^2