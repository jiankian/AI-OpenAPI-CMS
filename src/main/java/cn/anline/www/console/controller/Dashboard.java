package cn.anline.www.console.controller;

import act.controller.Controller;
import org.osgl.mvc.annotation.GetAction;

@Controller
public class Dashboard extends ConsoleBaseController {

    @GetAction({"dashboard","bashboard/index"})
    public void index(){
        tpl(_ThemePath()+"dashboard/index");
    }
}
