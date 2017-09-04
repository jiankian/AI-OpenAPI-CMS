package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 产品与服务模型
 */
@Entity("service")
public class ServiceBean extends MorphiaModel<ServiceBean> {
}
