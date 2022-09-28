package com.example.jartest.vavr;

import static io.vavr.API.*;

/**
 * 模式匹配Pattern Matching
 *  当我们执行一个计算或根据输入返回一个满足条件的值时，我们通常会用到if语句
 *  当条件数量大增时，代码将急剧膨胀。当改为switch时，情况似乎也没有好转
 *  在Vavr中，我们通过Match方法替换switch块
 *  每个条件检查都通过Case方法调用来替换, $()来替换条件并完成表达式计算得到结果
 */
public class PatternMatchingTest {
    public static void main(String[] args) {
        int input = 2;
        String output = Match(input).of(
            Case($(1), "one"),
            Case($(2), "two"),
            Case($(), "other")
        );
        System.out.println(output);
        // 此外我们还可以通过谓词(predicate)来替换表达式
//        Match(arg).of(
//                Case(isIn("-h", "--help"), o -> run(this::displayHelp)),
//                Case(isIn("-v", "--version"), o -> run(this::displayVersion)),
//                Case($(), o -> run(() -> {
//                    throw new IllegalArgumentException(arg);
//                }))
//        );
    }
}
