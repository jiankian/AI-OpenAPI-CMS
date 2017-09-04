package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 支付配置模型
 */
@Entity("payment")
public class PaymentBean extends MorphiaModel<PaymentBean> {
}
