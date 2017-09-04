package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 课程模型
 */
@Entity("course")
public class CourseBean extends MorphiaModel<CourseBean> {
}
