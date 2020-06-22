package com.mock;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.unit.DateUtil;

import junit.framework.TestCase;
import mockit.Injectable;
import mockit.Mock;
import mockit.MockUp;
import mockit.integration.junit4.JMockit;
/**
 * @author ts-guangjie.qi
 *
 */
@RunWith(JMockit.class)
public class StaticMethodSimpleTest_jMockit extends TestCase {
    @Injectable
    private  DateUtil DateUtilMock;
    @Test
    public void testGetSample() throws Exception {
        new MockUp<DateUtil>() {
            @Mock
            public String dateToString(final Date value, final String formal) {
                return "20170102";
            }

        };
        /*new NonStrictExpectations() {
            {
                DateUtil.dateToString(new Date(), "yyyyMMdd"); result="20170102";
            }
        };*/
        assertEquals("20170102", DateUtil.dateToString(new Date(), "yyyyMMdd"));
        System.out.println("ok");

        System.out.println("DateUtilMock+"+DateUtilMock.toString());
    }

}
