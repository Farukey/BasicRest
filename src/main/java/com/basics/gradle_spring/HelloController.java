package com.basics.gradle_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController
{
    @Value("${spring.application.name}")
    private String appName;

    @GetMapping(value = "/welcome/{name}")
    @ResponseBody
    public String getContact(@PathVariable String name)
    {
        return appName;
    }

    @PostMapping(value = "/welcome/{name}")
    public String addContact(@PathVariable String name)
    {
        return name + " is now added to the directory.";
    }

    @DeleteMapping(value = "/welcome/{name}")
    public String deleteContact(@PathVariable String name)
    {
        return name + " is now deleted from the directory.";
    }


}
