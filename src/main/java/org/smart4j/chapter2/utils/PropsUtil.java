package org.smart4j.chapter2.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2017/5/24.
 */
public class PropsUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    public static Properties loadProps (String fileName) {
        Properties propers = null;
        InputStream in = null;

        try {
            in = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);

            if (in == null) {
                throw new FileNotFoundException("The file can't find :" + fileName);
            }

            propers = new Properties();
            propers.load(in);
        } catch (Exception e) {
            LOGGER.warn("Load properties failed.", e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    LOGGER.warn("Close file failed", e);
                }
            }
        }

        return  propers;
    }

    public static String getString (Properties properties, String key) {
        return getString(properties, key, "");
    }

    public static String getString (Properties properties, String key, String defaultVale) {
        String val = defaultVale;
        if (properties.containsKey(key)) {
            val = properties.getProperty(key);
        }
        return val;
    }

    public static int getInt (Properties properties, String key) {
        return getInt(properties, key, 0);
    }

    public static int getInt (Properties properties, String key, int defaultVale) {
        int val = defaultVale;
        if (properties.containsKey(key)) {
            val = CastUtil.castInt(properties.getProperty(key));
        }
        return val;
    }

    public static boolean getBoolean (Properties properties, String key) {
        return getBoolean(properties, key, false);
    }

    public static boolean getBoolean (Properties properties, String key, boolean defaultVale) {
        boolean val = defaultVale;
        if (properties.containsKey(key)) {
            val = CastUtil.castBoolean(properties.getProperty(key));
        }
        return val;
    }
}
