package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 附件模型
 */
@Entity("attachment")
public class AttachmentBean extends MorphiaModel<AttachmentBean> {
}
