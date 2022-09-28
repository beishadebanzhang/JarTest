package com.example.jartest.vavr;

import io.vavr.control.Try;

/**
 * Try
 *  Try是一个容器，来包装一段可能产生异常的代码
 *  Option用来包装可能产生null的对象，而Try用来包装可能产生异常的代码块，这样就不用显式的通过try-catch来处理异常
 */
public class TryTest {
    public static void main(String[] args) {
        Try<Integer> result = Try.of(() -> 1 / 0);
        // 判断代码块是否有异常
        System.out.println(result.isFailure());
        // 异常时返回默认值
        System.out.println(result.getOrElse(100));
        // 抛出指定异常
        result.getOrElseThrow(() -> new ArithmeticException());
    }
}
