package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 商城商品标签模型
 */
@Entity("shop_tags")
public class ShopTagsBean extends MorphiaModel<ShopTagsBean> {
}
