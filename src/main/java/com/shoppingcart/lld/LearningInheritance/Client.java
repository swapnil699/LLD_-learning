package com.shoppingcart.lld.LearningInheritance;

public class Client {
    public static void main(String[] args) {
//        User user1 = new User();
//        user1.userName = "skylags";
//        user1.email = "umang_1@scaler.com";
//        user1.name = "Umang";



        Instructor i1 = new Instructor();
        //System.out.println(i1.email);
        i1.email = "umang_1@scaler.com";
        i1.name = "";
        i1.userName = "";
        i1.avgRating = 4.89;
        i1.batchName = "June24 Intermediate";
        //i1.scheduleClass();


        D d = new D();
//        d.s = "dnc";
        d.d = 10;
        d.c = 20;
        d.b = 30;
        d.a = 40;

        C acc = new D();
    //    acc.d = 10;           //we can't access of child attributes and methode
        acc.c = 20;
        acc.b = 30;
    }
}