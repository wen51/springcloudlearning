package com.ljw.ribbon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {

    @Resource
    private HelloSerivce helloSerivce;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloSerivce.hiService(name);
    }
}
