//Lecture 33 :- Binary Search Tree

import java.util.*;
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    
    //To insert a node or value in BST
    //Return type is Node becz we recursively insert the value 
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        //Comparision Conditions (Assume that NO dublicates are there)
        if(root.data > val){
            //left ST
            root.left = insert(root.left, val);
        }
        else{
            //right ST
            root.right = insert(root.right, val);
        }
        return root;
    }

    //Inorderd -> To verify the build tree is correct(BST) or Not 
    //Becz inorder traversal of BST is always Sorted 
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left); //left
        System.out.print(root.data+" "); //root 
        inorder(root.right); //right
    }

    //Search in BST
    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    }

    //Delete a node 
    public static Node delete(Node root, int val){
        if(root.data > val){
           root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        //root.data == val
        else{
            //case 1 : No child
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2 : One child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3 : Two child
            //Search inorder successor : Left Most node in right ST
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    //Inorder successor
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    //Print in Range
    public static void printInRange(Node root , int x , int y){
        if(root == null){
            return;
        }
        if(root.data <= y && root.data >= x){
            printInRange(root.left, x, y); // nodes of LST
            System.out.print(root.data+" "); //root
            printInRange(root.right, x, y);//nodes of RST
        }
        if(root.data < x){
            printInRange(root.right, x, y);
        }
        if(root.data > y){
            printInRange(root.left, x, y);
        }
    }
    //Print the path
    public static void printPath(ArrayList<Integer> path){
        //Traverse
        for(int i = 0; i < path.size(); i++){
            System.out.print(path.get(i)+" -> ");
        }
        System.out.println();
    }
    //Print root to leaf 
    public static void printRootToLeaf(Node root , ArrayList<Integer> path){
        if(root == null){
            return;
        }
        //Preorder
        path.add(root.data); //root(add)

        //Leaf 
        if(root.left == null && root.right == null){
            printPath(path);
        }
        else{ 
            //Non-leaf nodes
            printRootToLeaf(root.left, path); //Left ST
            printRootToLeaf(root.right, path); //Right ST
        }

        path.remove(path.size()-1); //remove root from last index
    }

    public static void main(String args[]){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        //Travese
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        //Print root to leaf
        printRootToLeaf(root, new ArrayList<>());

        //Print in Range
        System.out.print("Print in range is: ");
        printInRange(root, 6, 10);
        System.out.println();

        //delete
        delete(root,10);
        delete(root,6);
       
        //Inorder
        System.out.print("Verify: ");
        inorder(root);
        System.out.println();

        //Search
        if(search(root,6)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
