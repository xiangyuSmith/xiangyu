package com.xiangyu.web.controller.test;

import com.xiangyu.ext.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiangyu on 2016/11/4.
 */
@SuppressWarnings("unused")
@Controller
@RequestMapping("/test")
public class testController extends BaseController {

    @RequestMapping
    public String index(){
        return "test/test.html";
    }

}
