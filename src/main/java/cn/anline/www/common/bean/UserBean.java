package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.utils.IndexDirection;

/**
 * 用户模型
 */
@Entity("user")
public class UserBean extends MorphiaModel<UserBean> {

    @Indexed(unique = true)
    public String username;
    public String password;
    public String avatar;
    public String nickname;
    public String firstname;
    public String lastname;
    public String aboutme;
    public String country;
    public String birthday;
    public String email;
    public String mobile;
    public String website;
    public String occupation;
    public String tel;
    public String company;
    public String uuid;

    public UserBean(String username, String password, String avatar, String nickname, String firstname, String lastname, String aboutme, String country, String birthday, String email, String mobile, String website, String occupation, String tel, String company, String uuid) {
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.nickname = nickname;
        this.firstname = firstname;
        this.lastname = lastname;
        this.aboutme = aboutme;
        this.country = country;
        this.birthday = birthday;
        this.email = email;
        this.mobile = mobile;
        this.website = website;
        this.occupation = occupation;
        this.tel = tel;
        this.company = company;
        this.uuid = uuid;
    }

    public UserBean() {

    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAboutme() {
        return aboutme;
    }

    public void setAboutme(String aboutme) {
        this.aboutme = aboutme;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + super._id() +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                ", nickname='" + nickname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", aboutme='" + aboutme + '\'' +
                ", country='" + country + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", website='" + website + '\'' +
                ", occupation='" + occupation + '\'' +
                ", tel='" + tel + '\'' +
                ", company='" + company + '\'' +
                ", uuid='" + uuid + '\'' +
                ", idType=" + idType +
                ", modelType=" + modelType +
                '}';
    }
}
