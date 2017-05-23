package org.smart4j.chapter2.service;

import org.smart4j.chapter2.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/23.
 */
public class CustomerService {

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
