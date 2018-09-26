package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
public class BoundaryTranversalTree {

    public  void printBoundary(Node node)
    {
        System.out.print(node.data);
        printLeft(node.left);
        printLeaves(node);
        printRight(node.right);
    }

    public   void printLeaves(Node node){
        if(node==null){
            return;
        }else if(node.left==null && node.right==null){
            System.out.print(" "+node.data);
        }else{
            printLeaves(node.left);
            printLeaves(node.right);
        }
    }

    public  void printLeft(Node node){
        if(node==null){
            return;
        }else {
            if(node.left!=null || node.right!=null){
                System.out.print(" "+node.data);
            }
            if(node.left!=null){
                printLeft(node.left);
            }else{
                printLeft(node.right);
            }
        }
    }

    public  void printRight(Node node){
        if(node==null){
            return;
        }else {
            if(node.right!=null){
                printRight(node.right);
            }else{
                printRight(node.left);
            }
            if(node.left!=null || node.right!=null){
                System.out.print(" "+node.data);
            }
        }
    }
}
