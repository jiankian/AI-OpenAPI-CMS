package cn.anline.www.admin.controller;

import act.app.ActionContext;
import act.controller.annotation.UrlContext;
import act.db.morphia.MorphiaDao;
import cn.anline.www.AnnBase;
import cn.anline.www.common.bean.UserBean;
import cn.anline.www.common.util.Md5;
import org.osgl.mvc.annotation.After;
import org.osgl.mvc.annotation.Before;

import javax.inject.Inject;

/**
 * 后台基类，主要进行会员身份检查等
 */
@UrlContext("/admin")
public class AdminBaseController extends AnnBase {
    @Inject
    MorphiaDao<UserBean> userBeanMorphiaDao;
    /**
     * 每次调用之前执行，检查是否登录
     * 后台全局构造器
     */
    @Before
    public void _init(){
        context.renderArg("asset",_AssetPath());
        if (null == session.get("admin_username") || null == session.get("admin_id")){
//            创建一个默认用户
            //todo

            failMsg("/admin/auth/signin","尚未登录","需要登录帐号才能进入后台管理系统",2000,true);
        }else {
            UserBean user = userBeanMorphiaDao.findOneBy("username",session.get("admin_username"));
            context.renderArg("user",user);
        }
    }
    /**
     * 后台主题资源根路径
     * 判断是否手机版做决策
     * @returnactionContext
     */
    public String _AssetPath(){
        return "/asset/admin/";
    }

    /**
     * 后台主体视图文件路径
     * 判断是否手机版做决策
     * @return
     */
    public String _ThemePath(){
        return "/admin/";
    }
    @After
    public void _uninit(){
    }
}
