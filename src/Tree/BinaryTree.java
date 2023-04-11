package Tree;

public class BinaryTree {

    static class Node{

        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTre{

        static int idx = -1;

        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1)return null;

            Node newNode = new Node(nodes[idx]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void main(String[] args) {
        BinaryTre tree = new BinaryTre();
        int arr[] = {10,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Node root = tree.buildTree(arr);
        System.out.println(root.data);
    }
}
