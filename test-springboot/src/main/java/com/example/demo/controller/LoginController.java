package com.example.demo.controller;

import com.example.demo.result.Result;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

/**
 * @author 猫猫
 */
@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping("/register")
    @ResponseBody
    public Result register(@RequestBody User user){
        String username = user.getUsername();
        //转义后替换掉原来的
        username = HtmlUtils.htmlEscape(username);
        user.setUsername(username);

        String password = user.getPassword();

        boolean isExist = userService.isExist(username);
        if (isExist){
            return new Result(400);
        }
        /*
        对用户密码进行安全处理
        String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        int times = 2;
        String algorithm = "md5";
        String pwdAfterHash = new SimpleHash(algorithm,password,salt,times).toString();
        user.setSalt(salt);
        user.setPassword(pwdAfterHash);
         */
        userService.add(user);
        return new Result(200);
    }

    @CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        //对html标签进行转义，防止XSS攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.get(username, requestUser.getPassword());
            if(user == null) {
                return new Result(400);
            }
            else {
                return new Result(200);
            }
    }
}
