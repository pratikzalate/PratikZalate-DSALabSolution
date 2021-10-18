package BT;

import java.util.ArrayList;

public class BT{
    //Create Binary tree using Node class
    public Node createBT(){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        
        root.left.left = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        root.left.left.left = new Node(80);
        root.right.left.right = new Node(90);
        root.right.left.right.right = new Node(100);
        //Longest path is 10,30,60,90,100
        return root;
    } 
    // Recursive function to fing Longest Path in BT
    public ArrayList<Integer> findLongestPathInBT(Node root){
        // If root is null then return empty list
        if(root == null){
            ArrayList<Integer> list = new ArrayList<Integer>();
            return list;
        }
        //find left and Right path lists from current root node
        ArrayList<Integer> leftPath = findLongestPathInBT(root.left);
        ArrayList<Integer> rightPath = findLongestPathInBT(root.right);
        // Choose greater path list and add current root data to that list
        if(leftPath.size() < rightPath.size()){
            rightPath.add(root.data);
        }
        else{
            leftPath.add(root.data);
        }
        //return greater path list
        return (leftPath.size() > rightPath.size() ? leftPath : rightPath);
    }
    //Display BT
    public void displayBT(Node root){
        if(root == null)
            return;
        //In Order traversal
        displayBT(root.left);
        System.out.print(root.data+" ");
        displayBT(root.right);
    }
}