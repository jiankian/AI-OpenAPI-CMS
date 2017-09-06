package cn.anline.www.common.bean;

import act.db.morphia.MorphiaDao;
import org.mongodb.morphia.annotations.Entity;

/**
 * 附件管理模型
 */
@Entity("attachment")
public final class AttachmentBean extends MorphiaDao<AttachmentBean>{

    private String file;
    private String type;
    private String ext;
    private Long filesize;
    private Long width;
    private Long height;

    public AttachmentBean(String file, String type, String ext, Long filesize, Long width, Long height) {
        this.file = file;
        this.type = type;
        this.ext = ext;
        this.filesize = filesize;
        this.width = width;
        this.height = height;
    }

    public AttachmentBean() {
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public Long getFilesize() {
        return filesize;
    }

    public void setFilesize(Long filesize) {
        this.filesize = filesize;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }
}