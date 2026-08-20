package services.binaryTree.leetCode106;

import java.util.Arrays;

public class Resolution {
    // inorder = [9,3,15,20,7]
    // postorder = [9,15,7,20,3]

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) {
            return null;
        }

        int rootValue = postorder[postorder.length - 1];
        TreeNode root = new TreeNode(rootValue);

        int inorderIndex = 0;

        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootValue) {
                inorderIndex = i;
                break;
            }
        }

        int[] rightInorder = Arrays.copyOfRange(inorder, inorderIndex + 1, inorder.length);

        int[] leftInorder = Arrays.copyOfRange(inorder, 0, inorderIndex);

        int leftSize = leftInorder.length;

        int[] rightPostorder = Arrays.copyOfRange(postorder, leftSize, postorder.length - 1);

        int[] leftPostorder = Arrays.copyOfRange(postorder, 0, leftSize);

        root.right = buildTree(rightInorder, rightPostorder);
        root.left = buildTree(leftInorder, leftPostorder);

        return root;
    }
}
