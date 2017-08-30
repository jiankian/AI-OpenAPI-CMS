package cn.anline.www.common.config;

import org.osgl.util.Str;
import org.osgl.web.util.UserAgent;

import javax.inject.Inject;

public class Theme {

//    在前台Base构造器注入使用
//    在后台Base构造器注入使用
    @Inject
    public UserAgent userAgent;

    /**
     * 获取前台主题名称
     * @return
     */
    public String getThemePath(){
        return "";
    }

    /**
     * 获取前台资源路径
     * @return
     */
    public String getAssetPath(){
        return "";
    }

    /**
     * 获取前台手机主题路径
     * @return
     */
    public String getMobileThemePath(){
        return "";
    }

    /**
     * 获取前台手机版资源路径
     * @return
     */
    public String getMobileAssetPath(){
        return "";
    }

    /**
     * 获取后台主题路径
     * @return
     */
    public String getAdminThemePath(){
        return "";
    }

    /**
     * 获取后台资源文件路径
     * @return
     */
    public String getAdminAssetPath(){
        return "";
    }
}
