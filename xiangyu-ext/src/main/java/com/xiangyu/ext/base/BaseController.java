package com.xiangyu.ext.base;

import org.apache.log4j.Logger;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xiangyu on 2016/11/3.
 */
public class BaseController {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected ModelMap model;
    protected Logger logger = Logger.getLogger(getClass());

    /**
     * spring 中request、response是线程安全的，可以直接注入
     *
     * @param request
     * @param response
     * @ModelAttribute注解只有在被
     * @Controller和@ControllerAdvice两个注解的类下使用 ModelAttribute的作用
     * 1)放置在方法的形参上： 表示引用Model中的数据
     * 2)放置在方法上面：表示请求该类的每个Action前都会首先执行它也可以将一些准备数据的操作放置在该方法里面。
     */
    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    public void setAttr(String str1,Object obj){
        this.model.addAttribute(str1,obj);
    }
}
