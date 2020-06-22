package com.unit;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtil {
    /**
     * Date型をyyyyMMddの文字列へ変換する.
     *
     * @param value 日付 Date
     * @param format String
     * @return String yyyyMMdd形式に変換後年月日文字列
     */
    public static String dateToString(final Date value, final String format) {
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(value);
    }

}
