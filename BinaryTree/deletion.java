package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class deletion {

    public static void main(String[] args) {
        Integer[]  array = { 13,12,10,4,19,16,9};
        TreeNode root = TreeNode.arrayToTree(array);  
        TreeNode.visualize(root);

        deleteKey(root,13);

        TreeNode.visualize(root);
    }

    static void deleteKey(TreeNode root,int key)
    {
        if(root==null)
            return;

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        TreeNode temp=null,keyNode=null;

        //level order traversal to find key and deepest right node
        while(!q.isEmpty()) {
            
            temp =q.poll();

            if(temp.val ==key){
                keyNode=temp;
            }
            if(temp.left!=null) {
                q.add(temp.left);
            }
            if(temp.right!=null) {
                q.add(temp.right);
            }
        }
        //Now temp conatins the deepest right node
        if(keyNode!=null) {
            keyNode.val = temp.val;
            deleteLeaf(root,temp);
        }

    }

    static void deleteLeaf(TreeNode root , TreeNode temp) {

        if(root==null)
            return;

        if(root.left==temp){ 
            root.left=null; 
            return;
        }
        if(root.right==temp){
            root.right=null;
            return;
        }
        deleteLeaf(root.left, temp);    
        deleteLeaf(root.right, temp);   
    }


    
}
