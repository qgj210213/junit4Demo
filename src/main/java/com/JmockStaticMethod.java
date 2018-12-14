package com;

/**
 * @author ts-guangjie.qi
 * 传统的JMock是无法Mock静态方法的，但是Jmockit能够很好地Mock类的静态方法。
 *
 */
public class JmockStaticMethod {
    public static int m1() {
        throw new RuntimeException();
    }

    public static String m2() {
        throw new RuntimeException();
    }

}
