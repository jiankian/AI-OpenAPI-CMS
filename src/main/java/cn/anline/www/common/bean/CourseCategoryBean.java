package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 课程分类模型
 */
@Entity("course_category")
public class CourseCategoryBean extends MorphiaModel<CourseCategoryBean> {
}
