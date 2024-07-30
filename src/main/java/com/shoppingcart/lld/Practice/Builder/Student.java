//package com.shoppingcart.lld.Practice.Builder;
//
//public class Student1 {
//    String name;
//    String Email;
//    int age;
//    String Batch;
//
//    public static Builder getBuilder(){
//        return new Builder();
//    }
//
//    private Student(Builder builder){
//        this.name = builder.name;
//        this.Email = builder.Email;
//        this.age = builder.age;
//        this.Batch = builder.Batch;
//    }
//    public class Builder{
//        String name;
//        String Email;
//        int age;
//        String Batch;
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getEmail() {
//            return Email;
//        }
//
//        public void setEmail(String email) {
//            Email = email;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
//
//        public String getBatch() {
//            return Batch;
//        }
//
//        public void setBatch(String batch) {
//            Batch = batch;
//        }
//    }
//
//    public Student(Builder builder){
//
//        if(this.age > 60){
//            throw new RuntimeException("not allow");
//        }
//    }
//}
