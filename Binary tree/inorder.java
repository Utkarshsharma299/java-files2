import java.util.*;
public class inorder {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
        
    
        static class BinaryTree{
            Node root;
        public static void PrintIn(Node root){
            if(root==null){
                return;
            }
                PrintIn(root.left);
                System.out.println(root.data);
                PrintIn(root.right);

        }
    }

        
    
        public static void main(String args[]){
            BinaryTree tree=new BinaryTree();
            tree.root=new Node(1);
            tree.root.left=new Node(2);
            tree.root.right=new Node(3);
        }
    }


