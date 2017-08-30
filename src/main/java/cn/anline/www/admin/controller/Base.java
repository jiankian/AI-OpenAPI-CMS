package cn.anline.www.admin.controller;

import act.controller.annotation.UrlContext;
import cn.anline.www.AnnBase;
import org.osgl.mvc.annotation.After;
import org.osgl.mvc.annotation.Before;

/**
 * 后台基类，主要进行会员身份检查等
 */
@UrlContext("/admin")
public class Base extends AnnBase {
    /**
     * 每次调用之前执行，检查是否登录
     * 后台全局构造器
     */
    @Before
    public void _init(){
        System.out.println("---后台全局构造器已执行---");
    }

    @After
    public void _uninit(){
        System.out.println("---后台全局析构器已执行---");
    }
}
