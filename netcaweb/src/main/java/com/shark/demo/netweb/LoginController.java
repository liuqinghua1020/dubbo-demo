package com.shark.demo.netweb;

import com.shark.demo.inter.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuqinghua on 16-8-23.
 */

@Controller
public class LoginController {

    @Autowired
    @Qualifier("loginService")
    private LoginService loginService;

    //返回登陆首页
    @RequestMapping(value="index.action", method = {RequestMethod.GET})
    public String index(){
        return "login";
    }

    @RequestMapping(value="login.action", method = {RequestMethod.POST})
    @ResponseBody
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password){
        boolean result = loginService.login(username, password);
        String msg = result?"login success":"login fail";
        return msg;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public LoginService getLoginService() {
        return loginService;
    }
}
