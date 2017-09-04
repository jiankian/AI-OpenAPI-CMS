package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 用户模型
 */
@Entity("user")
public class UserBean extends MorphiaModel<UserBean> {
    public String username;
}
