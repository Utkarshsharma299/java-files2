public class preOrder {
    static class Node{
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
    public static void traversal(Node node){
        if(node==null){
            return ;
        }
System.out.print(node.data+" ");
traversal(node.left);
traversal(node.right);
    }
}
    }
    public static void main(String args[]){
        BinaryTree tree=new BinaryTree();
tree.root=new Node(1);
tree.root.left=new Node(2);
tree.root.left.left=new Node(4);
tree.root.left.right=new Node(5);
tree.root.right=new Node(3);
tree.root.right.right=new Node(6);
tree.traversal(tree.root);
    }
}
