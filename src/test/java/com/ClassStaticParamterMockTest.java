package com;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import com.unit.DateUtil;

import mockit.Mock;
import mockit.MockUp;
import mockit.Tested;

@RunWith(Enclosed.class)
public class ClassStaticParamterMockTest {
    @Tested
    private ClassStaticParamterMock suut;

    public static class mockStaticPrameter {
        @Tested
        private ClassStaticParamterMock sut;

        @BeforeClass
        public static void setUpBeforeClass() throws Exception {
            System.out.println("setUpBeforeClass");
        }

        @AfterClass
        public static void tearDownAfterClass() throws Exception {
            System.out.println("tearDownAfterClass");
        }

        @Before
        public void setUp() throws Exception {
            System.out.println("setUp before");
            new MockUp<DateUtil>() {
                @Mock
                public String dateToString(final Date value, final String formal) {
                    return "20170101";
                }

            };
        }

        @After
        public void tearDown() throws Exception {
            System.out.println("tearDown");
        }

        @Test()
        public void test() {
            System.out.println("test");
            new MockUp<DateUtil>() {
                @Mock
                public String dateToString(final Date value, final String formal) {
                    return "20170102";
                }

            };
            sut.main(null);
            System.out.println("--------------------");
        }
    }

}
