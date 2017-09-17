package cn.anline.www.common.util;

import act.app.ActionContext;
import act.data.SObjectResolver;
import act.storage.StorageServiceManager;
import cn.anline.www.common.bean.AttachmentBean;
import io.ebean.annotation.Transactional;
import org.osgl.storage.ISObject;
import org.osgl.storage.IStorageService;

import java.io.File;
import javax.inject.Inject;

public class Upload {

    public final static String ATTACHMENT_TYPE = "image";

    @Inject
    ActionContext context;

    public void mkDir(File dir) {
        if (dir.getParentFile().exists()){
            dir.mkdir();
        } else {  
            this.mkDir(dir.getParentFile());
            dir.mkdir();
        }  
    }


    @Transactional
    public String getRemoteImgSaveLocal(String remotefile,StorageServiceManager ssMgr){
        ISObject sob = new SObjectResolver().resolve(remotefile);
        sob.setAttribute(ISObject.ATTR_FILE_NAME,remotefile);
        IStorageService ss = ssMgr.storageService("upload");
        sob = ss.put(ss.getKey(),sob);        
        
        String httpfile = sob.getUrl();
        AttachmentBean attachment = new AttachmentBean();
        String mimetype = sob.getAttribute("content-type");
        //获取后缀名
        String ext = null;
        if("image/jpeg".equals(mimetype)){ ext = "jpeg"; }
        if("image/gif".equals(mimetype)){ ext = "gif"; }
        if("image/png".equals(mimetype)){ ext = "png"; }

        //将这些信息保存到数据库啦
        attachment.setFile(httpfile);
        attachment.setType(ATTACHMENT_TYPE);
        attachment.setExt(ext);
        attachment.setFilesize(sob.getLength());
        attachment.setWidth(0L);
        attachment.setHeight(0L);

        return httpfile;
    }


    @Transactional
    public String singleImg(ISObject img, StorageServiceManager ssMgr) {
        String mimetype = img.getAttribute("content-type");
        if("image/jpeg".equals(mimetype) || "image/gif".equals(mimetype) || "image/png".equals(mimetype)){
            IStorageService ss = ssMgr.storageService("upload");
            String key = ss.getKey();
            img.getAttribute(ISObject.ATTR_FILE_NAME);
            img = ss.put(key,img);
            
            String httpfile = img.getUrl();
            AttachmentBean attachment = new AttachmentBean();
            String mimetype1 = img.getAttribute("content-type");
            //获取后缀名
            String ext = null;
            if("image/jpeg".equals(mimetype1)){ ext = "jpeg"; }
            if("image/gif".equals(mimetype1)){ ext = "gif"; }
            if("image/png".equals(mimetype1)){ ext = "png"; }

            //将这些信息保存到数据库啦
            attachment.setFile(httpfile);
            attachment.setType(ATTACHMENT_TYPE);
            attachment.setExt(ext);
            attachment.setFilesize(img.getLength());
            attachment.setWidth(0L);
            attachment.setHeight(0L);
            return httpfile;
        }else{
            return "";
        }
    }

    public String multipleImg(File imgs){
        return "";
    }
}