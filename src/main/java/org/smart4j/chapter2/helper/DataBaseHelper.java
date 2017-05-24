package org.smart4j.chapter2.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.utils.PropsUtil;

import java.sql.*;
import java.util.Properties;

/**
 * Created by Administrator on 2017/5/24.
 */
public class DataBaseHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataBaseHelper.class);

    private static final String DRIVER;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWD;

    static {
        Properties conf = PropsUtil.loadProps("config.properties");
        DRIVER = conf.getProperty("jdbc.driver");
        URL = conf.getProperty("jdbc.url");
        USERNAME = conf.getProperty("jdbc.username");
        PASSWD = conf.getProperty("jdbc.password");

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            LOGGER.warn("load driver class failed.", e);
        }
    }

    /**
     * 获取连接
     * @return
     */
    public static Connection getConn () {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWD);
        } catch (Exception e) {
            LOGGER.warn("Get connection failed", e);
        }
        return conn;
    }

    /**
     * 关闭资源
     * @param conn
     * @param ps
     * @param rs
     */
    public static void close (Connection conn, PreparedStatement ps, ResultSet rs) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                LOGGER.warn("A Exception happend,wher close Connection,", e);
            }
        }

        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                LOGGER.warn("A Exception happend,wher close PreparedStatement,", e);
            }
        }

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                LOGGER.warn("A Exception happend,wher close ResultSet,", e);
            }
        }
    }
}
