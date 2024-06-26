package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class view {

    public static void main(String[] args) {
        Solution obj = new Solution();
        Integer[] array = { 1, 2, 3, null, 5, null, 4 };
        TreeNode root = TreeNode.arrayToTree(array);
        TreeNode.visualize(root);
        TreeNode.printList(obj.rightSideView(root));
        TreeNode.printList(obj.leftSideView(root));
        TreeNode.printList(obj.topSideView(root));
    }
}

class Solution {
 
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        
        rightView(root,list);
        return list;
    }
    public void rightView(TreeNode root,List<Integer> list)
    {
        if(root==null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {

            int n = q.size();

            for(int i=1;i<=n;i++)
            {
                TreeNode temp = q.poll();
                if(i==n){
                    list.add(temp.val);
                }
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }
        }

    }

    public List<Integer> leftSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        leftView(root,list);
        return list;
    }
    public void leftView(TreeNode root,List<Integer> list) {
        if(root==null)
            return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int n = q.size();

            for(int i=1;i<=n;i++) {
                TreeNode temp = q.poll();

                if(i==1)
                    list.add(temp.val);

                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                

            }

        }
        
    }


    public List<Integer> topSideView(TreeNode root){
        List<Integer> list = new ArrayList<>();
        topView(root,list);
        return list;
    }
    public void topView(TreeNode root,List<Integer> list) {

        class hd  //Horizontal Distance
        {
            int distance;
            TreeNode node;

            hd(TreeNode node,int distance) {
                this.node = node;
                this.distance = distance;
            }
        } 

        Queue<hd> hdq = new LinkedList<>();
        HashMap<TreeNode,Integer> hdm = new HashMap<>();

        if(root==null){
            return;
        }
        hdq.add(new hd(root,0));

        while(!hdq.isEmpty()) {

            hd temp = hdq.poll();

            if(!hdm.containsValue(temp.distance)){
                hdm.put(temp.node, temp.distance);
                list.add(temp.node.val);
            }

            if(temp.node.left!=null) {
                hdq.add(new hd(temp.node.left,temp.distance-1));
            }
            if(temp.node.right!=null) {
                hdq.add(new hd(temp.node.right,temp.distance+1));
            }
        }
        



    }

}
