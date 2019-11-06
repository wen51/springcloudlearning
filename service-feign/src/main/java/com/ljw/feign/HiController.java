package com.ljw.feign;

import com.ljw.feign.service.SchedualServiceHi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {

    @Resource
    private SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "hi")
    public String hi(@RequestParam String name){
        return schedualServiceHi.sayHiFromOne(name);
    }
}
