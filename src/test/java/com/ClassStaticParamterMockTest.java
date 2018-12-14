package com;

import java.util.Date;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import com.unit.DateUtil;

import mockit.Mock;
import mockit.MockUp;
import mockit.Tested;

@RunWith(Enclosed.class)
public class ClassStaticParamterMockTest {

    public static class mockStaticPrameter {
        @Tested
        private ClassStaticParamterMock sut;

        @Test
        public void test() {
            new MockUp<DateUtil>() {
                @Mock
                public String dateToString(final Date value, final String formal) {
                    return "20170101";
                }

            };
            sut.main(null);
        }
    }

}
