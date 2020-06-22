package com;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.Mock;
import mockit.MockUp;
import mockit.integration.junit4.JMockit;

/**
 * @author ts-guangjie.qi
 * JMock mock Static method
 *
 */
@RunWith(JMockit.class)
public class JmockStaticMethodTest {

    @Test
    public void test() {
        new MockUp<JmockStaticMethod>() {
            @Mock
            public String m2() {
                return "ATY";
            }

            @Mock
            public int m1() {
                return 100;
            }
        };
        assertEquals("ATY", JmockStaticMethod.m2());
        assertEquals(100, JmockStaticMethod.m1());
    }

}
