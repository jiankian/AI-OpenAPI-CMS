package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 商城商品模型
 */
@Entity("shop_goods")
public class ShopGoodsBean extends MorphiaModel<ShopGoodsBean> {
}
