package com.example.jartest.vavr;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.Tuple3;

/**
 * 元组Tuple
 *  Java中没有与元组(Tuple)相对应的结构。
 *  Tuple是函数式编程中一种常见的概念。
 *  Tuple是一个不可变，并且能够以类型安全的形式保存多个不同类型的对象。
 *  Tuple中最多只能有8个元素
 */
public class TupleTest {

    public static void main(String[] args) {
        Tuple2<String, Integer> tuple2 = Tuple.of("Java", 8);
        System.out.println(tuple2._1);
        System.out.println(tuple2._2);
        Tuple3<String, Integer, String> tuple3 = Tuple.of("Java", 8, "java8");
        System.out.println(tuple3._3);
    }

}
