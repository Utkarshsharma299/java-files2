import java.util.*;
public class Mirror {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }

    } 
    public static void preorder(Node root){
        if(root==null){
            return;

        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static Node createBst(int arr[],int st,int ed){
        if(st>=ed){
            return null;
        }
        int mid=(st+ed)/2;
        Node root=new Node(arr[mid]);
        root.left=createBst(arr, st, mid-1);
root.right=createBst(arr, mid+1, ed);
return root;
    }
    public static void getInorder(Node root,ArrayList<Integer>inorder){
        if(root==null){
            return;

        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);

    }
    public static Node create(ArrayList<Integer>inorder,int si,int ed){
        if(si>ed){
            return null;

        }
        int mid=(si+ed)/2;
        Node root=new Node(inorder.get(mid));
     root.left=   create(inorder, si, mid-1);
root.right=create(inorder, mid+1, ed);
return root;
    }
    public static Node  balances(Node root){
        ArrayList<Integer>inorder=new ArrayList<>();
        getInorder(root, inorder);




    }

    // public static Node createMirror(Node root){
    //     if(root==null){
    //         return null;
    //     }
    //     Node leftSubtree=createMirror(root.left);
    //     Node rightSubtree=createMirror(root.right);
    //     root.left=rightSubtree;
    //     root.right=leftSubtree;
    //     return root;
    // }
    public static void main(String args[]){
        int arr[]={3,5,6,8,10,11,12};
        Node root=createBst(arr, 0, arr.length-1);
        preorder(root);
        // Node root=new Node(8);
        // root.left=new Node(5);
        // root.right=new Node (10);
        // root.left.left=new Node(3);
        // root.left.right=new Node(6);
        // root.right.right=new Node(11);

    }
}
