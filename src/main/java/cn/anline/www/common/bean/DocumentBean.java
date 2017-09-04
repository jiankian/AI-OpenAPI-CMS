package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 文档模型
 */
@Entity("document")
public class DocumentBean extends MorphiaModel<DocumentBean> {

}
