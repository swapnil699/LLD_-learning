package com.shoppingcart.lld.Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Student> ls = new ArrayList<>();
        ls.add(new Student("Umang", 90, "ABC"));
        ls.add(new Student("Abhishek", 99, "CVB"));
        ls.add(new Student("Varudhni", 100, "XYZ"));

          /*
        I want to sort this student list
         */

        Collections.sort(ls); //sort as per natural ordering defined in the class
        //System.out.println(ls);
        Collections.sort(ls, new StudentPSPCompatator());
        //System.out.println(ls);

        Collections.sort(ls, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.univName.compareTo(t1.univName);
            }
        });

        /*
        You can even beautify the above code.
         */

        Collections.sort(ls, (Student student, Student t1) -> {
            return student.univName.compareTo(t1.univName);
        });

        //Runnable
        HelloWorldPrint task1 = new HelloWorldPrint();
        Thread t1 = new Thread(task1);
        t1.start();

        Runnable r = () -> {
            System.out.println("Hello world");
        };

        Thread tx = new Thread(r);
        tx.start();

        Thread t3 = new Thread(() -> System.out.println("Hello world"));
        t3.start();

        //callable
        MathematicalOperation additionOperation = (int a, int b) -> a + b;

        MathematicalOperation subtractionOperation = (int a, int b) -> a - b;

        MathematicalOperation multiOperation = (int a, int b) -> a * b;

        MathematicalOperation complexOperation = (int a, int b) -> {
            if(a < b){
                return a*b;
            }else if(b < a){
                return a - b;
            }else{
                return a / b;
            }
        };

        System.out.println(additionOperation.operate(2,4));
        System.out.println(subtractionOperation.operate(5,6));
        System.out.println(multiOperation.operate(19,23));
//        System.out.println(complexOperation.operate(21,12));
    }
}
