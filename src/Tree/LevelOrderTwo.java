package Tree;
import java.util.*;


public class LevelOrderTwo {
    public static void main(String[] args) {
        tree root=Maketree.main();
        var ans=levelTravarse(root);
        System.out.println(ans);
    }

    public static ArrayList<ArrayList<Integer>> levelTravarse(tree root){

        //arraylist and queue declire korlam
        Queue<tree> queue = new LinkedList<tree>();
        ArrayList<ArrayList<Integer>> finalAns = new ArrayList<>();
        //root null hole return kore debo
        if(root==null){
            return finalAns;
        }
        //queue er moddhe dhukalam
        queue.offer(root);

        while (!queue.isEmpty()){
            //level and sublist b er korlam
            int levelNum=queue.size();
            ArrayList<Integer> sublist =new ArrayList<Integer>();

            //main kaj
            for (int i = 0; i < levelNum; i++) {
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().data);
            }
            finalAns.add(sublist);
        }
        return finalAns;
    }
}


