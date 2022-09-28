package com.example.jartest.vavr;

import io.vavr.collection.List;

/**
 * 集合Collections
 *  Java中的集合通常是可变集合，这通常是造成错误的根源。特别是在并发场景下。
 *  此外Jdk中的集合类存在一些不足。例如JDK中的集合接口提供的一个方法clear，
 *  该方法删除所有元素而且没有返回值
 *
 *  在并发场景下大多集合都会会产生问题，因此有了诸如ConcurrentHashMap这样的类
 *  此外JDK还通过一些其它的方法创建不可变集集合，但误用某些方法时会产生异常
 *  如创建不可修改List，在误调用add的情况下会产生UnsupportedOperationException
 *
 *  Vavr中的集合则会避免这些问题，并且保证了线程安全、不可变等特性
 */
public class CollectionTest {
    public static void main(String[] args) {
        // 在Vavr中创建一个list，实例并且不包含那些会导致UnsupportedOperationException异常的方法，且不可变
        // 这样避免误用，造成错误
        List<Integer> intList = List.of(1, 2, 3);
        System.out.println(intList.get(0));
        // 执行计算任务
        System.out.println(intList.sum().intValue());
    }
}
