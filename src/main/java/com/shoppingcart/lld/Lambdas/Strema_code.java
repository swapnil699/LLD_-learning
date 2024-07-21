package com.shoppingcart.lld.Lambdas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strema_code {
    public static void main(String[] args) {
         /*
        Streams - like a pipeline
        Data (pipeline attached to some data source)
        Print 1000 rows
        for(int i  = 1 ; i < = 1000 ; i++){
            if( i == 500th) {
                ....
            }
        }
        Streams will affect / improve performance on a positive side.
        Stream uses very complex tree like Data structures which makes the
        stream smart enough to optimize things.
         */

        List<Integer> lst = List.of(2,5,3,10,8,9,1);
        Stream<Integer> st1 = lst.stream();
        Stream<Integer> st2 = lst.stream();
        Stream<Integer> st3 = lst.stream();
        /*
        st1 is nothing but like a pipeline attached to the list.
        It's actually a stream reference
         */
        System.out.println(st1);
        /*
        There are methods using which you can read data from the stream.
        Intermediate - returns the stream reference
        Terminal - returns the data, stream will be closed after this.
         */
//
//        System.out.println(st1.limit(3).count());
//        System.out.println(st2.count()); // Terminal methods
//        System.out.println(st3.limit(3).count());

//        System.out.println(st1.count());
/*
        You can have as many methods as you want on top of stream
         */
//        for(int i = 0 ; i < lst.size() ; i++){
//            System.out.println(lst.get(i));
//        }

        st2.forEach((x) -> {
            System.out.println(x + " ");
        });

        //System.out.println(st2.count()); already the stream is closed

        /*
        filter
        sort
        reduce
         */
        lst.stream().forEach((x) -> {System.out.println(x);});
        
        List<Integer> res = lst
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(res);


        List<Integer> res2 = lst
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .map((elem) -> elem * elem)
                .sorted((x,y) -> y - x )
                .collect(Collectors.toList());

        System.out.println(res2);

    }
}
