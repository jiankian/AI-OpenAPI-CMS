package cn.anline.www.admin.controller;

import act.controller.Controller;
import act.controller.annotation.UrlContext;
import act.db.morphia.MorphiaDao;
import cn.anline.www.common.bean.UserBean;
import cn.anline.www.common.util.Md5;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.PostAction;

import javax.inject.Inject;

/**
 * 后台用户登录注销类
 * 此类无需继承Base检查 需要重写，以防不登录的用户连登录界面都没有访问权限
 */
@UrlContext("auth")
@Controller
public class Auth extends AdminBaseController {

    @Override
    public void _init() {
//        super._init();
        context.renderArg("asset",_AssetPath());
    }

    @Override
    public void _uninit() {
//        super._uninit();
    }

    /**
     * 后台登录页面
     */
    @GetAction("signin")
    public void signin(){
//        第一次创建一个默认用户
//        UserBean userBean = new UserBean("jiankian",Md5.gen("jiankian888"),"/upload/avatar.png","绿血贵族","正安","罗","专注技术20年","中国","1995-03-20","i@anline.cn","13529513104","http://www.anline.cn","CAO","0878-8970223","云南安浪科技有限公司","");
//        userBeanMorphiaDao.save(userBean);
        tpl(_ThemePath()+"auth/signin");
    }

    @PostAction("signin")
    public void login(String username, String password, String remember){
        UserBean user = userBeanMorphiaDao.findOneBy("username",username.trim());
        if (null == user){
            failMsg("/admin/auth/signin","登录失败！","请输入帐号后再重新登录",3000,false);
        }
//        System.out.println("输入的MD5:"+Md5.gen(password.trim()));
//        System.out.println("登录用户查询结果：");
//        System.out.println(user.toString());
        if (user.password.equals(Md5.gen(password.trim()))){
            session.put("admin_username",user.getUsername());
            session.put("admin_id",user.getId());
            successMsg("/admin/index","登录成功","欢迎登录，正在为您打开后台首页",3000,false);
        }
         failMsg("/admin/auth/signin","登录失败","请输入正确的超级管理员帐号和密码",3000,false);
    }

    @GetAction("signout")
    public void signout(){
        session.remove("admin_username");
        session.remove("admin_id");
        successMsg("/admin/auth/signin");
    }

}
