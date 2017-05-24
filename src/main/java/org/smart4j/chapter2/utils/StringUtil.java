package org.smart4j.chapter2.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * 测试
 * Created by Administrator on 2017/5/24.
 */
public class StringUtil {

    public static boolean isEmpty (String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty (String str) {
        return !isEmpty(str);
    }
}
