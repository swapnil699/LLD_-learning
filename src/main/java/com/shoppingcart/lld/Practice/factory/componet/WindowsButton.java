package com.shoppingcart.lld.Practice.factory.componet;

public class WindowsButton implements Button{
    @Override
    public void ShowButton() {
        System.out.println("showing Windows button");
    }

    @Override
    public void ClickButton() {
        System.out.println("chick windows button");
    }
}
