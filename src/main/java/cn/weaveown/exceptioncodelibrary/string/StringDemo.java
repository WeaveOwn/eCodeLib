package cn.weaveown.exceptioncodelibrary.string;

/**
 * @author wangwei
 * @date 2020/4/23 10:03
 */
public class StringDemo {
    /**
     * 使用循环字符串连接方式，请使用StringBuilder的append进行扩展
     * 因为下面这种方式在循环体内 进行了new StringBuilder append toString 造成资源的浪费
     *
     * 可查看字节码
     */
    public void loopStringUseStringBuilderTest() {
        String str = "";
        for (int i = 0; i < 10; i++) {
            str += i;
        }
        System.out.println(str);
    }
}
