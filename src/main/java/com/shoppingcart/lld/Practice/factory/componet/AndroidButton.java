package com.shoppingcart.lld.Practice.factory.componet;

public class AndroidButton implements Button{
    @Override
    public void ShowButton() {
        System.out.println("showing Android button");
    }

    @Override
    public void ClickButton() {
        System.out.println("chick Android button");
    }
}
