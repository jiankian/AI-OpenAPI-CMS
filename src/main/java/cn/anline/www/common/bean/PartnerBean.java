package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 合作伙伴模型
 */
@Entity("partner")
public class PartnerBean extends MorphiaModel<PartnerBean> {
}
