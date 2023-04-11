package Tree;

import java.util.LinkedList;
import java.util.Queue;

//Making Custom Binary tree
public class MyBinaryTree {

    //First make the Node class which will hold the data and its left and right child Node
    static class Node{

        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //then make the binaryTree with nodes array
    static class BinaryTree{

        //make the static indx -1
        static int index = -1;
        public static Node buildTree(int nodes[]){
            //increase the idx whenever go through this fun
            index++;

            //check if curr idx node is null then just return
            if(nodes[index] == -1){
                return null;
            }
            //if not
            //then create the node with that idx data
            //first initialized Node is the root Node
            Node newNode = new Node(nodes[index]);

            //then recursively call the func for left and right
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            //then return newNode which is the root Node
            return newNode;
        }
    }

  //Todo All the preorder postorder inorder takes o(n) and are Depth for Search Algo (DFS)

    //to print the Binary tree or traverse
    public static void preorder(Node root){

        //Preorder
        //1 - print the root
        //2 - print the left Sub Tree
        //3 - print the right Sub Tree
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void inOrder(Node root){

        //InOrder
        //1 - print the left Sub Tree
        //2 - print the root
        //3 - print the right Sub Tree
        if (root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){

        //PostOrder
        //1 - print the left Sub Tree
        //2 - print the right Sub Tree
        //3 - print the root

        if (root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    //todo Level order takes o(n) and is called the breadth for Search BFS


    //In level order we print the tree data breadth wise
    //for that first we add the root node and null in the queue and then we loop until queue is empty
    //and then remove the curr element and check if it is null then check if queue is empty then break if not then add another null
    //if element is not null then print its data and its left and right int the queue
    public static void  levelOrder(Node root){

        if(root == null){//check if the tree is empty
            return;
        }

        //if not add root and null
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        //loop the queue
        while(!q.isEmpty()){

            Node currNode  = q.remove();

            //if the node is null
            if(currNode == null){
                System.out.println(); //print the new line means another breadth

                if(q.isEmpty()){
                    break; //if this is the last element then just break
                }else {
                    q.add(null); //if not then another null
                }
            }

            else { //if node is not null
                System.out.print(currNode.data + " "); //print its data

                //and check for their left and right and add them
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        levelOrder(root);
    }
}
