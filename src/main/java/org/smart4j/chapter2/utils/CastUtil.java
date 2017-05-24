package org.smart4j.chapter2.utils;

/**
 * Created by Administrator on 2017/5/24.
 */
public class CastUtil {

    public static String castString (Object obj) {
        return CastUtil.castString(obj, "");
    }

    public static String castString (Object obj, String defaulVal) {
        return obj != null ? String.valueOf(obj) : defaulVal;
    }

    public static double castDouble (Object obj) {
        return castDouble(obj, 0);
    }

    public static double castDouble (Object obj, double defaultVal) {
        double val = defaultVal;

        if (obj != null) {
            String strVal = castString(obj);
            if (StringUtil.isNotEmpty(strVal)) {
                val = Double.parseDouble(strVal);
            }
        }

        return val;
    }

    public static long castLong (Object obj) {
        return castLong(obj, 0);
    }

    public static long castLong (Object obj, long defaultVal) {
        long val = defaultVal;

        if (obj != null) {
            String strVal = castString(obj);
            if (StringUtil.isNotEmpty(strVal)) {
                val = Long.parseLong(strVal);
            }
        }

        return val;
    }

    public static int castInt(Object obj) {
        return castInt (obj, 0);
    }

    public static int castInt (Object obj, int defaultVal) {
        int val = defaultVal;

        if (obj != null) {
            String strVal = castString(obj);
            if (StringUtil.isNotEmpty(strVal)) {
                val = Integer.parseInt(strVal);
            }
        }

        return val;
    }

    public static boolean castBoolean(Object obj) {
        return castBoolean(obj, false);
    }

    public static boolean castBoolean (Object obj, boolean defaulVal) {
        boolean val = defaulVal;
        if (obj != null) {
            val = Boolean.parseBoolean(castString(obj));
        }
        return val;
    }
}
