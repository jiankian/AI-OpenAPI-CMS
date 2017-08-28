package cn.anline.www.home.controller;

import act.controller.Controller;
import act.inject.DefaultValue;
import org.osgl.mvc.annotation.GetAction;

public class Index {
    @GetAction({"/","/index{a}"})
    public void index(@DefaultValue("安浪科技") String a){
        String _a = a;
        Controller.Util.render("index.html",a);
    }
}
