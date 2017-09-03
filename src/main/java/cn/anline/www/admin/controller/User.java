package cn.anline.www.admin.controller;

import act.controller.Controller;
import org.osgl.mvc.annotation.GetAction;

@Controller
public class User extends AdminBaseController {

    @GetAction({"user","user/idnex"})
    public void index(){
        tpl(_ThemePath()+"user/index");
    }
}
