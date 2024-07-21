package com.shoppingcart.lld.Practice;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newCachedThreadPool();

        List<Integer> ls = List.of(1,4,56,3,2,43,2,3,32,23,3);

        /* for single thread */
//        PrintNumber task = new PrintNumber(1);
//        Thread t1 = new Thread(task);
//        t1.start();

        /* printing for 1 - 100 threads */
//        for(int i=1; i<=100; i++){
//            PrintNumber n = new PrintNumber(i);
//            Thread t = new Thread(n);
//            t.start();
//        }


        Phone p = new Phone();
        p.desc();
        p.name();
        p.getPrice();
    }
}
