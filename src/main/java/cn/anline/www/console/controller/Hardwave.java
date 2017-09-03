package cn.anline.www.console.controller;

import act.controller.Controller;
import org.osgl.mvc.annotation.GetAction;

/**
 * 硬件管理
 */
@Controller
public class Hardwave extends ConsoleBaseController{

    @GetAction({"hardwave","hardwave/idnex"})
    public void index(){

    }
}
