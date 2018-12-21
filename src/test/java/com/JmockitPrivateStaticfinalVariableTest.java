package com;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import mockit.Deencapsulation;
import mockit.Tested;

@RunWith(Enclosed.class)
public class JmockitPrivateStaticfinalVariableTest {
    public static class ExecuteTest {
        @Tested
        JmockitPrivateStaticfinalVariable jp;
        @BeforeClass
        public static void setupBeforeClass() {
           System.out.println("before class");
        }
        @Before
        public void setup() {
            System.out.println("before");
//            Deencapsulation.setField(JmockitPrivateStaticfinalVariable.class, "HELLO_CONSTANTS_PRIMITIVE_TYPE", 1000);
//            Deencapsulation.setField(JmockitPrivateStaticfinalVariable.class, "HELLO_CONSTANTS_REFERENCE_TYPE", 1000);
        }
        @Test
        public void testPrintHelloConstans() {

            Deencapsulation.setField(JmockitPrivateStaticfinalVariable.class, "HELLO_CONSTANTS_PRIMITIVE_TYPE", 1000);
            Deencapsulation.setField(JmockitPrivateStaticfinalVariable.class, "HELLO_CONSTANTS_REFERENCE_TYPE", 1000);
            Deencapsulation.setField(JmockitPrivateStaticfinalVariable.class, "currentday","20170101");
//            new Expectations() {{ DateUtil.dateToString(new Date(), "yyyyMMdd"); result = "20170102"; }};
//            Deencapsulation.invoke(DateUtil.class, "dateToString", "20170102");
            jp = new JmockitPrivateStaticfinalVariable();
            jp.printHelloConstants();
        }
    }

}
