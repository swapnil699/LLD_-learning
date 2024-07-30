package com.shoppingcart.lld.Practice.factory;

public class Flutter {
     void Refersh(){
         System.out.println("showing refersh");
     }
     UIFactory getUIFactory(Platform platform){
         return UIFactoryFactory.getUIFactoryforPlatform(platform);
     }
}
