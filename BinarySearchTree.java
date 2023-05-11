package prep.pack;

public class BinarySearchTree {

    public static boolean validate(TreeNode root){
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean validate(TreeNode root, long minVal, long maxVal){
        if (root == null)
            return true;
        if (root.data >= maxVal || root.data <= minVal)
            return false;
        return validate(root.left, minVal, root.data) && validate(root.right, root.data, maxVal);
    }


    public static void main(String[] args) {
        // Sample Input 1
  /*      TreeNode nodeFour = new TreeNode(4, null, null);
        TreeNode nodeEight = new TreeNode(8, null, null);
        TreeNode nodeSix= new TreeNode(6, nodeFour, nodeEight);
        TreeNode nodeOne = new TreeNode(1, null, null);
        TreeNode nodeFive = new TreeNode(5, nodeOne, nodeSix);

        System.out.println(BinarySearchTree.validate(nodeFive));*/
        // Sample Input 2
        TreeNode nodeFour = new TreeNode(4, null, null);
        TreeNode nodeEight = new TreeNode(8, null, null);
        TreeNode nodeSix= new TreeNode(6, null, nodeEight);
        TreeNode nodeOne = new TreeNode(1, null, nodeFour);
        TreeNode nodeFive = new TreeNode(5, nodeOne, nodeSix);

        System.out.println(BinarySearchTree.validate(nodeFive));

    }
}
