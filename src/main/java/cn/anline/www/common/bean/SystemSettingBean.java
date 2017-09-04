package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 系统配置模型
 */
@Entity("system_setting")
public class SystemSettingBean extends MorphiaModel<SystemSettingBean> {
}
