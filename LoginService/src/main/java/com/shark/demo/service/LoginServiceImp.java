package com.shark.demo.service;

import com.shark.demo.inter.LoginService;
import org.springframework.util.StringUtils;

/**
 * Created by liuqinghua on 16-8-21.
 */
public class LoginServiceImp implements LoginService {
    public boolean login(String username, String pwd) {
          if("abc".equals(username) && "abc".equals(pwd)){
              return true;
          }
          return false;
    }
}
