package com.company;

class Node {
    int key;
    String name;

    Node leftChild;
    Node rightChild;

    Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString() {
        return name + "has a key" + key;
    }
}

class BinaryTree {
    Node root;

    public void addNote(int key, String name){
        Node newNode = new Node(key, name);
        if(root  == null) {
            root = newNode;
        } else {
            Node focusNode = root;

            Node parent;

            while(true){

                parent = focusNode;

                if(key < focusNode.key) {


                }
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
