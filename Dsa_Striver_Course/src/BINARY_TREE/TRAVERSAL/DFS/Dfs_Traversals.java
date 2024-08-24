package BINARY_TREE.TRAVERSAL.DFS;

import BINARY_TREE.TreeNode;

public class Dfs_Traversals {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right =  new TreeNode(3);
        root.left.left =  new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println("PREORDER TRAVERSAL : ");
        preOrder(root);
        System.out.println();
        System.out.println("INORDER TRAVERSAL : ");
        inOrder(root);
        System.out.println();
        System.out.println("POSTORDER TRAVERSAL : " );
        postOrder(root);
        System.out.println();
    }
    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
