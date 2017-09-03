package cn.anline.www.admin.controller;

import act.controller.Controller;
import act.view.RenderAny;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.PostAction;

/**
 * 后台用户登录注销类
 * 此类无需继承Base检查 需要重写，以防不登录的用户连登录界面都没有访问权限
 */
@Controller
public class Auth extends AdminBaseController {

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
    @GetAction("login")
    public void login(){
        tpl(_ThemePath()+"auth/login");
    }

    @PostAction("login")
    public RenderAny login_(String username, String password, String remember){
        return tpl(_ThemePath()+"auth/login__");
    }
    /**
     * 检查是否登录
     * @return
     */
    public static boolean isLogin(){
        return false;
    }

}
