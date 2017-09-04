package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 财务模型
 */
@Entity("finance")
public class FinanceBean extends MorphiaModel<FinanceBean> {
}
