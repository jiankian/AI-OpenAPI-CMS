package cn.anline.www.console.controller;

import act.controller.annotation.UrlContext;
import cn.anline.www.common.util.JWT;
import cn.anline.www.console.bean.UserTest;
import com.alibaba.fastjson.JSONPObject;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.PostAction;

@UrlContext("user")
public class User extends ConsoleBaseController {

    @GetAction({"index",""})
    public void index(){
        tpl(_ThemePath()+"user/index");
    }

    @PostAction("login")
    public JSONPObject login(String username,String password){
        System.out.println("用户名");
        System.out.println(username);
        System.out.println("密码");
        System.out.println(password);
        JSONPObject jsonpObject = new JSONPObject();
        UserTest userTest = new UserTest();
        userTest.setUsername(username);
        userTest.setPassword(password);
        String token = JWT.sign(userTest,30L * 24L * 3600L * 1000L);
        System.out.println("token");
        System.out.println(token);
        jsonpObject.addParameter(userTest);
        return jsonpObject;
    }

    @GetAction("verify")
    public void verify(){
        tpl(_ThemePath()+"user/verify");
    }

    @PostAction("token")
    public JSONPObject token(String token){
        System.out.println("TOKEN为");
        System.out.println(token);

        UserTest userTest = JWT.unsign(token,UserTest.class);

        System.out.println("token解密");
        System.out.println(userTest);
        System.out.println(userTest.getUsername());
        System.out.println(userTest.getPassword());

        JSONPObject jsonpObject = new JSONPObject();

        jsonpObject.addParameter(userTest);
        return jsonpObject;
    }
}
