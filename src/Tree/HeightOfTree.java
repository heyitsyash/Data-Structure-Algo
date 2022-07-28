package Tree;

public class HeightOfTree {

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        MyBinaryTree.BinaryTree tree = new MyBinaryTree.BinaryTree();

        MyBinaryTree.Node root = tree.buildTree(nodes);

        System.out.println(heightOFTree(root));
    }

    //height means total breadth means total level
    public static  int heightOFTree(MyBinaryTree.Node root){

        //if root is null then count is 0
        if (root == null){
            return 0;
        }
        //count left and right height and find the max and add the currNode(1)
        int leftHeight =  heightOFTree(root.left);
        int rightHeight = heightOFTree(root.right);

        int myHeight = Math.max(leftHeight,rightHeight) +1;

        return myHeight;
    }
}
