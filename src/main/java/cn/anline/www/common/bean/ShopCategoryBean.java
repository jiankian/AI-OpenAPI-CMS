package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 商城商品分类模型
 */
@Entity("shop_category")
public class ShopCategoryBean extends MorphiaModel<ShopCategoryBean> {
}
