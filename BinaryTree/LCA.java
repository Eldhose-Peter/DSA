package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class LCA {

    //least common ancestor

    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4,5,6,7,8};
        TreeNode root = TreeNode.arrayToTree(array);
        TreeNode.visualize(root);
        method1(root, 4, 6);
        TreeNode lcaNode = method2(root,4,6);
        System.out.println(lcaNode.val);

    }

    public static TreeNode method2(TreeNode root, int n1, int n2) {

        if(root==null)
            return null;
        
        if(root.val==n1||root.val==n2) {
            return root;
        }

        TreeNode left_lca = method2(root.left, n1, n2);
        TreeNode right_lca = method2(root.right, n1, n2);

        //if both are not null then one key is in lefttree and other in righttree
        if(left_lca!=null&&right_lca!=null) {
            return root;
        }

        if(left_lca!=null)
            return left_lca;
        else
            return right_lca;

    }

    public static void method1(TreeNode root,int n1,int n2){
        List<Integer> path1 = new ArrayList<Integer>();
        getpath2(root, n1, path1);
        List<Integer> path2 = new ArrayList<Integer>();
        getpath2(root, n2, path2);
      
        // Collections.reverse(path1);
        // Collections.reverse(path2);

        int i;
        for(i=0;i<path1.size()&&i<path2.size();i++)
        {
            if(!path1.get(i).equals(path2.get(i)))
                break;
        }
        System.out.println(path1.get(i-1));

    }

    public static Boolean getpath2(TreeNode root,int n, List<Integer> list) {
        // base case
        if (root == null) {
            return false;
        }
         
        list.add(root.val);
 
        if (root.val == n) 
            return true;
 
        if (root.left != null && getpath2(root.left, n, list)) {
            return true;
        }
 
        if (root.right != null && getpath2(root.right, n, list)) {
            return true;
        }
 
        //when the end of a path is reached and the element has not been found
        list.remove(list.size()-1);
        return false;
    }

    //this prints in the reverse order
    public static Boolean getpath(TreeNode root,int n,List<Integer> list) {

        if(root==null)
            return false ;

        if(root.val == n||getpath(root.left, n, list)||getpath(root.right, n, list)) {
            list.add(root.val);
            return true;
        }

        return false;
    }
    
    
}
