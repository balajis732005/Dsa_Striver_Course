package BINARY_TREE.TRAVERSAL.BFS;

import BINARY_TREE.TreeNode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs_Traversals {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right =  new TreeNode(3);
        root.left.left =  new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println("LEVEL ORDER TRAVERSAL : ");
        System.out.println(levelOrder(root));
        System.out.println();
    }
    public static List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> tree = new ArrayList<>();
        if(root==null){
            return tree;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> subList =  new ArrayList<>();
            int queueSize = queue.size();;
            for(int i=0;i<queueSize;i++){
                if(queue.peek().left!=null) {
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().data);
            }
            tree.add(subList);
        }
        return tree;
    }
}
