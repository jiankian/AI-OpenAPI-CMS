package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 博文分类模型
 */
@Entity("blog_category")
public class BlogCategoryBean extends MorphiaModel<BlogCategoryBean> {
}
