package cn.anline.www.home.controller;

import cn.anline.www.AnnBase;
import org.osgl.mvc.annotation.After;
import org.osgl.mvc.annotation.Before;

/**
 * 前台总基类
 */
public class Base extends AnnBase {

    /**
     * 前台全局构造器
     * 框架构造器
     */
    @Before
    public void _init(){
        System.out.println("---前台全局构造器已执行---");
    }

    /**
     * 前台全局析构器
     * 框架析构器
     */
    @After
    public void _uninit(){
        System.out.println("---前台全局析构器已执行---");
    }
}
