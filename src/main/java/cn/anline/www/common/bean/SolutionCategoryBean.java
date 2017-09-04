package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 解决方案分类模型
 */
@Entity("solution_category")
public class SolutionCategoryBean extends MorphiaModel<SolutionCategoryBean> {
}
