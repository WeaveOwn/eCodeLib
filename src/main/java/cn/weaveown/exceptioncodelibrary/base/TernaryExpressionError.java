package cn.weaveown.exceptioncodelibrary.base;

/**
 * @author wangwei
 * @date 2020/4/14 19:55
 */
public class TernaryExpressionError {
    public static void main(String[] args) {
        boolean condition = false;
        Double value1 = 1.0D;
        Double value2 = 2.0D;
        Double value3 = null;
        Double result = condition ? value1 * value2 : value3; // 抛出空指针异常
    }
}
