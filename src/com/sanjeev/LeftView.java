package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
public class LeftView {

    private static int max_level=0;
    static void leftView(BinaryTreeNode<Integer> root) {
        left(root,1);
    }

    public static void left(BinaryTreeNode<Integer> root,int level){
        if(root==null){
            return;
        }else if(max_level<level){
            System.out.print(" "+root.data);
            max_level=level;
        }
        left(root.left,level+1);
        left(root.right,level+1);
    }
}
