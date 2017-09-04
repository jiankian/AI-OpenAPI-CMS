package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 邮件模型
 */
@Entity("mail")
public class MailBean extends MorphiaModel<MailBean> {
}
