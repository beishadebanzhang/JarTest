package com.example.jartest.guava.base;


import com.google.common.base.Optional;

/**
 * Optional不建议作为参数传递, 因为本身需要做null判断
 * 不使用java api自带optional原因:
 *  原生optional未实现序列化接口, 使用 JDK 序列化将会报错 --> 不建议将 Optional 作为属性
 */
public class OptionalTest {
    public static void main(String[] args) {
        // Optional.of(): 如果传入的参数为null就抛出NullPointerException异常
        String str = "123";
        Optional<String> optional = Optional.of(str);
        System.out.println(optional.get());
        str = null;
        // optional = Optional.of(str);
        System.out.println(optional.get());
        // Optional.fromNullable(): 当T为Null则使用默认值
        optional = Optional.fromNullable(str);
        System.out.println(optional.get());
        // Optional<T>.absent()
        optional = Optional.absent();
        System.out.println(optional.get());
    }

    // 不使用optional
//    public void origin() {
//        Yes yes = getYes();
//        if (yes != null) {
//            Address yesAddress = yes.getAddress();
//            if (yesAddress != null) {
//                Province province = yesAddress.getProvince();
//                System.out.println(province.getName());
//            }
//        }
//        throw new NoSuchElementException(); //如果没找到就抛错
//    }

    // 使用optional
    // 参考文档: https://blog.csdn.net/g6U8W7p06dCO99fQ3/article/details/118282653?spm=1001.2101.3001.6661.1&utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-118282653-blog-122148396.pc_relevant_default&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-118282653-blog-122148396.pc_relevant_default&utm_relevant_index=1
//    public void current() {
//        java.util.Optional.ofNullable(getYes())
//                .map(a -> a.getAddress())
//                .map(p -> p.getProvince())
//                .map(n -> n.getName())
//                .orElseThrow(NoSuchElementException::new);
//    }
}
