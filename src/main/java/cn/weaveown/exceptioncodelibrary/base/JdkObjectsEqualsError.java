package cn.weaveown.exceptioncodelibrary.base;

import java.util.Objects;

/**
 * @author wangwei
 * @date 2020/4/14 19:35
 */
public class JdkObjectsEqualsError {
    /**
     * Objects.equals方法的源代码可知：
     * 语句 System.out.println(Objects.equals(shortValue, 12345))，
     * 因为 Objects.equals 的两个参数对象类型不一致，
     * 一个是包装数据类型 Short，另一个是包装数据类型 Integer，
     * 所以最终的比较结果必然是false；
     * 而语句 System.out.println(Objects.equals(intValue, 12345))，
     * 因为 Objects.equals 的两个参数对象类型一致，
     * 都是包装数据类型 Integer 且取值相同，所以最终的比较结果必然是 true。
     * @param args
     */
    public static void main(String[] args) {
        right();
        error();
        resolve();
    }

    public static void right() {
        Short shortValue = (short)12345;
        System.out.println(shortValue == 12345); // true
        Integer intValue = 12345;
        System.out.println(intValue == 12345); // true
        Long longValue = 12345L;
        System.out.println(longValue == 12345); // true
    }

    public static void error(){
        Short shortValue = (short)12345;
        System.out.println(Objects.equals(shortValue, 12345)); // false
        Integer intValue = 12345;
        System.out.println(Objects.equals(intValue, 12345)); // true
        Long longValue = 12345L;
        System.out.println(Objects.equals(longValue, 12345)); // false
    }

    public static void resolve() {
        Short shortValue = (short)12345;
        System.out.println(Objects.equals(shortValue, (short)12345)); // true
        Integer intValue = 12345;
        System.out.println(Objects.equals(intValue, 12345)); // true
        Long longValue = 12345L;
        System.out.println(Objects.equals(longValue, 12345L)); // true
    }
}
