package com.zhangaiyu.graduationproject.project.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhangaiyu.graduationproject.project.utils.LoggerUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/index")
public class IndexController {

    /**
     * 初始化登录界面
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public JSONObject login(HttpServletRequest request,String name) throws Exception{

        JSONObject obj = new JSONObject();
        obj.put("msg","用户:"+name+",登录成功。");
        //将返回值写入到请求对象中
        request.setAttribute(LoggerUtils.LOGGER_RETURN,obj);
        return obj;

    }

}
