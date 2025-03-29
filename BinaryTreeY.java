//Lecture 32 :- Binary Tree

import java.util.*;
public class BinaryTreeY {
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

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++; //create root 
            if(nodes[idx] == -1){
                return null; //-1 represnt null means no child
            }

            //Baki noded keliye new node
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes); 
            newNode.right = buildTree(nodes);

            return newNode; //root 
        }
    }

    //Preorder traversal O(n)  root -> left -> right
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data + " "); // 1st root ko
        preorder(root.left);
        preorder(root.right);
    }

    //Inorder traversal O(n)  left -> root -> right
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " "); 
        inorder(root.right);
    }

    //postorder traversal O(n)  left -> right -> root
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " "); 
    }

    //levelorder traversal O(n)  left -> right -> root
    public static void levelorder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            //Queue se ek ele ko bahar nikalenge wo hain currNoode
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                //Leaf node
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null); // next level
                }
            } else{
                //Print root
                System.out.print(currNode.data+" ");
                //Add left node
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                //Add right node
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    //Count of nodes 
    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countOfNodes(root.left); //Left Subtree
        int rightNodes = countOfNodes(root.right); //Right Subtree

        return leftNodes + rightNodes + 1;
    }

    //Sum of nodes
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    //Height of the tree
    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight; 

        //Another Way
        // if(leftHeight >= rightHeight){
        //     return leftHeight + 1;
        // }else{
        //     return rightHeight + 1;
        // }
    }

    //Diameter of tree -> Number of Nodes in the longest path betweeen any 2 nodes
    //O(N^2) 
    //_____________APPORACH 1_____________//
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = diameter(root.left); //LS
        int diam2 = diameter(root.right); //RS
        int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1; //LH + RH + 1

        int myDiameter = Math.max(diam3, Math.max(diam1, diam2));
        return myDiameter;
    }

    //O(N) 
    //_____________APPORACH 2_____________//
    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht , int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight2 = Math.max(left.ht , right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiameter2 = Math.max(diam3, Math.max(diam1, diam2));

        TreeInfo myInfo = new TreeInfo(myHeight2 , myDiameter2);
        return myInfo;
    }

    //Subtree of another tree
    public static boolean isIdentical(Node root , Node subroot){
        if(root == null && subroot == null){ 
            //Leaf node
            return true;
        }
        if(root == null || subroot == null){
            return false;
        }
        if(root.data == subroot.data){
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }
        return false;
    }
    public static boolean isSubtree(Node root , Node subroot){
        if(subroot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(isIdentical(root , subroot)){
            return true;
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4 , -1 , -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data); // 1
        System.out.println("Print preorder Traversal");
        preorder(root);
        System.out.println("Print inorder Traversal");
        inorder(root);
        System.out.println("Print postorder Traversal");
        postorder(root);
        System.out.println("Print levelorder Traversal");
        levelorder(root);
        System.out.print("Print count of nodes "+ countOfNodes(root));
        System.out.println();
        System.out.print("Print sum of nodes "+ sumOfNodes(root));         
        System.out.println();     
        System.out.println("----------------------------");
        System.out.print("Print height of tree "+ heightOfTree(root));         
        System.out.println();
        System.out.print("Print Diameter of tree "+ diameter(root)); 
        System.out.println();      
        System.out.println("----------------------------");
        //By Apporach 2 
        System.out.print("Print height of tree by approach 2 is "+ diameter2(root).ht); //ht is obj of class TreeInfo      
        System.out.println();
        System.out.print("Print Diameter of tree by apporach 2 is "+ diameter2(root).diam); //diam is obj of class TreeInfo        
    }
}
