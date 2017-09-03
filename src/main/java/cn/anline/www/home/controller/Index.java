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
    @GetAction("/")
    public void index(){
        tpl(_ThemePath()+"index/index.html");
    }
    @After
    public void uninit(){

    }
}
