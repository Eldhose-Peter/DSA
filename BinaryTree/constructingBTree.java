package BinaryTree;


public class constructingBTree {
    

    //1.Constructing binary tree from inorder and postorder. 
    //2.Constructing binary tree from inorder and preorder.
    public static void main(String[] args) {

        int in[] = new int[] { 4, 8, 2, 5, 1, 6, 3, 7 };
        int post[] = new int[] { 8, 4, 5, 2, 6, 7, 3, 1 };
        int n = in.length;

        TreeNode root = construct1(in,post,0,n-1,0,n-1);
        TreeNode.visualize(root);

        int in1[] = new int[] { 9, 8, 4, 2, 10, 5, 10, 1, 6, 3, 13, 12, 7 };
        int pre[] = new int[] { 1, 2, 4, 8, 9, 5, 10, 10, 3, 6, 7, 12, 13 };
        int n1 =in1.length;

        TreeNode root2 = construct2(in1, pre, 0, n1-1);
        TreeNode.visualize(root2);


    }

    public static TreeNode construct1(int[] inorder,int[] postorder,int inStart,int inEnd,int postStart,int postEnd){

        if(inStart>inEnd)
            return null;
        int rootval =postorder[postEnd];
        
        TreeNode root = new TreeNode(rootval);
        if(inStart==inEnd)
            return root;
        //find corresponding position in  inOrder
        int i=0;
        for(i=inStart;i<=inEnd;i++){
                if(inorder[i]==rootval){
                    break;
                }
        }
        root.left=construct1(inorder, postorder, inStart, i-1, postStart, postStart-inStart+i-1);
        root.right=construct1(inorder, postorder, i+1, inEnd, postEnd-inEnd+i, postEnd-1);

        return root;
    }

    static int preIndex=0;
    public static TreeNode construct2(int[] inorder,int[] preorder,int inStart,int inEnd){

            if(inStart>inEnd)
                return null;
            
            int rootVal = preorder[preIndex];
            preIndex++;
            TreeNode root = new TreeNode(rootVal);

            int i=0;
            for(i=inStart;i<=inEnd;i++){
                    if(inorder[i]==rootVal){
                        break;
                    }
            }
            root.left=construct2(inorder, preorder, inStart, i-1);
            root.right=construct2(inorder,preorder,i+1,inEnd);

            return root;
    }
}
