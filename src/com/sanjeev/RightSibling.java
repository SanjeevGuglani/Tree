package com.sanjeev;

public class RightSibling {


    public static void tranverse(Node node){
        if(node==null){
            return;
        }
        if(node.rightSibling!=null) {
            System.out.println(node.data + "---->" + node.rightSibling.data);
        }
        tranverse(node.left);
        tranverse(node.right);
    }


    public static void fillRightSibling(Node node){
        if(node==null || (node.left==null && node.right==null)){
            return;
        }
        Node temp;
        Node rightSibling=node.rightSibling;
        while(rightSibling!=null){
            if(rightSibling.left!=null){
                temp= rightSibling.left; break;
            }else if(rightSibling.right!=null){
                temp = rightSibling.right; break;
            }else{
                rightSibling = rightSibling.rightSibling;
            }
        }
        if(node.left!=null && node.right!=null){
            node.left.rightSibling = node.right;
        }
        if(node.left!=null){
            node.left.rightSibling = rightSibling;
        }else {
            node.right.rightSibling = rightSibling;
        }

        fillRightSibling(node.right);
        fillRightSibling(node.left);
    }
    public static void main(String[] args) {
        Node node = new Node();
        node.data=1;
        node.left=new Node();
        node.right=new Node();
        node.left.data=2;
        node.right.data=3;
        node.left.left=new Node();
        node.left.left.data=4;
        node.right.left=new Node();
        node.right.right=new Node();
        node.right.left.data=5;
        node.right.right.data=6;
        node.left.left.right=new Node();
        node.left.left.right.data=7;
        node.right.left.right=new Node();
        node.right.left.right.data=8;
        node.right.right.right=new Node();
        node.right.right.right.data=9;
        fillRightSibling(node);
        tranverse(node);

    }
}
