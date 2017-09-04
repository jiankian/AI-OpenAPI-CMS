package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * API模型
 */
@Entity("api")
public class APIBean extends MorphiaModel<APIBean> {
}
