package services.binaryTree.leetCode094;

import java.util.ArrayList;
import java.util.List;

public class Resolution {
    public static List<Integer> inorderTraversal(TreeNode root){
        return inorder(root);
    }

    private static List<Integer> inorder(TreeNode root){
        if(root != null){
            List<Integer> result = new ArrayList<>();
            result.addAll(inorder(root.left)); // esquerda
            result.add(root.val); // raiz
            result.addAll(inorder(root.right)); // direita
            return result;
        }

        return new ArrayList<>();
    }
}
