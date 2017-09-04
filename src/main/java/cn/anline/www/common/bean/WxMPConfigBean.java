package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 微信公众平台配置模型
 */
@Entity("wechat_mp_config")
public class WxMPConfigBean extends MorphiaModel<WxMPConfigBean> {
}
