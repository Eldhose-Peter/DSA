package BinaryTree;

public class flattenTree {
    
    public static void main(String[] args) {
        Integer[] array = { 1, 2,5, 3,4, null, 6 };
        TreeNode root = TreeNode.arrayToTree(array);
        TreeNode.visualize(root);
    }

    //linked list should be in the order or preoder traversal
    public void flatten(TreeNode root) {

        //TreeNode linkedList = root;
    }


}
