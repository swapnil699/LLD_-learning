package com.shoppingcart.lld.Practice.factory.componet;

public class IOSButton implements Button{
    @Override
    public void ShowButton() {
        System.out.println("showing ios button");
    }

    @Override
    public void ClickButton() {
        System.out.println("chick ios button");
    }
}
