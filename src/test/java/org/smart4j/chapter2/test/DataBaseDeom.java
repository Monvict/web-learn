package org.smart4j.chapter2.test;

import org.junit.Test;

import java.sql.*;

/**
 * 测试JDBC连接Oracle数据库
 * Created by Administrator on 2017/5/24.
 */
public class DataBaseDeom {

    private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@192.168.0.51:1521:oradb";
    private String userName = "tonymn";
    private String passwd = "123456";
    private String sql = "select * from com_day_stat where pk_ds_stat_type = '13291'";

    @Test
    public void testConnect () throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, userName, passwd);
            ps = conn.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("pk_ds_stat_type") + "==" + rs.getInt("ds_num"));
            }
        } catch (Exception e) {

        } finally {
            conn.close();
            ps.close();
            rs.close();
        }
    }
}
