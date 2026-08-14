package services.binaryTree.traversals.inorder;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int val){
        if(root == null){
            root = new TreeNode(val);
        }else{
            insertRecursive(root, val);
        }
    }

    private void insertRecursive(TreeNode root, int val){
        if(val < root.val){
            if(root.left != null){
                insertRecursive(root.left, val);
            }else{
                root.left = new TreeNode(val);
            }
        } else{
            if(root.right != null){
                insertRecursive(root.right, val);
            }else{
                root.right = new TreeNode(val);
            }
        }
    }

    public boolean search(int val){
        return searchRecursive(root, val);
    }

    private boolean searchRecursive(TreeNode root, int val){
        if(root == null){
            return false;
        }

        if(val == root.val){
            return true;
        }

        if(val < root.val){
            return searchRecursive(root.left, val);
        }

        return searchRecursive(root.right, val);

    }

    public List<Integer> inorderTraversal(){
        List<Integer> result = new ArrayList<>();
        inorderRecursive(root, result);
        return result;
    }

    private void inorderRecursive(TreeNode node, List<Integer> result){
        if(node != null){
            inorderRecursive(node.left, result);
            result.add(node.val);
            inorderRecursive(node.right, result);
        }
    }
}