package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ANDRE
 * @since 14/10/16
 */
@RestController
public class Testing {

    private static final Logger LOG = LoggerFactory.getLogger(Testing.class);

    @RequestMapping(
            value = "/testA",
            method = RequestMethod.GET)
    public String testA(){
        LOG.info("TEST A ");
        return "A: It works";
    }

    @RequestMapping(
            value = "/testB",
            method = RequestMethod.GET)
    public String testB(){
        LOG.info("TEST B ");
        return "B: It works";
    }

}
