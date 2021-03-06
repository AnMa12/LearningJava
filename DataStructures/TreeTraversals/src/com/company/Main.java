package com.company;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public int getBinaryTreeHeight(Node root) {
        if(root == null)
            return 0;
        else {
            int leftHeight = getBinaryTreeHeight(root.left);
            int rightHeight = getBinaryTreeHeight(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static Node addNode(Node root, int data){
        if(root == null)
            return new Node(data);
        else {
            Node cur;
            if(data <= root.left.data) {
                cur = addNode(root.left, data);
                root.left = cur;
            } else {
                cur = addNode(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public void printBinaryTreeLevel(Node root, int level) {
        if(root == null)
            return;
        if(level == 0)
            System.out.print(root.data + " ");
        else {
            printBinaryTreeLevel(root.left, level - 1);
            printBinaryTreeLevel(root.right, level - 1);
        }
    }

    public void printByLevelBinaryTree(Node root) {
        if(root == null)
            return;
        int treeHeight = getBinaryTreeHeight(root);
        for(int i = 0; i < treeHeight; i++)
            printBinaryTreeLevel(root, i);
    }

    public static void main(String args[]) {
        BinaryTree myBT = new BinaryTree();

        /*
        myBT.root = new Node(1);
        myBT.root.left = new Node(2);
        myBT.root.right = new Node(3);
        myBT.root.left.left = new Node(4);
        myBT.root.left.right = new Node(5);
        */
        myBT.root = null;
        myBT.root = addNode(myBT.root, 5);
        myBT.root = addNode(myBT.root, 3);
        myBT.root = addNode(myBT.root, 8);
        myBT.root = addNode(myBT.root, 10);
        myBT.root = addNode(myBT.root, 4);

        myBT.getBinaryTreeHeight(myBT.root);

        myBT.printByLevelBinaryTree(myBT.root);

    }
}
