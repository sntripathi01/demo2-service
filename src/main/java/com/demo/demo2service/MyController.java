package com.demo.demo2service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/demo2")
    public Response demo2() {

        Response response = new Response();
        response.setMessage("demo2-> Hi");
        System.out.println("response.getMessage() = " + response.getMessage());
        return response;

    }
}
