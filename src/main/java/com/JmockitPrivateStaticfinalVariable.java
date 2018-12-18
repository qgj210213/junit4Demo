package com;

public class JmockitPrivateStaticfinalVariable {
    private static final int HELLO_CONSTANTS_PRIMITIVE_TYPE = 100;
    private static final Integer HELLO_CONSTANTS_REFERENCE_TYPE = 100;

    public  void printHelloConstants() {
        System.out.println("----------------------------------------------------");
        System.out.println("HELLO_CONSTANTS_PRIMITIVE_TYPE="+HELLO_CONSTANTS_PRIMITIVE_TYPE);
        System.out.println("HELLO_CONSTANTS_REFERENCE_TYPE="+HELLO_CONSTANTS_REFERENCE_TYPE);
    }

}
