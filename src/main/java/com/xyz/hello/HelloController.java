package com.xyz.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class HelloController {

    @RequestMapping("/hello/hi")
    @ApiOperation(value = "/hello/hi", notes = "it greets.", response = String.class)
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
