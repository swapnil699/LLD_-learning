package com.shoppingcart.lld.Practice;

public class PrintNumber implements Runnable{
    int number;

    PrintNumber(int n){
        this.number = n;
    }

    @Override
    public void run() {
        System.out.println("printing " + number + " Thread no " + Thread.currentThread().getName());
    }
}
