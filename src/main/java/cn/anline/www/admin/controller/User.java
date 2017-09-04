package cn.anline.www.admin.controller;

import act.controller.Controller;
import act.db.morphia.MorphiaDao;
import cn.anline.www.common.bean.UserBean;
import org.osgl.mvc.annotation.GetAction;

import javax.inject.Inject;
import java.util.Date;
import java.util.UUID;

@Controller
public class User extends AdminBaseController {

    @Inject
    private MorphiaDao<UserBean> userDao;

    @GetAction({"user","user/idnex"})
    public void index(){
        tpl(_ThemePath()+"user/index");
    }
}
