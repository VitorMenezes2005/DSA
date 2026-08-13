package services.binaryTree.firstImplementation;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val = val;
        //left e right ainda nao existem, por isso null
        this.left = null;
        this.right = null;
    }
}
