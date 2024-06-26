package BinaryTree;

import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    static TreeNode arrayToTree(Integer array[]) {
        return arrayToTree(array, 0);
    }

    static TreeNode arrayToTree(Integer array[], int index) {
        if (index >= array.length)
            return null;
        if (array[index] == null)
            return null;
        return new TreeNode(array[index], arrayToTree(array, index * 2 + 1), arrayToTree(array, index * 2 + 2));
    }

    static void printList(List<Integer> list){

        System.out.println("-----Printing-----");
        for(int i:list)
        {
            System.out.print(i+",");
        }
        System.out.println("\n----Done----");

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

    private static void writeArray(TreeNode currNode, int rowIndex, int columnIndex, String[][] res, int treeDepth) {
      
        if (currNode == null) return;
        res[rowIndex][columnIndex] = String.valueOf(currNode.val);

        // Calculate the current layer in the tree
        int currLevel = ((rowIndex + 1) / 2);
        // If it reaches the last level, it will return
        if (currLevel == treeDepth) return;
        // Calculate the interval between each element from the current line to the next line (the interval between the column index of the next line and the column index of the current element)
        int gap = treeDepth - currLevel - 1;

        // judge the left son, if there is a left son, record the corresponding "/" and the value of the left son
        if (currNode.left != null) {
            res[rowIndex + 1][columnIndex - gap] = "/";
            writeArray(currNode.left, rowIndex + 2, columnIndex - gap * 2, res, treeDepth);
        }

        // Make a judgment on the right son. If there is a right son, record the value of the corresponding "\" and the right son.
        if (currNode.right != null) {
            res[rowIndex + 1][columnIndex + gap] = "\\";
            writeArray(currNode.right, rowIndex + 2, columnIndex + gap * 2, res, treeDepth);
        }
    }

    static void visualize(TreeNode root)
    {
        if (root == null) 
            System.out.println("EMPTY!");
        int treeDepth = treeHeight(root);

        int arrayHeight = treeDepth * 2 - 1;
        //int arrayWidth = (2 << (treeDepth - 2)) * 3 + 1;
        int arrayWidth = 2*(int)(Math.pow(2,treeDepth)-1);

        String[][] res = new String[arrayHeight][arrayWidth];

        for (int i = 0; i < arrayHeight; i ++) {
            for (int j = 0; j < arrayWidth; j ++) {
                res[i][j] = " ";
            }
        }

        writeArray(root, 0, arrayWidth/ 2, res, treeDepth);

        System.out.println("\n----Visualising----\n");
        for (String[] line: res) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < line.length; i ++) {
                sb.append(line[i]);
                if (line[i].length() > 1 && i <= line.length - 1) {
                    i += line[i].length() > 4 ? 2: line[i].length() - 1;
                }
            }
            System.out.println(sb.toString());

        }
        System.out.println("\n----Done----\n");

    }
}
