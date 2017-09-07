package cn.anline.www.home.controller;

import act.app.ActionContext;
import act.controller.annotation.UrlContext;
import cn.anline.www.AnnBase;
import org.osgl.mvc.annotation.After;
import org.osgl.mvc.annotation.Before;

import javax.inject.Inject;

/**
 * 前台总基类
 */
@UrlContext("/")
public class HomeBaseController extends AnnBase {

    @Inject
    ActionContext actionContext;
    /**
     * 前台全局构造器
     * 框架构造器
     */
    @Before
    public void _init(){
        actionContext.renderArg("asset",_AssetPath());
        actionContext.resp().addHeader("Hacking","AnnSecure");
    }

    /**
     * 前台主题资源根路径
     * 判断是否手机版做决策
     * @return
     */
    public String _AssetPath(){
        return "/asset/home/star/";
    }

    /**
     * 前台主体视图文件路径
     * 判断是否手机版做决策
     * @return
     */
    public String _ThemePath(){
        return "/skins/star/";
    }
    /**
     * 前台全局析构器
     * 框架析构器
     */
    @After
    public void _uninit(){
    }
}
