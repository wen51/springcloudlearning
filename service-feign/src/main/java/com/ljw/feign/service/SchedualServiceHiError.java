package com.ljw.feign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiError implements SchedualServiceHi {
    @Override
    public String sayHiFromOne(String name) {
        return "sorry feign " + name;
    }
}
