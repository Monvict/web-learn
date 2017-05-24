package org.smart4j.chapter2.test;

import org.junit.Test;
import org.smart4j.chapter2.utils.PropsUtil;

import java.util.Properties;

/**
 * 测试PropsUtil的功能
 * Created by Administrator on 2017/5/24.
 */
public class PropsUtilTest {

    @Test
    public void testLoad () {
        Properties properties = PropsUtil.loadProps("config.properties");
        System.out.println(properties.getProperty("jdbc.driver"));
    }
}
