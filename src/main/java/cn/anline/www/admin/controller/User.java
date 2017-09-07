package cn.anline.www.admin.controller;

import act.controller.Controller;
import act.controller.annotation.UrlContext;
import act.db.DbBind;
import act.db.morphia.MorphiaDao;
import act.storage.StorageServiceManager;
import act.storage.Store;
import cn.anline.www.common.bean.UploadSingleBean;
import cn.anline.www.common.bean.UserBean;
import cn.anline.www.common.util.Md5;
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
        successMsg("/admin/user/edit","个人信息修改成功","个人信息修改成功",3000,false);
    }

    @PostAction("change-avatar-{userBean}")
    public void changeAvatar(@DbBind @NotNull UserBean userBean, File avatar){
        if (null == avatar){
            failMsg("/admin/user/edit","头像修改失败","未获取到上传的文件，请尝试重新上传",3000,false);
        }
        ISObject isObject = SObject.of(avatar);
        IStorageService ss = ssMgr.storageService("upload");
        String key = ss.getKey();
        isObject.getAttribute(ISObject.ATTR_FILE_NAME);
        isObject = ss.put(key,isObject);
        userBean.setAvatar(isObject.getUrl());
        userBeanMorphiaDao.save(userBean);
        successMsg("/admin/user/edit","头像修改成功","头像已经修改成功,如果修改未生效请尝试刷新页面或重新修改",3000,false);
    }
    @PostAction("change-password-{userBean}")
    public void changePassword(@DbBind @NotNull UserBean userBean, String password,String newpassword,String newpassword1){
        if (null == password|| null == newpassword || null == newpassword1){
            failMsg("/admin/user/edit","请输入完整的密码信息","请把旧密码，新密码，新密码验证全部输入正确",3000,false);
        }else if (!userBean.getPassword().equals(Md5.gen(password.trim()))){
            failMsg("/admin/user/edit","旧密码输入错误","请输入正确的旧密码",3000,false);
        }else if (!newpassword.trim().equals(newpassword1.trim())){
            failMsg("/admin/user/edit","两次输入密码不相同","两次输入的新密码不相同，请核对输入的新密码",3000,false);
        }else {
            userBean.setPassword(Md5.gen(newpassword.trim()));
            userBeanMorphiaDao.save(userBean);
        }
        successMsg("/admin/user/edit","密码修改成功","密码修改成功，下次登录请使用新密码",3000,false);
    }
}
