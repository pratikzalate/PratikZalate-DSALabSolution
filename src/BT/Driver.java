package BT;

import java.util.ArrayList;

public class Driver {
    public void displayLongestPath(){
        BT binaryTree = new BT();
        //create binary tree
        Node root = binaryTree.createBT();
        // display binary tree
        System.out.println("~~~~~~~~~~ In Order Traversal of Binary Tree ~~~~~~~~~~~");
        binaryTree.displayBT(root);
        System.out.println('\n');
        //find longest path in BT
        ArrayList<Integer> longestPath = binaryTree.findLongestPathInBT(root);
        //Display Longest path of BT
        System.out.println("~~~~~~~~~~~~ Longest Path in Binary Tree ~~~~~~~~~~~~~");
        for (int i=(longestPath.size()-1); i>=0 ; --i)
            System.out.print(longestPath.get(i)+" ");
        System.out.println('\n');
        
    }
    
}
