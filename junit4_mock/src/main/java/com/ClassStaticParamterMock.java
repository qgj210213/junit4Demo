package com;

import java.util.Date;

import com.unit.DateUtil;

/**
 * @author ts-guangjie.qi
 * mock 静态变量的值
 *
 */
public class ClassStaticParamterMock {
    private static final int batchStartDate = Integer.valueOf(DateUtil.dateToString(new Date(), "yyyyMMdd"));//

    public static void main(String[] args) {
        ClassStaticParamterMock mock = new ClassStaticParamterMock();
        mock.doBatchStartDate();
    }

    private void doBatchStartDate() {
        System.out.println("バッチ起動日--:" + batchStartDate);
    }

}
