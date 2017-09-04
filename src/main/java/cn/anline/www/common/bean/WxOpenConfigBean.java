package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 微信开放平台配置模型
 */
@Entity("wechat_open_cnfig")
public class WxOpenConfigBean extends MorphiaModel<WxOpenConfigBean> {
}
