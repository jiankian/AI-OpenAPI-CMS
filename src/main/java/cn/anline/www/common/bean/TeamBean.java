package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 企业/团队模型
 */
@Entity("team")
public class TeamBean extends MorphiaModel<TeamBean> {
}
