package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 前台首页幻灯片模型
 */
@Entity("banner")
public class BannerBean extends MorphiaModel<BannerBean> {
}
