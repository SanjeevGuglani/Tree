package com.sanjeev;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Sanjeev Guglani
 */
public class LevelOrderTranversal {

    public static void levelOrderTranversal(Queue<Node> queue){
        Node node=queue.poll();
        if(node==null){
            return;
        }
        System.out.println(node.data);
        if(node.left!=null) {
            queue.add(node.left);
        }
        if(node.right!=null) {
            queue.add(node.right);
        }
        levelOrderTranversal(queue);
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
        /*node.right.left.right=new Node();
        node.right.left.right.data=8;*/
        node.right.right.right=new Node();
        node.right.right.right.data=9;
        Queue<Node> queue= new LinkedList<Node>();
        queue.add(node);
        levelOrderTranversal(queue);
    }
}
