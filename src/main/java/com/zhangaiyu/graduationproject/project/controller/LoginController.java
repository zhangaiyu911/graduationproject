package com.zhangaiyu.graduationproject.project.controller;

import com.zhangaiyu.graduationproject.project.entity.UserEntity;
import com.zhangaiyu.graduationproject.project.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/user")
public class LoginController {

    @Autowired
    private UserJPA userJPA;

    @RequestMapping(value = "/login",method = RequestMethod.GET,produces ="text/json;charset=UTF-8")
    public String login(UserEntity user, HttpServletRequest request)
    {

        //登陆成功
        boolean flag = true;
        String result = "登录成功";
        //根据用户名查询用户是否存在
        UserEntity userEntity = userJPA.findOne(new Specification<UserEntity>() {
            @Override
            public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                criteriaQuery.where(criteriaBuilder.equal(root.get("name"),user.getName()));
                return null;
            }
        });
        //用户不存在
        if (userEntity == null){
            result = "用户不存在，登录失败";
        }
        //密码错误
        else if (!userEntity.getPwd().equals(user.getPwd())){
            result = "用户密码不相符，登录失败";
        }
        //登录成功
        if (flag){
            //将用户写入session
            request.getSession().setAttribute("session_user",userEntity);
        }
        return result;
    }
}
