package com.xiangyu.web.controller.user;

import com.xiangyu.ext.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiangyu on 2016/11/3.
 */

@Controller
@SuppressWarnings("unused")
@RequestMapping("/{userName}")
public class UserController extends BaseController {

    @RequestMapping
    public String index( @PathVariable String userName){
        //动态加载当前登录者
        return "user/index.html";
    }
}
