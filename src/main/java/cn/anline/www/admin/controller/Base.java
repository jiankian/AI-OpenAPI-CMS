package cn.anline.www.admin.controller;

import act.app.ActionContext;
import act.controller.annotation.UrlContext;
import cn.anline.www.AnnBase;
import org.osgl.mvc.annotation.After;
import org.osgl.mvc.annotation.Before;

import javax.inject.Inject;

/**
 * 后台基类，主要进行会员身份检查等
 */
@UrlContext("/admin")
public class Base extends AnnBase {
    @Inject
    public ActionContext actionContext;
    /**
     * 每次调用之前执行，检查是否登录
     * 后台全局构造器
     */
    @Before
    public void _init(){
        System.out.println("---后台全局构造器已执行---");
        actionContext.renderArg("asset",_AssetPath());

    }
    /**
     * 后台主题资源根路径
     * 判断是否手机版做决策
     * @return
     */
    public String _AssetPath(){
        return "/asset/admin/";
    }

    /**
     * 后台主体视图文件路径
     * 判断是否手机版做决策
     * @return
     */
    public String _ThemePath(){
        return "/admin/";
    }
    @After
    public void _uninit(){
        System.out.println("---后台全局析构器已执行---");
    }
}
