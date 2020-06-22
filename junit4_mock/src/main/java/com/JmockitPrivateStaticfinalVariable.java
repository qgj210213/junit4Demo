package com;

import java.util.Date;

import com.unit.DateUtil;

public class JmockitPrivateStaticfinalVariable {
    private static final int HELLO_CONSTANTS_PRIMITIVE_TYPE = 100;
    private static final Integer HELLO_CONSTANTS_REFERENCE_TYPE = 100;
    private static final String currentday = "20181221";
    private static final String currentdayTWO = DateUtil.dateToString(new Date(), "yyyyMMdd");

    public  void printHelloConstants() {
        System.out.println("----------------------------------------------------");
        System.out.println("HELLO_CONSTANTS_PRIMITIVE_TYPE="+HELLO_CONSTANTS_PRIMITIVE_TYPE);
        System.out.println("HELLO_CONSTANTS_REFERENCE_TYPE="+HELLO_CONSTANTS_REFERENCE_TYPE);
        System.out.println("CURRENTDAY="+currentday);
        System.out.println("currentdayTWO="+currentdayTWO);
    }

}
