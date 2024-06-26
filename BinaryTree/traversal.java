package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;


class traversal
{
    //Depth First Traversals
    // 1. inorder
    // 2. preOrder
    // 3. postOrder

    //Breadth First or Level order traversal



    public static void main(String[] args) {

        Integer array[] = {1,2,3,4,5};
       
        TreeNode root= TreeNode.arrayToTree(array);
        TreeNode.visualize(root);
        inorder(root);
        System.out.println("--------------------");
        postOrder(root);
        System.out.println("--------------------");
        preOrder(root);
        System.out.println("---------------------");
        levelOrder(root);
        System.out.println("----------------------");
        levelOrder2(root);

        
    }

    public static void inorder(TreeNode node)
    {
        if(node==null)
            return;
        
        inorder(node.left);
        System.out.println(node.val);
        inorder(node.right);
    }

    public static void preOrder(TreeNode node)
    {
        if(node==null)
            return;
        
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);

    }

    public static void postOrder(TreeNode node)
    {
        if(node==null)
           return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val);
    }


    //levelOrder/Breadth First traversal ---Method 1
    public static void levelOrder(TreeNode node)
    {
        int h=treeHeight(node);
        int i;
        for(i=1;i<=h;i++)
            currentLevel(node,i);
    }
    static int treeHeight(TreeNode node)
    {
        if (node==null)
            return 0;
        
        int leftHeight = treeHeight(node.left);
        int rightHeight = treeHeight(node.right);
        
        if(leftHeight>rightHeight)
        {
            return leftHeight+1;
        }
        else
        {
            return rightHeight+1;
        }
    }
    
   
    
    public static void currentLevel(TreeNode node , int level)
    {
        if(node==null)
            return;
        if(level==1)
        {
            System.out.println(node.val);
        }
        else if(level>1)
        {
            currentLevel(node.left,level-1);
            currentLevel(node.right,level-1);
        }
    }

    //levelOrder/Breadth First traversal ---Method 2 using queues
    public static void levelOrder2(TreeNode root) {

        Queue<TreeNode> q =new LinkedList<TreeNode>();
        q.add(root);

        while(!q.isEmpty()) {

            TreeNode temp = q.poll();
            System.out.println(temp.val);

            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }


        }
    }

}