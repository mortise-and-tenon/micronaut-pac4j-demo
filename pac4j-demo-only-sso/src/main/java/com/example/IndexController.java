package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * @author dev2007
 * @date 2023/3/3
 */
@Controller("/")
public class IndexController {

    @Get
    public String index() {
        return "index";
    }
}
