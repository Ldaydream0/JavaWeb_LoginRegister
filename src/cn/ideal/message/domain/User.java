package cn.ideal.message.domain;

import java.io.Serializable;

public class User implements Serializable {
    private int uid;//用户id
    private String username;//用户名，账号
    private String password;//密码
    private String nickname;//昵称
    private String email;//邮箱
    private String telephone;//手机号
    private String gender;//男或女
    private String birthday;//出生日期
    private String status;//激活状态，Y代表激活，N代表未激活
    private String code;//激活码（要求唯一）

    public User() {
    }

    public User(int uid, String username, String password, String nickname, String email, String telephone, String gender, String birthday, String status, String code) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
        this.telephone = telephone;
        this.gender = gender;
        this.birthday = birthday;
        this.status = status;
        this.code = code;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

