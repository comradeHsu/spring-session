package com.session.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/27.
 */
@RestController
public class IndexController {

    @RequestMapping("/route/2")
    public Map<String,Object> index(HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        HttpSession session = request.getSession();
        map.put("msg",session.getAttribute("msg"));
        return map;
    }
}
