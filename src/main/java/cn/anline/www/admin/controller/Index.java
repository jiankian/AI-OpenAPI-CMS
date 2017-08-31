package cn.anline.www.admin.controller;

import act.controller.Controller;
import org.osgl.mvc.annotation.GetAction;

/**
 * 后台主页控制器
 */
@Controller
public class Index extends Base{

    /**
     * 后台主界面
     */
    @GetAction({"","index","index/index"})
    public void index(){
        this.tpl(_ThemePath()+"index/index.html");
    }
}
