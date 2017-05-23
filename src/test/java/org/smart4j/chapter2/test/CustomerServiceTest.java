package org.smart4j.chapter2.test;

import org.junit.After;
import org.junit.Before;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

import java.util.List;

/**
 * Created by Administrator on 2017/5/23.
 */
public class CustomerServiceTest {
    private CustomerService customerService;

    public CustomerServiceTest () {
        customerService = new CustomerService();
    }

    @Before
    public void init () {

    }

    @After
    public void destroy() {

    }

    public void getCustomerListTest () {
        String id = "www";
        List<Customer> customerList = customerService.getCustomerList(id);
    }
}
