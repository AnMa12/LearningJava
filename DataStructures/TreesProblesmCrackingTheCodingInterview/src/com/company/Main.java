package com.company;

public class Main {

    public static int getHeight(TreeNode root) {
        if(root == null) return 0;
        return Math.max(getHeight(root.left),
                getHeight(root.right)) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int heightDiff = getHeight(root.left) - getHeight(root.right);
        if(Math.abs(heightDiff) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public static int checkHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }

        /*Check if left is balanced */
        int leftHeight = checkHeight(root.left);
        if(leftHeight == -1) {
            return -1; //Not balanced
        }

        int rightHeight = checkHeight(root.right);
        if(rightHeight == =1) {
            return -1;
        }

        /*Check if current node is balanced*/
        int heightDiff = leftHeight - rightHeight;
        if(Math.abs(heightDiff) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static boolean betterIsBalanced(TreeNode root) {
        if(checkHeight(root) == -1) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}
