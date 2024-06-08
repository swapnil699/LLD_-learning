package com.shoppingcart.lld.AdderSubtractorSyncMethods;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Count count;
    Lock lock;
    Adder(Count count){
        this.count = count;

    }
    @Override
    public Void call() throws Exception {
        for(int i = 1 ; i <= 10000 ; i++){
            count.incrementByX(i);
        }
        return null;
    }
}