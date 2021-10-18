package BT;

public class Node{
    int data;           // represents integer node data
    Node left,right;    // points to left and right of current node
    //Initialize node members
    Node(int data){
        this.data = data;
        left = right = null;
    }

}