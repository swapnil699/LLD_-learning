package com.shoppingcart.lld.Practice.Node;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSize implements Callable<Integer> {
    Node root;
    ExecutorService ex;

    TreeSize(Node root, ExecutorService ex){
        this.root = root;
        this.ex = ex;
    }
    @Override
    public Integer call() throws Exception {
        //base case
        if(root == null)    return 0;

        //left call
        TreeSize lefttree = new TreeSize(root.left, ex);

        //right call
        TreeSize righttree = new TreeSize(root.right, ex);

        //e
        Future<Integer> l = ex.submit(lefttree);
        Future<Integer> r = ex.submit(righttree);

        //return
        return l.get() + r.get() + 1;
    }
}
