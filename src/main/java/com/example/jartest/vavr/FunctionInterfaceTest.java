package com.example.jartest.vavr;

import io.vavr.Function3;

/**
 * 函数式接口
 *  Java 8中的函数式接口最多接收两个参数，Vavr对其进行了扩展，最多支持8个参数
 */
public class FunctionInterfaceTest {
    public static void main(String[] args) {
        // 前几个为参数类型, 最后一个为结果类型
        Function3<Integer, Integer, Integer, String> concat = (a, b, c) -> a + b + c + "";
        System.out.println(concat.apply(1, 2, 3));
    }
}
