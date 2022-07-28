package Tree;

public class CountOfNodes {
    public static void main(String[] args) {

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        MyBinaryTree.BinaryTree tree = new MyBinaryTree.BinaryTree();

        MyBinaryTree.Node root = tree.buildTree(nodes);

        System.out.println(countNodes(root));
    }

    //Basic algo to do tree ques is to do given operation on the leftSubTree and then rightSubTree and at last combine with root
    public static  int countNodes(MyBinaryTree.Node root){

        //if root is null then count is 0
        if (root == null){
            return 0;
        }

       int leftNodes =  countNodes(root.left);
       int rightNodes = countNodes(root.right);

        return leftNodes + rightNodes +1; //add left and right with 1(root) which whole becomes left and right for upper case
    }
}
