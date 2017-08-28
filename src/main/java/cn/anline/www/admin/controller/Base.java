package cn.anline.www.admin.controller;

import act.controller.annotation.UrlContext;
import org.osgl.mvc.annotation.Before;

/**
 * 后台基类，主要进行会员身份检查等
 */
@UrlContext("/admin")
public class Base {
    /**
     * 每次调用之前执行，检查是否登录
     */
    @Before
    public void _init(){

    }
}
