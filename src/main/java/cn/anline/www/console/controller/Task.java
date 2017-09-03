package cn.anline.www.console.controller;

import act.controller.Controller;
import org.osgl.mvc.annotation.GetAction;

/**
 * 任务执行
 */
@Controller
public class Task extends ConsoleBaseController {
    @GetAction({"task","task/index"})
    public void index(){
        tpl(_ThemePath()+"task/index");
    }
}
