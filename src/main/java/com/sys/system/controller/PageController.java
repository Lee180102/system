package com.sys.system.controller;

import com.sys.system.vo.CommonResult;
import com.sys.system.pojo.User;
import com.sys.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：lijie
 * @date ：Created in 2019/12/26 15:56
 */
@RestController
public class PageController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonResult login(@RequestBody User user){

        User userDB = userService.findUser(user);

        if (userDB != null){
            return CommonResult.success("admin");
        }else {
            return CommonResult.validateFailed();
        }
    }

}
