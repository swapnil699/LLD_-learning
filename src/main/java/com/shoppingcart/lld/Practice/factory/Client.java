package com.shoppingcart.lld.Practice.factory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory ui = flutter.getUIFactory(Platform.Android);
        
    }
}
