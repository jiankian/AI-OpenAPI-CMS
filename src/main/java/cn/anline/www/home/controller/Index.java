package cn.anline.www.home.controller;

import act.controller.Controller;
import act.inject.DefaultValue;
import cn.anline.www.common.config.Theme;
import org.osgl.mvc.annotation.After;
import org.osgl.mvc.annotation.Before;
import org.osgl.mvc.annotation.GetAction;

import javax.inject.Inject;

public class Index extends Base{
    @Inject
    Theme theme;
    @Before
    public void init(){
        System.out.println("---前台index控制器构造器已经执行---");
    }
    @GetAction({"/","/index{a}"})
    public void index(@DefaultValue("安浪科技") String a){
        System.out.println("--前台index控制器index方法已执行---");
        System.out.println(_ThemePath()+"index/index.html");
        this.tpl(_ThemePath()+"index/index.html");
    }
    @After
    public void uninit(){
        System.out.println("---前台index控制器析构器已执行--");
    }
}
