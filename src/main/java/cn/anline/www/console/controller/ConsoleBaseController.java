package cn.anline.www.console.controller;

import act.controller.annotation.UrlContext;
import cn.anline.www.AnnBase;
import org.osgl.mvc.annotation.After;
import org.osgl.mvc.annotation.Before;

/**
 *用户控制台基类控制器
 */
@UrlContext("/console")
public class ConsoleBaseController extends AnnBase{
    /**
     * 每次调用之前执行，检查是否登录
     * 控制台全局构造器
     */
    @Before
    public void _init(){
        context.renderArg("asset",_AssetPath());
    }
    /**
     * 控制台主题资源根路径
     * 判断是否手机版做决策
     * @returnactionContext
     */
    public String _AssetPath(){
        return "/asset/console/";
    }

    /**
     * 用户控制台主体视图文件路径
     * 判断是否手机版做决策
     * @return
     */
    public String _ThemePath(){
        return "/console/";
    }
    @After
    public void _uninit(){
    }
}
