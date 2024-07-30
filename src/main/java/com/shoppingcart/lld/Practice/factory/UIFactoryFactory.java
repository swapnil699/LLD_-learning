package com.shoppingcart.lld.Practice.factory;

public class UIFactoryFactory {
    public  static  UIFactory getUIFactoryforPlatform(Platform platform){

        if(platform.equals(Platform.Android)){
            return new AndoridFactory();
        }
        else if (platform.equals(Platform.Windown)) {
            return new WindownFactory();
        }
        else {
            return new IOSfactory();
        }
    }
}
