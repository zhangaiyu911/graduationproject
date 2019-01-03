package com.zhangaiyu.graduationproject;

import com.zhangaiyu.graduationproject.project.MailContentTypeEnum;
import com.zhangaiyu.graduationproject.project.sender.MailSender;

import java.util.ArrayList;

public class TestMail {
    public static void main(String[] args)throws Exception{
        new MailSender()
                .title("测试springboot发送邮件")
                .content("简单文本内容发送")
                .contentType(MailContentTypeEnum.TEXT)
                .targets(new ArrayList<String>(){
                    {
                        add("zhangaiyu911@163.com");
                    }
                })
                .send();
    }
}
