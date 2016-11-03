package com.xiangyu.ext.base;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xiangyu on 2016/11/3.
 */
public class BaseController {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected Logger log = Logger.getLogger(getClass());

}
