package cn.anline.www.admin.controller;

import act.controller.Controller;
import act.controller.annotation.UrlContext;
import act.db.DbBind;
import act.db.morphia.MorphiaDao;
import act.storage.StorageServiceManager;
import act.storage.Store;
import cn.anline.www.common.bean.UploadSingleBean;
import cn.anline.www.common.bean.UserBean;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.PostAction;
import org.osgl.storage.ISObject;
import org.osgl.storage.IStorageService;
import org.osgl.storage.impl.SObject;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.io.File;

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
    public void changeInfo(@DbBind @NotNull UserBean userBean,String nickname,String aboutme,String firstname,String lastname,String occupation){

        userBean.nickname = nickname;
        userBean.aboutme = aboutme;
        userBean.firstname = firstname;
        userBean.lastname = lastname;
        userBean.occupation = occupation;
        userBeanMorphiaDao.save(userBean);
        successMsg("/admin/user/edit");
    }

    @PostAction("change-avatar-{userBean}")
    public void changeAvatar(@DbBind @NotNull UserBean userBean, File avatar){
        if (null == avatar){
            failMsg("/admin/user/edit");
        }
        ISObject isObject = SObject.of(avatar);
        IStorageService ss = ssMgr.storageService("upload");
        String key = ss.getKey();
        isObject.getAttribute(ISObject.ATTR_FILE_NAME);
        isObject = ss.put(key,isObject);
        userBean.setAvatar(isObject.getUrl());
        userBeanMorphiaDao.save(userBean);
        successMsg("/admin/user/edit");
    }
}
