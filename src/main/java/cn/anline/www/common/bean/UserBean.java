package cn.anline.www.common.bean;

import org.mongodb.morphia.annotations.Entity;

/**
 * 用户模型
 */
@Entity("user")
public class UserBean extends BaseBean {
    public String username;
}
