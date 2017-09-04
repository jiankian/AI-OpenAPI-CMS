package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 微信支付模型
 */
@Entity("payment_wechat")
public class PaymentWechatBean extends MorphiaModel<PaymentWechatBean> {
}
