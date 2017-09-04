package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 微信小程序模型
 */
@Entity("wechat_wa_config")
public class WxWAConfigBean  extends MorphiaModel<WxWAConfigBean>{
}
