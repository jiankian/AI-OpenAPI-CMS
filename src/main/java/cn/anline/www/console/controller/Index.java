package cn.anline.www.console.controller;

import act.controller.Controller;
import org.osgl.mvc.annotation.GetAction;

@Controller
public class Index extends ConsoleBaseController{
    @GetAction({"","index","index/index"})
    public void index(){
        tpl(_ThemePath()+"index/index");
    }
}
