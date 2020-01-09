package com.sys.system.controller;

import com.sys.system.api.CommonResult;
import com.sys.system.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.LongToIntFunction;

/**
 * @author ：lijie
 * @date ：Created in 2019/12/26 15:56
 */
@RestController
public class PageController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonResult login(User user){
        if (user.getUsername().equals("admin") && user.getPassword().equals("111111")){
            return CommonResult.success("admin");
        }else {
            return CommonResult.validateFailed();
        }
    }
}
