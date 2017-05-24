package org.smart4j.chapter2.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/23.
 */
public class CustomerServiceTest {
    private CustomerService customerService;

    public CustomerServiceTest () {

    }

    @Before
    public void init () {
        customerService = new CustomerService();
    }

    @After
    public void destroy() {

    }

    @Test
    public void getCustomerListTest () throws SQLException {
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2, customerList.size());

        for (Customer c : customerList) {
            System.out.println(c.getName());
        }
    }

    @Test
    public void getCustomerTest() {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest () {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "Jack");
        fieldMap.put("contact", "Rose");
        fieldMap.put("telephone", "1234567");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest () {
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("contact", "James");
        boolean result = customerService.updateCustomer(id, fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest () {
        long id = 1;
        boolean result = customerService.delteCustomer(id);
        Assert.assertTrue(result);
    }
}
