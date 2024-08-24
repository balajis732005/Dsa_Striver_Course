package BINARY_TREE;

public class BinaryTree_Creation {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right =  new TreeNode(3);
        root.left.left =  new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(root.data);
        System.out.println(root.left.data+" "+root.right.data);
        System.out.println(root.left.left.data+" "+root.left.right.data+" "+root.right.left.data+" "+root.right.right.data);
    }
}
