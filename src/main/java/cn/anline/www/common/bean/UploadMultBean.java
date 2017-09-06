package cn.anline.www.common.bean;

import act.storage.Store;
import org.osgl.$;
import org.osgl.storage.ISObject;
import org.osgl.util.C;

import java.util.List;

/**
 * 多文件上传模型
 */
@Store("upload:")
public class UploadMultBean {
    @Store
    private List<ISObject> files;

    public UploadMultBean() {
    }

    public UploadMultBean(List<ISObject> files) {
        this.files = $.notNull(files);
    }

    public List<ISObject> getFiles() {
        return files;
    }

    public void setFiles(List<ISObject> files) {
        this.files = files;
    }
    public List<String> getImageUrls() {
        return C.list(files).map(ISObject::getUrl);
    }
}
