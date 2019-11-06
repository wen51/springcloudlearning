package com.ljw.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = SchedualServiceHiError.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHiFromOne(@RequestParam String name);
}
