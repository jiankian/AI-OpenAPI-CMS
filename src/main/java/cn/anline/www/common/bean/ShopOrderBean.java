package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 订单模型
 */
@Entity("shop_order")
public class ShopOrderBean extends MorphiaModel<ShopOrderBean> {
}
