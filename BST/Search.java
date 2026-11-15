import java.util.*;
public class Search {
   static  public class Node{
        int data;
        Node left;
        Node  right;
        Node(int data){
            this.data=data;
        }
    }
    static class BinaryTree{
        Node root;
    public static boolean search(Node root,int key ){
        if(root==null){
            return false;

        }
        if(root.data==key){
            return true;

        }
        if(root.data>key){
            return  search(root.left, key);

        }else{
            return search(root.right, key);
            
        }
    }
    public static Node delete(Node root ,int val){
        if(root.data<val){
            root.right=delete(root.right, val);

        }else if(root.data>val){
            root.left=delete(root.left,val);

        }else{
            // case 1 -leaf Node 
            if(root.left==null&&root.right==null){
                return null;

            }
            if(root.left==null){
                return root.right;

            }
            else if(root.right==null){
                return root.left;

            }
            else{
              Node Is=  findInorderSuccessor(root.right);
              root.data=Is.data;
              root.right=delete(root.right,Is.data);

            }
            
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;

        }
        return root;
    }
public static void printInrange(Node root,int k1,int k2){
    if(root==null){
        return ;

    }
    if(root.data>=k1&&root.data<=k2){
        printInrange(root.left, k1, k2);
        System.out.println(root.data+" ");
        printInrange(root.right, k1, k2);
    }else if(root.data<k1){
        printInrange(root.left, k1, k2);

    }else{
    printInrange(root.right, k1, k2);

    }
}
public static void printPath(ArrayList<Integer>path){
    for(int i=0;i<path.size();i++){
        System.out.print(path.get(i));

    }
    System.out.println();
}
public static void printRoot2Leaf(Node root,ArrayList<Integer>path){
    if(root==null){
        return ;
    }
    path.add(root.data);
    if(root.left==null&&root.right==null){
        printPath(path);
    }
    printRoot2Leaf(root.left,path);
    printRoot2Leaf(root.right, path);
    path.remove(path.size()-1);
}
public static boolean isValidBst(Node root,Node min ,Node max){
    if(root==null){
        return true;

    }
    if(min!=null&&root.data<=min.data){
        return false;
    }
    else if(max!=null&&root.data>=max.data){
        return false;
    }
    return isValidBst(root.left, min,root)&&isValidBst(root.right,root,max);

}
    }
    public static void main(String args[]){
        
        BinaryTree tree =new BinaryTree();
        tree.root=new Node(8);
        tree.root.left=new Node(5);
        tree.root.left.left=new Node(3);
        tree.root.left.left.left=new Node(1);
        tree.root.left.right=new Node(6);
        tree.root.left.left.right=new Node(4);
        tree.root.right=new Node(10);
        tree.root.right.right=new Node(11);
        System.out.println(tree.search(tree.root, 6));
        System.out.println(tree.delete(tree.root, 3));
        if(isValidBst(root,null,null)){
            System.out.println("is Valid");
        }else{
            System.out.println("not valid");
            
        }
    }
}
