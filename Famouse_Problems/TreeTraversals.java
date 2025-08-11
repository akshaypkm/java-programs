package Famouse_Problems;
import java.util.*;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int val){
        this.val = val;
    }

}

class TreeTraversals{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        // Building this tree:
        //        1
        //      /   \
        //     2     3
        //    / \   / \
        //   4   5 6   7

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        
        inOrder(root);
        System.out.println("\n");
        preOrder(root);
        System.out.println("\n");
        postOrder(root);

        bfs(root);

    }
    
    public static void inOrder(TreeNode root){
       if(root == null){return;}
        
        inOrder(root.left);

        System.out.print(root.val + " ");

        inOrder(root.right);
    }

    public static void postOrder(TreeNode root){
       if(root == null){return;}

        postOrder(root.left);

        postOrder(root.right);
        
        System.out.print(root.val + " ");
        
    }

    public static void preOrder(TreeNode root){
       if(root == null){return;}

        System.out.print(root.val + " ");

        preOrder(root.left);

        preOrder(root.right);                                                                                                                                                                                                                                                                                                           
        
    }

    public static void bfs(TreeNode root){
        if(root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();

            System.out.print(curr.val + " ");

            if(curr.left!=null) queue.add(curr.left);
            if(curr.right!=null) queue.add(curr.right);

        }
    }
}