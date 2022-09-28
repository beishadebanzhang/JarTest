package com.example.jartest.vavr;

import io.vavr.Lazy;

/**
 * 延迟计算Lazy
 *  Lazy是一个容器，表示一个延迟计算的值。计算被推迟，直到需要时才计算
 *  此外，计算的值被缓存或存储起来，当需要时被返回，而不需要重复计算
 */
public class LazyTest {
    public static void main(String[] args) {
        Lazy<Double> lazy = Lazy.of(Math::random);
        System.out.println(lazy.isEvaluated());
        System.out.println(lazy.get());
        System.out.println(lazy.isEvaluated());
    }
}
