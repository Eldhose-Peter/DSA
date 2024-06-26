package BinaryTree;


public class diameter {
    public static void main(String[] args) {
        Integer arr[]= {1,2,3,4,56,7,8,9};
        TreeNode root  = TreeNode.arrayToTree(arr);
        TreeNode.visualize(root);

        System.out.println(diameterTree(root));
    }    

    public static int diameterTree(TreeNode node) {
        if(node ==null){
            return 0;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        int ld = diameterTree(node.left);
        int rd = diameterTree(node.right);

        return Math.max(Math.max(ld,rd),1+lh+rh);
    }

    public static int height(TreeNode node) {
        if(node==null){
            return 0;
        }
        return Math.max(height(node.left),height(node.right))+1;

    }
}
