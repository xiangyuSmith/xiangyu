package com.xiangyu.web.controller.index;

import com.xiangyu.ext.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiangyu on 2016/11/3.
 */
@Controller
@SuppressWarnings("unused")
@RequestMapping("/index")
public class LoginController extends BaseController {

    @RequestMapping
    public String index(){
        return "user/index.html";
    }
}
