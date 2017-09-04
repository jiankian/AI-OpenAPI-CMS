package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 项目模型
 */
@Entity("subject")
public class SubjectBean extends MorphiaModel<SubjectBean> {
}
