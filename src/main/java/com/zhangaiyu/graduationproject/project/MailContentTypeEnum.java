package com.zhangaiyu.graduationproject.project;

public enum MailContentTypeEnum {
    HTML("text/html;charset=UTF-8"),
    TEXT("text");
    private String value;

    MailContentTypeEnum(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }




}
