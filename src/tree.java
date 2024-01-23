/*public class tree {

    // Node class to represent a node in the binary tree
    static class Node {
        int data;         // Data of the node
        Node left;        // Reference to the left child
        Node right;       // Reference to the right child

        // Constructor to initialize a new node
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // BinaryTree class to handle tree construction
    static class BinaryTree {
        static int idx = -1;   // Static variable to keep track of the index in the array

        // Method to build a binary tree from an array representation
        public static Node buildTree(int nodes[]) {
            idx++;   // Increment index
            if (nodes[idx] == -1) {
                return null;  // If the element is -1, return null (indicating a null node)
            }
            Node newNode = new Node(nodes[idx]);   // Create a new node with the current data
            newNode.left = buildTree(nodes);       // Recursively build the left subtree
            newNode.right = buildTree(nodes);      // Recursively build the right subtree
            return newNode;   // Return the newly constructed node
        }
    }

    // Main method
    public static void main(String[] args) {
        // Array representation of a binary tree
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // Create an instance of the BinaryTree class
        BinaryTree tree = new BinaryTree();

        // Build the binary tree and get the root
        Node root = tree.buildTree(nodes);

        // Print the data of the root node
        System.out.println(root.data);
    }
}

 */
//========================================================================================================================================================
//Preorder
/*
public class tree {

    // Node class to represent a node in the binary tree
    static class Node {
        int data;         // Data of the node
        Node left;        // Reference to the left child
        Node right;       // Reference to the right child

        // Constructor to initialize a new node
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // BinaryTree class to handle tree construction
    static class BinaryTree {
        static int idx = -1;   // Static variable to keep track of the index in the array

        // Method to build a binary tree from an array representation
        public static Node buildTree(int nodes[]) {
            idx++;   // Increment index
            if (nodes[idx] == -1) {
                return null;  // If the element is -1, return null (indicating a null node)
            }
            Node newNode = new Node(nodes[idx]);   // Create a new node with the current data
            newNode.left = buildTree(nodes);       // Recursively build the left subtree
            newNode.right = buildTree(nodes);      // Recursively build the right subtree
            return newNode;   // Return the newly constructed node
        }
    }

    // Method to perform preorder traversal of the binary tree
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");   // Print the data of the current node
        preorder(root.left);                  // Recursively traverse the left subtree
        preorder(root.right);                 // Recursively traverse the right subtree
    }

    // Main method
    public static void main(String[] args) {
        // Array representation of a binary tree
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // Create an instance of the BinaryTree class
        BinaryTree tree = new BinaryTree();

        // Build the binary tree and get the root
        Node root = tree.buildTree(nodes);

        // Perform preorder traversal and print the nodes
        preorder(root);
    }
}
*/
//=========================================================================================================================
//Inorder




