package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 用户评论模型
 */
@Entity("shop_comment")
public class ShopCommentBean extends MorphiaModel<ShopCommentBean> {
}
