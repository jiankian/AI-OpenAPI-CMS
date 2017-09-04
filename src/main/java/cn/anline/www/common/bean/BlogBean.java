package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 博客博文模型
 */
@Entity("blog")
public class BlogBean extends MorphiaModel<BlogBean> {
}
