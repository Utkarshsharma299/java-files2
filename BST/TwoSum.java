import  java.util.*;
public class TwoSum{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void getInorder(Node root,ArrayList<Integer>sum){
    if(root==null){
        return;
    }
    getInorder(root.left, sum);
    sum.add(root.data);
    getInorder(root.right, sum);

    }
    static int x;
    public static void Two(Node root1,Node root2){
        ArrayList<Integer>sum1=new ArrayList<>();
        getInorder(root1, sum1);
        ArrayList<Integer>sum2=new ArrayList<>();
        getInorder(root2, sum2);
        int left=0;
        int rigth=sum2.size()-1;
        int count =0;
        while(left<sum1.size()&&rigth>=0){
            int eSum=sum1.get(left)+sum2.get(rigth);
            if(eSum==x){
                System.out.println("("+sum1.get(left)+","+sum2.get(rigth)+")");
                
count++;
left++;
rigth--;

            }else if(eSum<x){
                left++;

            }
            else{
            rigth--;
            }

        }
        System.out.println(count);

    }

    public static void main(String args[]){
        Node root1=new Node(5);
        root1.left=new Node(3);
        root1.left.left=new Node(2);
        root1.right=new Node(7);
        root1.right.left=new Node(6);
        root1.right.right=new Node(8);



        Node root2=new Node(10);
        root2.left=new Node(6);
        root2.left.left=new Node(3);
        root2.left.right=new Node(15);
        root2.right=new Node(15);
        root2.right.left=new Node(11);
        root2.right.right=new Node(18);
        int x=16;
        Two(root1, root2);
    }
}