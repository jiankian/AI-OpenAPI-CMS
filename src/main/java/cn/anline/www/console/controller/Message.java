package cn.anline.www.console.controller;

import act.controller.Controller;
import org.osgl.mvc.annotation.GetAction;

@Controller
public class Message extends ConsoleBaseController{

    @GetAction({"message","message/index"})
    public void index(){
        tpl(_ThemePath()+"message/index");
    }
}
