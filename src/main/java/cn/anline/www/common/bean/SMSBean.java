package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 短信模型
 */
@Entity("sms")
public class SMSBean extends MorphiaModel<SMSBean> {
}
