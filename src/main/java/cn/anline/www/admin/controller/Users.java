package cn.anline.www.admin.controller;

import act.controller.Controller;
import act.controller.annotation.UrlContext;
import org.osgl.mvc.annotation.GetAction;

/**
 * 后台管理会员控制器
 */
@UrlContext("users")
@Controller
public class Users extends AdminBaseController {


    @GetAction({"","index"})
    public void index(){
        tpl(_ThemePath()+"users/index");
    }

}
