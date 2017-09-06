package cn.anline.www.common.bean;

import act.storage.Store;
import org.osgl.$;
import org.osgl.storage.ISObject;
import org.osgl.util.C;

import java.util.List;

/**
 * 通用单文件上传模型
 */
//上传配置
@Store("upload:")
public class UploadSingleBean {

    public UploadSingleBean(){

    }

    public UploadSingleBean(ISObject file) {
        this.file = $.notNull(file);
    }

    @Store
    ISObject file;

    public ISObject getFile() {
        return file;
    }

    public void setFile(ISObject file) {
        this.file = file;
    }
    public String getImageUrls() {
        return null == file ? null : file.getUrl();
    }
}
