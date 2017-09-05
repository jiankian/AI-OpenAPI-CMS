package cn.anline.www.admin.controller;

import act.controller.Controller;
import act.controller.annotation.UrlContext;
import act.db.DbBind;
import act.db.morphia.MorphiaDao;
import cn.anline.www.common.bean.UserBean;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.PostAction;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

/**
 * 用户个人控制器
 */

@UrlContext("user")
@Controller
public class User extends AdminBaseController {


    @GetAction({"","index","profile"})
    public void index(){
        tpl(_ThemePath()+"user/profile");
    }

    @GetAction({"profile-edit","edit"})
    public void edit(){
        tpl(_ThemePath()+"user/profile-edit");
    }

    @PostAction("change-info-{userBean}")
    public void changeInfo(@DbBind @NotNull UserBean userBean,String nickname,String aboutme,String firstname,String lastname){

        userBean.nickname = nickname;
        userBean.aboutme = aboutme;
        userBean.firstname = firstname;
        userBean.lastname = lastname;
        userBeanMorphiaDao.save(userBean);
        successMsg("/admin/user/edit");
    }

}
