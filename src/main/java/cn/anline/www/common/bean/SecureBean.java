package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 安全模型
 */
@Entity("Secure")
public class SecureBean extends MorphiaModel<SecureBean> {
}
