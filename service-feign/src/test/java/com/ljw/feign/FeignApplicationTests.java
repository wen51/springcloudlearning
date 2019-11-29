package com.ljw.feign;

import com.google.common.base.Splitter;
import com.google.common.collect.Maps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FeignApplicationTests {

    @Test
    public void contextLoads() {
        Optional<String> fsf = Optional.of("fsf");
        System.out.println(fsf.isPresent());
        System.out.println(fsf.get());
        System.out.println(fsf);
    }

    @Test
    public void testGuava() {
        String s = "1,2,3,4,5";
        List<String> list = Splitter.on(',').splitToList(s);
        System.out.println(list);

        HashMap<Object, Object> objectObjectHashMap = Maps.newHashMap();
    }

}
