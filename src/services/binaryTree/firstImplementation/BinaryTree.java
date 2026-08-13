package services.binaryTree.firstImplementation;

public class BinaryTree {
    TreeNode root; // primeiro node

    public BinaryTree() {
        this.root = null; //a arvore inicia vazia
    }

    //metodo para inserir um node
    public void insert(int val){
        if(root == null){
            root = new TreeNode(val); //preencher o node com o valor
        }else{
            insertRecursive(root, val);
        }
    }

    //metodo que procura o lado certo para insercao
    private void insertRecursive(TreeNode node, int val){
        if(val < node.val){
            if(node.left != null){
                insertRecursive(node.left, val);
            }else{
                node.left = new TreeNode(val);
            }
        }else{
            if(node.right != null){
                insertRecursive(node.right, val);
            }else{
                node.right = new TreeNode(val);
            }
        }
    }

    //metodo que valida se um val esta presente na arvore
    public boolean search(int val){
        return searchRecursive(root, val);
    }

    private boolean searchRecursive(TreeNode node, int val){
        if(node == null){
            return false;
        }

        if(val == node.val){
            return true;
        }

        if(val < node.val){
            return searchRecursive(node.left, val);
        }

        return searchRecursive(node.right, val);
    }
}
