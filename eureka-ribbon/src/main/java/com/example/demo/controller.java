package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by ggg on 2018/8/6.
 */
@RestController
public class controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hii/{id}")
    public String findById(@PathVariable String id) {
        return this.restTemplate.getForObject("http://SERVICE-HI/hi/"+id, String.class);
    }

}
