package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
public class RightView {
    private static int max_level=0;
    static void rightView(BinaryTreeNode<Integer> root) {
        right(root,1);
    }

    public static void right(BinaryTreeNode<Integer> root,int level){
        if(root==null){
            return;
        }else if(max_level<level){
            System.out.print(" "+root.data);
            max_level=level;
        }
        right(root.right,level+1);
        right(root.left,level+1);
    }
}
