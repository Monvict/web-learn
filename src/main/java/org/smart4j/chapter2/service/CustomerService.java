package org.smart4j.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DataBaseHelper;
import org.smart4j.chapter2.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/23.
 */
public class CustomerService {

    public static final String QUERY_LIST = "select * from customer";

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    /**
     * 获取客户列表
     * @return
     */
    public List<Customer> getCustomerList () throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Customer> customerList = new ArrayList<Customer>();

        try {
            conn = DataBaseHelper.getConn();
            ps = conn.prepareCall(QUERY_LIST);
            rs = ps.executeQuery();

            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getLong("c_id"));
                customer.setName(rs.getString("name"));
                customer.setContact(rs.getString("contact"));
                customer.setEmail(rs.getString("email"));
                customer.setTelePhone("telephone");
                customerList.add(customer);
            }
        } finally {
            DataBaseHelper.close(conn, ps, rs);
        }
        return customerList;
    }

    /**
     * 获取客户列表
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList (String keyword) {
        //TODO
        return null;
    }

    /**
     * 获取单个用户
     * @param id
     * @return
     */
    public Customer getCustomer (long id) {
        //TODO
        return null;
    }

    /**
     * 创建单个用户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer (Map<String, Object> fieldMap) {
        //TODO
        return false;
    }

    /**
     * 更新用户的信息
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer (long id, Map<String, Object> fieldMap) {
        //TODO
        return false;
    }

    /**
     * 删除单个用户
     * @param id
     * @return
     */
    public boolean delteCustomer (long id) {
        //TODO
        return false;
    }

}
