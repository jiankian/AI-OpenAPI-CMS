package cn.anline.www.admin.controller;

import act.controller.Controller;
import act.db.morphia.MorphiaDao;
import cn.anline.www.common.bean.UserBean;
import org.osgl.mvc.annotation.GetAction;

import javax.inject.Inject;

@Controller
public class User extends AdminBaseController {

    @Inject
    private MorphiaDao<UserBean> userBeanMorphiaDao;
    @GetAction({"user","user/idnex"})
    public void index(){
        tpl(_ThemePath()+"user/index");
    }
}
