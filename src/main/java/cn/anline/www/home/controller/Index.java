package cn.anline.www.home.controller;

import act.inject.DefaultValue;
import cn.anline.www.common.config.Theme;
import org.osgl.mvc.annotation.After;
import org.osgl.mvc.annotation.Before;
import org.osgl.mvc.annotation.GetAction;

import javax.inject.Inject;

public class Index extends HomeBaseController {
    @Inject
    Theme theme;
    @Before
    public void init(){
    }
    @GetAction({"","index","index.{a}"})
    public void index(String a){
        context.renderArg("title","首页");
        tpl(_ThemePath()+"index/index.html");
    }
    @After
    public void uninit(){

    }
}
