package com.ljw.feign;

import com.alibaba.fastjson.JSONObject;
import com.ljw.feign.service.SchedualServiceHi;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class HiController {

    @Resource private SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "hi")
    public String hi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromOne(name);
    }

    public static void main(String[] args) {
        //        smsTemp();
        System.out.println(String.format("%0" + 10 + "d", 55));
        System.out.println(String.format("%010d", 55));
        System.out.println(String.format("%0" + 10 + "d", 55).length());
    }

    private static void smsTemp() {
        String s = "士大夫{{code}}对方是否，人口从{{message}}俄罗{{aA}}斯怕";
//        String waitSetJsonStr = "{\"code\":5163187,\"message\":\"某个\"}";
        String waitSetJsonStr = "";
        String defaultStr = "{\"code\":\"123456\",\"message\":\"22\",\"aA\":\"ddd\"}";
        String reg = "\\{\\{[a-zA-Z]+}}";
        String reg2 = "\\{\\{.*?}}";

        if (matchCount(s, reg) != matchCount(s, reg2)) {
            System.out.println("格式不正确");
        }

        JSONObject waitSetJSON = JSONObject.parseObject(waitSetJsonStr);
        JSONObject defaultJSON = JSONObject.parseObject(defaultStr);
        List<String> matchStrs = listMatches(s, reg);
        StringBuilder replaceStr = new StringBuilder();
        for (String sm : matchStrs) {
            String m = sm.replaceAll("\\{\\{", "").replaceAll("}}", "");

            Object o = null;
            if (null != waitSetJSON) {
                o = waitSetJSON.get(m);
            }
            if (null == o) {
                replaceStr.append(defaultJSON.get(m));
            } else {
                replaceStr.append(o);
            }
            s = s.replaceAll("\\{\\{" + m + "}}", replaceStr.toString());
            replaceStr.setLength(0);
        }
        System.out.println(s);
    }

    private static int matchCount(String s, String reg) {
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(s);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    private static List<String> listMatches(String s, String reg) {
        List<String> strList = new ArrayList<>();
        if (StringUtils.isNotBlank(s)) {
            Pattern pattern = Pattern.compile(reg);
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                strList.add(matcher.group());
            }
        }
        return strList;
    }
}
