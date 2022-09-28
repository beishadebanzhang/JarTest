package com.example.jartest.vavr;

import io.vavr.control.Option;

/**
 * Option:
 *  Option的作用是消除代码中的null检查。
 *  在Vavr中Option是一个对象容器，与Optional类似，有一个最终结果。
 *  Vavr中的Option实现了Serializable, Iterable接口，并且具有更加丰富的API
 */
public class OptionTest {

    public static void main(String[] args) {
        // 使用Option null值会通过None实例来表示, 而非null值则是某个具体对象实例
        Option<Object> noneOption = Option.of(null);
        System.out.println(noneOption.toString());
        // 为null设定指定值, 不为null时返回值本身
        System.out.println(noneOption.getOrElse("baeldung"));
        noneOption = Option.of("123"); // Some(123)
        System.out.println(noneOption.getOrElse("none"));

    }

}
