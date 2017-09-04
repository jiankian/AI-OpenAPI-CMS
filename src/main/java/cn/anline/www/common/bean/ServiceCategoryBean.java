package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 产品与服务分类模型
 */
@Entity("service_category")
public class ServiceCategoryBean extends MorphiaModel<ServiceCategoryBean>{
}
