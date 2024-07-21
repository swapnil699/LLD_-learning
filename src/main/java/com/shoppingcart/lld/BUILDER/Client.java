package com.shoppingcart.lld.BUILDER;

public class Client {
    public static void main(String[] args) {
        Student st = Student.getBuilder()
                .setName("Umang")
                .setAge(25)
                .setGradYear(2022)
                .setPsp(90)
                .setUniversityName("ABC")
                .build();

        System.out.println("DEBUG");
    }
}
