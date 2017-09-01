package cn.anline.www.admin.controller;

import act.app.ActionContext;
import act.controller.Controller;
import act.controller.annotation.UrlContext;
import act.view.RenderAny;
import cn.anline.www.AnnBase;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.PostAction;

import javax.inject.Inject;

/**
 * 后台用户登录注销类
 * 此类无需继承Base检查 需要重写，以防不登录的用户连登录界面都没有访问权限
 */
@Controller
public class Auth extends Base {

    @Override
    public void _init() {
//        super._init();
        context.renderArg("asset",_AssetPath());
    }

    @Override
    public void _uninit() {
//        super._uninit();
    }

    /**
     * 后台登录页面
     */
    @GetAction("login{a}")
    public void login(){
        this.tpl(_ThemePath()+"auth/login");
    }

    @PostAction("login{a}")
    public RenderAny login_(String username, String password, String remember){
        return this.tpl(_ThemePath()+"auth/login__");
    }
    /**
     * 检查是否登录
     * @return
     */
    public static boolean isLogin(){
        return false;
    }

}
