package com.sanjeev;

/**
 * Created by Sanjeev Guglani
 */
public class SumTree {

    boolean isSumTree(Node node)
    {
        return sum(node)!=-1;
    }

    public int sum(Node node){
        if(node==null){
            return 0;
        }else if(node.right==null && node.left==null){
            return node.data;
        }else{
            int left = sum(node.left);
            int right = sum(node.right);
            if(left==-1 || right==-1){
                return -1;
            }else if((left+right)!=node.data){
                return -1;
            }else {
                return 2*node.data;
            }

        }
    }
}
