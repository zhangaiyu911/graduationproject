package com.zhangaiyu.graduationproject.project.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class PropertiesUtil {
    private final ResourceBundle resource;
    private final String fileName;

    /**
     * 构造函数实例化部分对象，获取文件资源对象
     * @param fileName
     */
    public PropertiesUtil(String fileName) {
        Locale locale = new Locale("zh","CN");
        this.fileName = fileName;
        this.resource = ResourceBundle.getBundle(this.fileName,locale);
    }

    public String getValue(String key){

        String message = this.resource.getString(key);
        return message;
    }

}
