package com.soetek.demo.controller;

import com.soetek.demo.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    CustomerService customerService;
    @GetMapping("/customer/count")
    public long getCount() {
        return customerService.getCount();
    }

}
