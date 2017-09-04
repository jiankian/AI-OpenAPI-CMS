package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 商城商品品牌模型
 */
@Entity("shop_brand")
public class ShopBrandBean extends MorphiaModel<ShopBrandBean> {
}
